package DavitZadania.Zadanie4_1;

import static DavitZadania.Zadanie4_1.Items.*;

import java.util.Scanner;


public class Gamba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            switch (input.nextLine()) {
                case "inv" -> System.out.print("shows inv frfr");
                case "end" -> { return; }
                case "" -> gamble();
            }
        }
    }


    static void gamble() {
        Items Item = new Items(getRandomItem(), getRandomRarity(), getRandomPrice());
        System.out.println("Unlocked " + Item.rarity + " rarity item (" + Item.item + ") and It's worth " + Item.price + " coins!");
    }
}
