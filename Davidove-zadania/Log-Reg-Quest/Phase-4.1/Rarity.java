    package DavitZadania.Zadanie4_1;


    import java.util.Random;

    public enum Rarity {
        COMMON(1, 34),
        UNCOMMON(1.3, 59),
        RARE(1.9, 84),
        EPIC(2.5, 94),
        LEGENDARY(3.3, 99),
        MYTHIC(new Random().nextInt(500, 1001), 100);


        final int chance;
        final double value;
        Rarity(double value, int chance) {
            this.chance = chance;
            this.value = value;
        }

        static String item;
        static final String[] allItems = {"Pallerovej moč", "Ing. titul", "Brianrot", "RTX 4090", "Femboy", "Filament",
                "Hyperion", "Davitov freetime", "Priepustka z chemickej", "Sranie allowance", "Mayove vayo"};

        static void itemPicker() {
            item = allItems[new Random().nextInt(allItems.length)];
        }


        static Rarity rarity;
        static int price;
        static void rarityPricePicker() {
            final int randomNum = new Random().nextInt(100) + 1;

            for (Rarity r : values()) {
                if (randomNum <= r.chance) {
                    rarity = r;
                    price = (int)(randomNum * r.value);
                    break;
                }
            }
        }
    }
