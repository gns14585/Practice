package P97homePractice.p01_p20.Practice1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        while(true) {
            int month = sc.nextInt();

            if (month > 12) {
                System.out.println("다시 입력해주시기 바랍니다.");
            }

            switch (month) {
                case 3, 4, 5 -> {
                    System.out.println("현재 계절은 봄 입니다.");
                    break;
                }
                case 6, 7, 8, 9 -> {
                    System.out.println("현재 계절은 여름 입니다.");
                    break;
                }
                case 10, 11 -> {
                    System.out.println("현재 계절은 가을 입니다.");
                    break;
                }
                case 12, 1, 2 -> {
                    System.out.println("현재 계절은 겨울 입니다.");
                    break;
                }
            }
            System.out.println("다시 이용 하시겠습니까? (y/n)");
            String yn = sc.next();
            if (yn.equals("y")) {
                System.out.println("현재 월을 입력해주세요.");
                continue;

            } else if (yn.equals("n")) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }

        }

    }
}
