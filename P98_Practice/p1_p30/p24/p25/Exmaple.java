package P98_Practice.p1_p30.p24.p25;

import java.util.Arrays;
import java.util.List;

public class Exmaple {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동" , "개발자"),
                new Member("이정훈", "디자이너"),
                new Member("박채은", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .toList();
        developers.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
