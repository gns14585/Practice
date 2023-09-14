package P97homePractice.p01_p20.Practice1;

public class Conditional {
    public static void main(String[] args) {

        int x = 0;
        char ch = ' ';
        String str = null;
        // 정수 x가 90이상 100 이하일때
        if (90 <= x && x <= 100) {}

        // 정수 x가 0보다 작거나 100보다 클때
        if (0 > x || x > 100) {}

        // 정수 x가 3의 배수지만, 2의 배수는 아닐때
        if (x % 3 == 0 && x % 2 != 0) {}

        // 문자 ch가 'y'또는 'Y'일때
        if (ch == 'y' || ch == 'Y') {}

        // 문자 ch가 공백이거나 탭 또는 개행 문자일때
        if (ch == ' ' || ch == '\t' || ch == '\n') {}

        // 문자 ch가 대문자일때
        if (ch >= 'A' && ch <= 'Z') {}

        // 문자 ch가 소문자일때
        if (ch >= 'a' && ch <= 'z') {}

        // 문자 ch가 숫자일때
        if (ch >= '0' && ch <= '9') {}

        // 문자열 str의 내용이 "yes"일 때 (대소문자 구분)
        if (str.equals("yes")) {}

        // 문자열 str의 내용이 "yes"일 때 (대소문자 구분안함)
        if (str.equalsIgnoreCase("yes")) {}
    }
}
