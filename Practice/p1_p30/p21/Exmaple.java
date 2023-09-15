package Practice.p1_p30.p21;

import java.util.Arrays;
import java.util.List;

public class Exmaple {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );

        double avg = list.stream()
                .map(Member::getAge)
                .reduce(0, (x,y) -> x+y);
        System.out.println("평균 나이 : " + avg/list.size());


        // 제일 많은 나이
        double maxage = list.stream()
                .map(Member::getAge)
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max 나이 : " + maxage);

        //제일 적은 나이
        double minage = list.stream()
                .map(Member::getAge)
                .reduce(Integer.MAX_VALUE,Math::min);
        System.out.println("min 나이 : "   + minage);



    }
}
