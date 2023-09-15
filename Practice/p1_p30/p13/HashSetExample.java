package Practice.p1_p30.p13;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("spring");
        set.add("java");
        set.add("Java");

        System.out.println(set.size());
    }
}
