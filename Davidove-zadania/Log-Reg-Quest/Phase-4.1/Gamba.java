package DavitZadania.Zadanie4_1;

import java.util.Scanner;

import static DavitZadania.Zadanie4_1.Rarity.*;


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
        rarityPricePicker();
        itemPicker();
        System.out.println("Unlocked " + rarity + " rarity item (" + item + ") and It's worth " + price + " coins!");
    }
}
