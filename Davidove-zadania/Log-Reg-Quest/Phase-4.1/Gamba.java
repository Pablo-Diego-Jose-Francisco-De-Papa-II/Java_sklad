package DavitZadania.Zadanie4_1;

import java.util.Scanner;
import java.util.Random;


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
        System.out.println("Unlocked " + rarity + " rarity item and It's worth " + price + " coins!");
    }


    static void rarityPricePicker() {
        if (randomNum < 35) {
            rarity = Rarity.COMMON;
            price = randomNum;
        }
        else if (randomNum < 60) {
            rarity = Rarity.UNCOMMON;
            price = (int)Math.round(randomNum * 1.3);
        }
        else if (randomNum < 85) {
            rarity = Rarity.RARE;
            price = (int)Math.round(randomNum * 1.9);
        }
        else if (randomNum < 95) {
            rarity = Rarity.EPIC;
            price = (int)Math.round(randomNum * 2.5);
        }
        else if (randomNum < 100) {
            rarity = Rarity.LEGENDARY;
            price = (int)Math.round(randomNum * 3.3);
        }
        else if (randomNum == 100) {
            rarity = Rarity.MYTHIC;
            price = random.nextInt(500, 1001);
        }
    }
}
