package P97homePractice.p01_p20.Practice20;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(30000);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
