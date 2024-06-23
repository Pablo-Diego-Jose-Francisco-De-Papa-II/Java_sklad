package DavitZadania.Zadanie4_1;

import java.util.Scanner;
import java.util.Random;

public class GAMBA {
    static Random random = new Random();

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
        int randomNum = random.nextInt(0,101);

        Rarity.rarity rarity = null;
        if (randomNum < 35) {
            rarity = Rarity.rarity.COMMON;
        } else if (randomNum < 60) {
            rarity = Rarity.rarity.UNCOMMON;
        } else if (randomNum < 85) {
            rarity = Rarity.rarity.RARE;
        } else if (randomNum < 95) {
            rarity = Rarity.rarity.EPIC;
        } else if (randomNum < 100) {
            rarity = Rarity.rarity.LEGENDARY;
        } else if (randomNum == 100) {
            rarity = Rarity.rarity.MYTHIC;
        }

        System.out.println(randomNum + " " + rarity);
    }
}
