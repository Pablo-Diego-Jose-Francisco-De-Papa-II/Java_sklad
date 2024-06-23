package DavitZadania.Zadanie4_1;

import java.util.Scanner;
import java.util.Random;

import static DavitZadania.Zadanie4_1.Rarity.item;
import static DavitZadania.Zadanie4_1.Rarity.itemPicker;


public class Gamba {
    static Random random = new Random();
    static int randomNum;
    static Rarity rarity;
    static int price;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            switch (input.nextLine()) {
                case "inv" -> System.out.print("shows inv frfr");
                case "" -> gamble();
            }
        }
    }


    static void gamble() {
        randomNum = random.nextInt(100) + 1;

        rarityPricePicker();
        itemPicker();
        System.out.println("Unlocked " + rarity + " rarity item (" + item + ") and It's worth " + price + " coins!");
    }


    static void rarityPricePicker() {
        if (randomNum < 35) {
            rarity = Rarity.COMMON;
            price = randomNum;
        }
        else if (randomNum < 60) {
            rarity = Rarity.UNCOMMON;
            price = (int)Math.round(randomNum * Rarity.UNCOMMON.multiplication);
        }
        else if (randomNum < 85) {
            rarity = Rarity.RARE;
            price = (int)Math.round(randomNum * Rarity.RARE.multiplication);
        }
        else if (randomNum < 95) {
            rarity = Rarity.EPIC;
            price = (int)Math.round(randomNum * Rarity.EPIC.multiplication);
        }
        else if (randomNum < 100) {
            rarity = Rarity.LEGENDARY;
            price = (int)Math.round(randomNum * Rarity.LEGENDARY.multiplication);
        }
        else if (randomNum == 100) {
            rarity = Rarity.MYTHIC;
            price = (int)Rarity.MYTHIC.multiplication;
        }
    }
}
