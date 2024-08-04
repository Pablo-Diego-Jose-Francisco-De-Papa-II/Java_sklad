public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder piggedStr = new StringBuilder();
        char firstChar;

        for (String idk : str.split(" ")) {
            firstChar = idk.charAt(0);

            if (Character.isLetter(firstChar)) {
                piggedStr.append(idk.substring(1)).append(firstChar).append("ay ");
            } else {
                piggedStr.append(idk);
            }
        }

        return piggedStr.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Help me someone"));
    }
}
