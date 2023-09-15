package Practice.p1_p30.p4;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Tv를 켭니다.");
        }


    };

    void use1() {
        rc.turnOn();

    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }


        };
        rc.turnOn();

    }

    public void use3(RemoteControl rc) {
        rc.turnOn();

    }


}
