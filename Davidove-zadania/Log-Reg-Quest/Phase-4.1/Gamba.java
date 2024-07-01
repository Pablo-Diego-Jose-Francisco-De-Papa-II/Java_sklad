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
                        case "item", "i" -> System.out.println("idkItem");
                        case "rarity", "r" -> System.out.println("idk1");
                        case "price", "p" -> {
                            itemList.sort(new Sort());
                            for (Item idk : itemList) {
                                System.out.println(idk);
                            }
                        }
                        case "time", "t" -> System.out.println("idk3");
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
