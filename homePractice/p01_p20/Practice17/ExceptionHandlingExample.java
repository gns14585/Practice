package homePractice.p01_p20.Practice17;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.valueOf(array[i]);
                System.out.println("array [ " + i + " ] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과");
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가");
            }
        }
    }
}
