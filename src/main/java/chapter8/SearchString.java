package chapter8;

public class SearchString {

    public static void main(String[] args) {

        // 문자열 검색 브루트-포스트 법
        String s = "AB자바CDE자바FG자바HIJ자바";
        System.out.println(s.indexOf("자바"));
        System.out.println(s.lastIndexOf("자바"));
        System.out.println(s.indexOf("자바", 9));

    }
}
