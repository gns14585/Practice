package P98_Practice.p1_p30.p29;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("홍길동", "남", 35));
        list.add(new Member("박채은", "여", 25));
        list.add(new Member("민하연", "여", 26));
        list.add(new Member("이정훈", "남", 29));
        list.add(new Member("박민정", "여", 26));
        list.add(new Member("이동진", "남", 29));

        // 남자만 출력
        list.stream()
                .filter(e -> e.getSex().equals("남"))
                .forEach(s -> System.out.println(s.getName() + " : " + s.getSex() + " : " + s.getAge()));

        System.out.println();

        // 여자만 출력
        list.stream()
                .filter(e -> e.getSex().equals("여"))
                .forEach(s -> System.out.println(s.getName() + " : " + s.getSex() + " : " + s.getAge()));

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        s -> s.getName(),
                        s -> s.getAge()
                )
                );
        System.out.println(map);
    }
}
