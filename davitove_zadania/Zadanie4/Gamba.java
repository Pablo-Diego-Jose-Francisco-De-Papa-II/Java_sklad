package DavitZadania.Zadanie4_1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class Gamba {
    static ArrayList<Item> itemList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            switch (input.nextLine()) {
                case "inv" -> {
                    switch (input.nextLine()) {
                        case "item", "i" -> choice(Item.itemComparator);
                        case "rarity", "r" -> choice(Item.rarityComparator);
                        case "price", "p" -> choice(Item.priceComparator);
                        case "time", "t" -> choice(Item.timeComparator);
                    }
                }
                case "end" -> { return; }
                case "" -> gamble();
            }
        }
    }


    static void gamble() {
        Item item = new Item();

        itemList.add(item);
        System.out.println("Unlocked " + item.rarity + " rarity item (" + item.item + ") and It's worth " + item.price + " coins!");
    }


    public static void choice(Comparator<Item> sort) {
        itemList.sort(sort);
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}
