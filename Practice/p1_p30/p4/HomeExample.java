package Practice.p1_p30.p4;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();

        home.use1();
        home.use2();
        home.use3(() -> System.out.println("난방을 켭니다."));
    }
}
