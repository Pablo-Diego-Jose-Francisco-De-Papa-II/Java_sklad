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

        Rarity.rarity idk = null;
        if (randomNum < 35) {
            idk = Rarity.rarity.COMMON;
        } else if (randomNum < 60) {
            idk = Rarity.rarity.UNCOMMON;
        } else if (randomNum < 85) {
            idk = Rarity.rarity.RARE;
        } else if (randomNum < 95) {
            idk = Rarity.rarity.EPIC;
        } else if (randomNum < 100) {
            idk = Rarity.rarity.LEGENDARY;
        } else if (randomNum == 100) {
            idk = Rarity.rarity.MYTHIC;
        }
        
        System.out.println(randomNum + " " + idk);
    }
}
