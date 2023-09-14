package P98_Practice.p31_p60.p34;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("이정훈", "개발자"),
                new Member("박채은", "디자이너"),
                new Member("민하연", "디자이너")
        );


        list.stream()
                .filter(e -> e.getJob().equals("개발자"))
                .forEach(e -> System.out.println(e.getName()));


    }
}
