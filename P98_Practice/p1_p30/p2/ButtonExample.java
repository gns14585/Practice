package P98_Practice.p1_p30.p2;

public class ButtonExample {
    public static void main(String[] args) {
        Button okBtn = new Button();
        Button cancelBtn = new Button();

        okBtn.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭");
            }
        });

        cancelBtn.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("cancel 버튼을 클릭");
            }
        });

        okBtn.click();
        cancelBtn.click();
    }
}
