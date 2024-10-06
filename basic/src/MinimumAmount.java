import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAmount {

    public static void main(String[] args) {
        int N = 999;
        int[] d = {5, 6};

        String result = findMinimumAmount(N, d);
        System.out.println("Minimum number formed that is >= " + N + " using available digits: " + result);
    }

    public static String findMinimumAmount(int N, int[] d) {
        // Create a list of available digits (0-9 except those in array d)
        List<Integer> availableDigits = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            boolean isExcluded = false;
            for (int j : d) {
                if (i == j) {
                    isExcluded = true;
                    break;
                }
            }
            if (!isExcluded) {
                availableDigits.add(i);
            }
        }

        // Sort available digits to use the smallest first
        Collections.sort(availableDigits);

        // Generate the smallest number by repeatedly appending the smallest available digit
        StringBuilder result = new StringBuilder();
        while (true) {
            result.append(availableDigits.get(0));
            long numberFormed = Long.parseLong(result.toString());
            if (numberFormed >= N) {
                break;
            }
        }

        return result.toString();
    }
}
