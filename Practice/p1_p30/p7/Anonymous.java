package Practice.p1_p30.p7;

public class Anonymous {
    Vehicle vehicle = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    public void run1() {
        vehicle.run();
    }

    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        localVar.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
