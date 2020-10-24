package chapter8;

public class SearchString {

    public static void main(String[] args) {
        // 문자열 검색 KMP법
        String originalText = "ZABCABXACCADEFABCABD";
        String patternText = "ABCABD";
        int index = kmpMatch(originalText, patternText);
        printMatch(originalText, patternText, index);

        // Boyer-Moore법
        index = 0;
        index = bmMatch(originalText, patternText);
        printMatch(originalText, patternText, index);

    }

    public static String printMatch(String originalText, String patternText, int index) {
        if (index == -1) {
            return "텍스트에 패턴이 없습니다.";
        }
        int length = 0;
        for (int i = 0; i < index; i++)
            length += originalText.substring(i, i + 1).getBytes().length;
        length += patternText.length();
        return (index + 1) + "번째 문자와 일치합니다.";
    }

    public static int kmpMatch(String txt, String pattern) {
        int pointTxt = 1;
        int pointPattern = 0;
        int[] skip = new int[pattern.length() + 1];

        skip[pointTxt] = 0;
        while (pointTxt != pattern.length()) {
            if (pattern.charAt(pointTxt) == pattern.charAt(pointPattern)) {
                skip[++pointTxt] = ++pointPattern;
            } else if (pointPattern == 0) {
                skip[++pointTxt] = pointPattern;
            } else {
                pointPattern = skip[pointPattern];
            }
        }

        pointTxt = pointPattern = 0;
        while (pointTxt != txt.length() && pointPattern != pattern.length()) {
            if (txt.charAt(pointTxt) == pattern.charAt(pointPattern)) {
                pointTxt++;
                pointPattern++;
            } else if (pointPattern == 0) {
                pointTxt++;
            } else {
                pointPattern = skip[pointPattern];
            }

            if (pointPattern == pattern.length()) {
                return pointTxt - pointPattern;
            }
        }
        return -1;
    }

    public static int bmMatch(String txt, String pat) {
        int pointTxt;
        int pointPattern;
        int txtLength = txt.length();
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE + 1];

        for (pointTxt = 0; pointTxt <= Character.MAX_VALUE; pointTxt++) {
            skip[pointTxt] = patLen;
        }
        for (pointTxt = 0; pointTxt < patLen - 1; pointTxt++) {
            skip[pat.charAt(pointTxt)] = patLen - pointTxt - 1;
        }

        while (pointTxt < txtLength) {
            pointPattern = patLen - 1;
            while (txt.charAt(pointTxt) == pat.charAt(pointPattern)) {
                if (pointPattern == 0)
                    return pointTxt;
                pointPattern--;
                pointTxt--;
            }
            pointTxt += (skip[txt.charAt(pointTxt)] > patLen - pointPattern) ? skip[txt.charAt(pointTxt)] : patLen - pointPattern;
        }
        return -1;
    }

}
