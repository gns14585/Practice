package P98_Practice.p1_p30.p26;

public class Example {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남으신 잔액은 " + b.money + "만원 입니다.");
        System.out.println("현재 남으신 보너스포인트는 " + b.bonusPoint + "점 입니다.");
    }
}
