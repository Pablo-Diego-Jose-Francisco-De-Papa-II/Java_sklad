public class WhatCentury {
    public static String whatCentury(int year)  {
        String century = String.valueOf((year % 100 == 0) ? year/ 100 : year/ 100 + 1);
        int index = century.charAt(century.length() - 1) - 48;
        String[] suffix = {"st", "nd", "rd", "th"};

        if (Integer.parseInt(century) < 10 || Integer.parseInt(century) > 20 && index <= 3 && index != 0) {
            return century + suffix[index - 1];
        } else {
            return century + suffix[3];
        }
    }

    public static void main(String[] args) {
        System.out.println(whatCentury(200));
    }
}
