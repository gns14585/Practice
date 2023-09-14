package P97homePractice.p01_p20.Practice18;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo", null, "200"};

        for (int i = 0; i <= arr.length; i++) {
            try {
                int value = Integer.valueOf(arr[i]);
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열인덱스 초과");
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("데이터에 문제 있음");
            }
        }
    }
}
