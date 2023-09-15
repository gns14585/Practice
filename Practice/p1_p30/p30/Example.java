package Practice.p1_p30.p30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("이정훈", "개발자"));
        list.add(new Member("이다희", "개발자"));
        list.add(new Member("박채은", "디자이너"));
        list.add(new Member("민하연", "디자이너"));
        list.add(new Member("박민정", "개발자"));
        list.add(new Member("전은혜", "개발자"));


        System.out.println("[개발자]");
        list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .forEach(s -> System.out.println(s.getName() + " : " + s.getJob()));

        System.out.println();

        System.out.println("[디자이너]");
        list.stream()
                .filter(e -> e.getJob().equals("디자이너"))
                .forEach(s -> System.out.println(s.getName() + " : " + s.getJob()));

        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(
                        s -> s.getName(),
                        s -> s.getJob()
                ));
        System.out.println(map);
    }
}
