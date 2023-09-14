package P98_Practice.p1_p30.p28;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("홍길동", 35));
        list.add(new Member("이정훈", 29));
        list.add(new Member("박채은", 26));
        list.add(new Member("박민정", 26));
        list.add(new Member("민하연", 25));

        Integer reduce = list.stream()
                .map(Member::getAge)
                .reduce(0, (x, y) -> x + y);
        System.out.println("평균 나이 : " + reduce/list.size());




    }
}
