package homePractice.p01_p20.Practice10;

import java.util.Comparator;

public class Fruit implements Comparator<Fruit> {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price < o2.price) return -1;
        else if (o1.price == o2.price) return 0;
        else return 1;
    }
}
