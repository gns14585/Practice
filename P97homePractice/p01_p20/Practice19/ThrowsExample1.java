package P97homePractice.p01_p20.Practice19;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리");
            e.printStackTrace();
        }
    }

    public static void method1() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
