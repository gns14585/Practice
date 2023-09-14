package P98_Practice.p1_p30.p1;

public class C1 {
    public static void main(String[] args) {
        // 02-305-8183
        // 023058183
        // 010-3613-8304
        // 01036138304
        String a = "\\d{2,3}-?\\d{3,4}-?\\d{3,4}";
        String b = a;
        System.out.println("01036138304".matches(a));
        System.out.println("010-3613-8304".matches(a));
        System.out.println("023058183".matches(a));
        System.out.println("02-305-8183".matches(a));


        String e = "[a-z\\d]+@[a-z\\d]+\\.[a-zA-Z]*";
        String c = e;
        System.out.println("gns14585@naver.com".matches(c));
    }
}
