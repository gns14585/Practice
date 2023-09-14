package P97homePractice.p01_p20.Practice1;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        System.out.println("학생의 점수를 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        char opt = 'D';
        char ot = '0';
        while (true) {
            int score = sc.nextInt();
            if (score >= 90) {
                opt = 'A';
                if (score >= 98) {
                    ot = '+';
                } else if (score <= 94) {
                    ot = '-';
                }
            } else if (score >= 80) {
                opt = 'B';
                if (score >= 88) {
                    ot = '+';
                } else if (score <= 84) {
                    ot = '-';
                }
            } else if (score > 70) {
                opt = 'C';
                if (score >= 78) {
                    ot = '+';
                } else if (score <= 74) {
                    ot = '-';
                }
            }
            System.out.println("학생의 학점은 " + opt + ot + " 입니다.");

            System.out.println("다시 이용 하시겠습니까? (y/n)");
            String yn = sc.next();
            if (yn.equals("y")) {
                System.out.println("학생의 점수를 입력해주세요.");
                continue;
            } else if (yn.equals("n")) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
    }
}
