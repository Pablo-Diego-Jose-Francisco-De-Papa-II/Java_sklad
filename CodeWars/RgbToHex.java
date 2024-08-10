public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        String sixteens;
        String ones;
        StringBuilder channel = new StringBuilder();

        for (int num : new int[] {r, g, b}) {
            if (num > 255) {
                num = 255;
            } else if (num < 0) {
                num = 0;
            }

            sixteens = Integer.toString(num / 16, 16).toUpperCase();
            ones = Integer.toString(num % 16, 16).toUpperCase();

            channel.append(sixteens).append(ones);
        }

        return channel.toString();
    }

    public static void main(String[] args) {
        System.out.println(rgb(200,255,255));
    }
}
