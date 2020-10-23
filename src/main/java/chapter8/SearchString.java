package chapter8;

public class SearchString {

    public static void main(String[] args) {

        // 문자열 검색 브루트-포스트 법
        String s = "AB자바CDE자바FG자바HIJ자바";
//        System.out.println(s.indexOf("자바"));
//        System.out.println(s.lastIndexOf("자바"));
//        System.out.println(s.indexOf("자바", 9));

        // 문자열 검색 KMP법
        String s1 = "ZABCABXACCADEFABCABD";
        String s2 = "ABCABD";
        int index = kmpMatch(s1, s2);
        if (index == -1)
            System.out.println("텍스트에 패턴이 없습니다.");
        if (index != -1){
            int len = 0;
            for (int i = 0; i < index; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();
            System.out.println((index + 1) + "번째 문자와 일치합니다.");
        }


    }

    private static int kmpMatch(String txt, String pattern) {
        int pointTxt = 1;
        int pointPattern = 0;
        int[] skip = new int[pattern.length() + 1];

        skip[pointTxt] = 0;
        while (pointTxt != pattern.length()) {
            if (pattern.charAt(pointTxt) == pattern.charAt(pointPattern))
                skip[++pointTxt] = ++pointPattern;
            else if (pointPattern == 0)
                skip[++pointTxt] = pointPattern;
            else
                pointPattern = skip[pointPattern];
        }

        pointTxt = pointPattern = 0;
        while (pointTxt != txt.length() && pointPattern != pattern.length()) {
            if (txt.charAt(pointTxt) == pattern.charAt(pointPattern)) {
                pointTxt++;
                pointPattern++;
            } else if (pointPattern == 0)
                pointTxt++;
            else
                pointPattern = skip[pointPattern];
        }

        if (pointPattern == pattern.length())
            return pointTxt - pointPattern;
        return -1;
    }

}