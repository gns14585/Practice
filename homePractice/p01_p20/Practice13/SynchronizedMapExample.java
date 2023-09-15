package homePractice.p01_p20.Practice13;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread theradA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 2000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        theradA.start();
        threadB.start();

        try {
            theradA.join();
            threadB.join();
        } catch (Exception e) {

        }

        int size = map.size();
        System.out.println("총 객체 수  : " + size);
        System.out.println();
    }
}
