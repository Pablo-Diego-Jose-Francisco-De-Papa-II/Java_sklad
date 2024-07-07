package DavitZadania.Zadanie4_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Comparator;

import static DavitZadania.Zadanie4_1.Rarity.*;


public class Item {
    String item;
    Rarity rarity;
    int price;
    String time;


    static final Random rand = new Random();
    final int randomNum = rand.nextInt(100) + 1;
    static final DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");


    public Item() {
        this.item = Rarity.ALL_ITEMS[rand.nextInt(Rarity.ALL_ITEMS.length)];
        this.rarity = getRandomRarity();
        this.price = (int) (rarity.value * randomNum);
        this.time = LocalTime.now().format(myFormatObj);
    }


    @Override
    public String toString() {
        return rarity + " " + item + " " + price + " coins " + time;
    }


    Rarity getRandomRarity() {
        for (Rarity r : values()) {
            if (randomNum <= r.chance) {
                return r;
            }
        }
        return COMMON;
    }


    static Comparator<Item> itemComparator = (i1, i2) -> i1.item.compareToIgnoreCase(i2.item);
    static Comparator<Item> rarityComparator = Comparator.comparingInt(i -> Integer.parseInt(i.item));
    static Comparator<Item> priceComparator = Comparator.comparingInt(i -> i.price);
    static Comparator<Item> timeComparator = Comparator.comparing(i -> i.time);
}
