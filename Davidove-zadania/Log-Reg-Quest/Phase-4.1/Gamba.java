package DavitZadania.Zadanie4_1;

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
                        case "item", "i" -> {
                            itemList.sort(Item.comparator4);
                            for (Item idk : itemList) {
                                System.out.println(idk);
                            }
                        }
                        case "rarity", "r" -> {
                            itemList.sort(Item.comparator2);
                            for (Item idk : itemList) {
                                System.out.println(idk);
                            }
                        }
                        case "price", "p" -> {
                            itemList.sort(Item.comparator1);
                            for (Item idk : itemList) {
                                System.out.println(idk);
                            }
                        }
                        case "time", "t" -> {
                            itemList.sort(Item.comparator3);
                            for (Item idk : itemList) {
                                System.out.println(idk);
                            }
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
}
