package P98_Practice.p1_p30.p19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("김길동", 35));
        set.add(new Member("이동진", 29));
        set.add(new Member("이정훈", 29));
        set.add(new Member("박채은", 25));

        System.out.println(set.size());

        Iterator<Member> iterator = set.iterator();
        while (iterator.hasNext()) {
            Member element = iterator.next();
            System.out.println(element.name + " : " + element.age);
            if (element.name.equals("홍길동")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove(new Member("이동진", 29));

        for (Member a : set) {
            System.out.println(a.name + " : " + a.age);
        }
    }
}
