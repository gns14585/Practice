package Practice.p1_p30.p3;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.run1();
        c.run2();
        c.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });
    }
}
