import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        return s.isEmpty() ? new String[0] : s.split("(?<=\\G..)");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("")));
    }
}
