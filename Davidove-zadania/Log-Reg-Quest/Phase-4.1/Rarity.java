package DavitZadania.Zadanie4_1;


import java.util.Random;

public enum Rarity {
    COMMON(1, new String[]{"Pallerovej čajík", "Ing. titul"}),
    UNCOMMON(1.3, new String[]{"Brianrot", "RTX 4090"}),
    RARE(1.9, new String[]{"Femboy", "Filament"}),
    EPIC(2.5, new String[]{"Hyperion", "Davitov freetime"}),
    LEGENDARY(3.3, new String[]{"Cum sock", "Nezvladam to"}),
    MYTHIC(generateMultiplication(), new String[]{"Priepustka z chemickej", "Sranie allowance", "Mayove vayo"});


    double multiplication;
    String[] itemName;
    Rarity(double value, String[] array) {
        this.multiplication = value;
        this.itemName = array;
    }


    static int generateMultiplication() {
        Random random = new Random();
        return random.nextInt(500, 1001);
    }
}
