package DavitZadania.Zadanie4_1;

import java.util.Random;

import static DavitZadania.Zadanie4_1.Rarity.*;


public class Item {
    String item;
    Rarity rarity;
    int price;

    
    static final Random rand = new Random();
    final int randomNum = rand.nextInt(100) + 1;

    
    public Item() {
        this.item = getRandomItem();
        this.rarity = getRandomRarity();
        this.price = getRandomPrice();
    }
    

    public String getRandomItem() {
        return Rarity.ALL_ITEMS[rand.nextInt(Rarity.ALL_ITEMS.length)];
    }


    Rarity getRandomRarity() {
        for (Rarity r : values()) {
            if (randomNum <= r.chance) {
                return r;
            }
        }
        return COMMON;
    }

    
    int getRandomPrice() {
        for (Rarity r : values()) {
            if (randomNum <= r.chance) {
                return (int)(randomNum * r.value);
            }
        }
        return 1;
    }
}
