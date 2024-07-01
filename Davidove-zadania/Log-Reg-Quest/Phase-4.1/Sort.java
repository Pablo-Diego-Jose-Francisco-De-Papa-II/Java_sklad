package DavitZadania.Zadanie4_1;

import java.util.Comparator;


public class Sort implements Comparator<Item> {
    public int compare(Item i1, Item i2) {
        return Integer.compare(i1.getRandomPrice(), i2.getRandomPrice());
    }
}
