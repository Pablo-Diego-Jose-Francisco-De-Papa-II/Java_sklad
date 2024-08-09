public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hour = 0;
        int min = 0;
        int sec = 0;

        if (seconds > 359999) {
            return "Too big!";
        }

        while (seconds > 0) {
            if (seconds >= 3600) {
                seconds -= 3600;
                hour += 1;

            } else if (seconds >= 60) {
                seconds -= 60;
                min += 1;

            } else {
                seconds -= 1;
                sec += 1;
            }
        }

        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(359999));
    }
}
