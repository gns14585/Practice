package P98_Practice.p1_p30.p7;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.run1();
        anony.method1();
        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });
    }
}
