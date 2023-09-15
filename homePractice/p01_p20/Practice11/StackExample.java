package homePractice.p01_p20.Practice11;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(3000));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println(coin.getValue() + "원");
        }
    }
}
