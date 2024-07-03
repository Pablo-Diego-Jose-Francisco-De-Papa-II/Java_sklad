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
                            itemList.sort(Item.comparator4);
                            choice();
                        }
                        case "rarity", "r" -> {
                            itemList.sort(Item.comparator2);
                            choice();
                        }
                        case "price", "p" -> {
                            itemList.sort(Item.comparator1);
                            choice();
                        }
                        case "time", "t" -> {
                            itemList.sort(Item.comparator3);
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
        if (printInReverse) {
            helpReversed();
        } else {
            helpNormal();
        }
    }

    public static void helpNormal() {
        for (Item idk : itemList) {
            System.out.println(idk);
        }
        printInReverse = true;
    }

    public static void helpReversed() {
        System.out.println("reversed");
        for (Item idk : itemList.reversed()) {
            System.out.println(idk);
        }
        printInReverse = false;
    }
}
