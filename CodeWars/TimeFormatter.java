public class TimeFormatter {
    public static String formatDuration(int seconds) {
        StringBuilder str = new StringBuilder();

        if (seconds < 0) {
            return "negative integer!";
        }

        if (seconds == 0) {
            return "now";
        }

        int year = seconds / 31536000;
        if (year != 0) {
            str.append(year).append(year > 1 ? " years, " : " year, ");
        }

        int day = seconds / 86400 % 365;
        if (day != 0) {
            str.append(day).append(day > 1 ? " days, " : " day, ");
        }

        int hour = seconds / 3600 % 24;
        if (hour != 0) {
            str.append(hour).append(hour > 1 ? " hours, " : " hour, ");
        }

        int min = seconds / 60 % 60;
        if (min != 0) {
            str.append(min).append(min > 1 ? " minutes, " : " minute, ");
        }

        int sec = seconds % 60;
        if (sec != 0) {
            str.append(sec).append(sec > 1 ? " seconds, " : " second, ");
        }

        str = new StringBuilder(str.substring(0, str.length() - 2));
        StringBuilder result = new StringBuilder(str);

        try {
            result.replace(str.lastIndexOf(","), str.lastIndexOf(",") + 1, " and");
        } catch (Exception ignored) {}

        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(formatDuration(86400));
    }
}
