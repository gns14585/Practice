package homePractice.p01_p20.Practice16;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
