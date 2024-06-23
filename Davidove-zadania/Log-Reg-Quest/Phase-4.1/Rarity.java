package DavitZadania.Zadanie4_1;


import java.util.Random;

public enum Rarity {
    COMMON(1),
    UNCOMMON(1.3),
    RARE(1.9),
    EPIC(2.5),
    LEGENDARY(3.3),
    MYTHIC(new Random().nextInt(500, 1001));


    final double multiplication;
    Rarity(double value) {
        this.multiplication = value;
    }


    static String item;
    static final String[] allItems = {"Pallerovej moč", "Ing. titul", "Brianrot", "RTX 4090", "Femboy", "Filament",
            "Hyperion", "Davitov freetime", "Priepustka z chemickej", "Sranie allowance", "Mayove vayo"};

    static void itemPicker() {
        item = allItems[new Random().nextInt(allItems.length)];
    }
}
