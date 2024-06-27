package DavitZadania.Zadanie4_1;

import java.util.Random;

import static DavitZadania.Zadanie4_1.Rarity.*;


public class Items {
    String item;
    Rarity rarity;


    public Items(String pickedItem, Rarity pickedRarity) {
        this.item = pickedItem;
        this.rarity = pickedRarity;
    }


    static Random rand = new Random();
    public static String getRandomItem() {
        return ALL_ITEMS[rand.nextInt(Rarity.ALL_ITEMS.length)];
    }


    static Rarity getRandomRarity() {
        final int randomNum = rand.nextInt(100) + 1;

        for (Rarity r : values()) {
            if (randomNum <= r.chance) {
                return r;
            }
        }
        return COMMON;
    }
}
