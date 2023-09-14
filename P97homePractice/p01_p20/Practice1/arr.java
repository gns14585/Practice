package P97homePractice.p01_p20.Practice1;

public class arr {
    public static void main(String[] args) {

        int[] arr = {9, 30, 45, 59, 75};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
