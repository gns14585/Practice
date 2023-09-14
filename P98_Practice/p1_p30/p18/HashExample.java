package P98_Practice.p1_p30.p18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("spring");
        set.add("JDBC");
        set.add("JSP");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            if (element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");
        set.remove("spring");

        for (String element : set) {
            System.out.println(element);
        }
    }
}
