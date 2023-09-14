package P98_Practice.p31_p60.p34;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("이정훈", "개발자"),
                new Member("박채은", "디자이너"),
                new Member("민하연", "디자이너")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getName()));

        System.out.println("[개발자]");
        List<Member> dev = groupingMap.get("개발자");
        list.stream()
                .filter(e -> e.getJob().equals("개발자"))
                .forEach(e -> System.out.println(e));

        System.out.println("[디자이너]");
        List<Member> dis = groupingMap.get("디자이너");
        list.stream()
                .filter(e -> e.getJob().equals("디자이너"))
                .forEach(e -> System.out.println(e));

        System.out.println();
    }
}
