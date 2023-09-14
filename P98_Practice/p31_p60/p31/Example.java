package P98_Practice.p31_p60.p31;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("이정훈", "남", 29));
        list.add(new Member("박채은", "여", 32));
        list.add(new Member("민하연", "여", 24));
        list.add(new Member("박민정", "여", 26));
        list.add(new Member("이동진", "남", 45));

        Map<String, List<Member>> collect = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getSex()
                ));

        System.out.println("남자만 출력 방법 1");
        List<Member> maleList = collect.get("남");
        maleList.stream()
                .forEach(s -> System.out.println(s.getName() + " : " + s.getSex()));

        System.out.println();

        System.out.println("여자만 출력 방법 1");
        List<Member> maleList2 = collect.get("여");
        maleList2.stream()
                .forEach(s -> System.out.println(s.getName() + " : " + s.getSex()));

        System.out.println();

        System.out.println("남자만 출력 방법 2");
        list.stream()
                .filter(e -> e.getSex().equals("남"))
                .forEach(s -> System.out.println(s.getName() + " : " + s.getSex()));
    }
}
