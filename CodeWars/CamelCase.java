class CamelCase {
    static String toCamelCase(String s) {
        String[] array = s.split("[-_]");
        StringBuilder camelCased = new StringBuilder(array[0]);

        for (int i = 1; i < array.length; i++) {
            camelCased.append(array[i].substring(0, 1).toUpperCase()).append(array[i].substring(1));
        }

        return camelCased.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth_warrior"));
    }
}
