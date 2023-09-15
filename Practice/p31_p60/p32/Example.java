package Practice.p31_p60.p32;

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

        Map<String, Double> map = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getSex(),
                        Collectors.averagingDouble(s -> s.getAge())
                ));
        System.out.println(map);
    }
}
