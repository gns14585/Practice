package Practice.p31_p60.p41;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String n = iterator.next();
            System.out.println(n);
            if (n.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("Spring");

        for (String m : set) {
            System.out.println(m);
        }
    }
}
