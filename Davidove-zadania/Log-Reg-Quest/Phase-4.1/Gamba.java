package DavitZadania.Zadanie4_1;

import java.util.Scanner;
import java.util.ArrayList;


public class Gamba {
    static ArrayList<Item> itemList = new ArrayList<>();
    static boolean printInReverse = false;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            switch (input.nextLine()) {
                case "inv" -> {
                    switch (input.nextLine()) {
                        case "item", "i" -> {
                            itemList.sort(Item.itemComparator);
                            choice();
                        }
                        case "rarity", "r" -> {
                            itemList.sort(Item.rarityComparator);
                            choice();
                        }
                        case "price", "p" -> {
                            itemList.sort(Item.priceComparator);
                            choice();
                        }
                        case "time", "t" -> {
                            itemList.sort(Item.timeComparator);
                            choice();
                        }
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


    public static void choice() {
        if (!printInReverse) {
            for (Item idk : itemList) {
                System.out.println(idk);
            }
            printInReverse = true;
        } else {
            for (Item idk : itemList.reversed()) {
                System.out.println(idk);
            }
            printInReverse = false;
        }
    }
}
