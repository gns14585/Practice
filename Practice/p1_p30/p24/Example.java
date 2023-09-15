package Practice.p1_p30.p24;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("이동진", 40),
                new Member("이정훈", 26)
        );

        double avg = list.stream()
                .map(Member::getAge)
                .reduce(0, (x,y) -> x+y);
        System.out.println("평균 나이 : " + avg/list.size());

    }
}
