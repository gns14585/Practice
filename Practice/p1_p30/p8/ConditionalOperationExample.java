package Practice.p1_p30.p8;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 95;
        char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.println(score + "점은 " + grade + "등급 입니다.");
    }
}
