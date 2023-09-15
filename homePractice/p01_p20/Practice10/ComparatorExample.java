package homePractice.p01_p20.Practice10;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
