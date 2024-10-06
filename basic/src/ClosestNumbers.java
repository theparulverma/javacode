
    import java.util.ArrayList;
import java.util.Collections;

    public class ClosestNumbers {

        public static void closestNumbers(ArrayList<Integer> numbers) {//6 2 4 10
            // Sort the ArrayList
            Collections.sort(numbers);// 2, 4, 6, 10

            // Initialize the minimum difference to a large value
            int minDiff = Integer.MAX_VALUE;//greatest positive integer

            // Find the minimum difference by comparing adjacent elements
            for (int i = 1; i < numbers.size(); i++) {
                int diff = numbers.get(i) - numbers.get(i - 1);
                if (diff < minDiff) {//tph obviously diff chota hogaa
                    minDiff = diff;
                }
            }

            // Print pairs with the minimum difference
            for (int i = 1; i < numbers.size(); i++) {
                int diff = numbers.get(i) - numbers.get(i - 1);
                if (diff == minDiff) {
                    System.out.println(numbers.get(i - 1) + " " + numbers.get(i));
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(8);
            numbers.add(91);
            numbers.add(20);
            numbers.add(11);
            closestNumbers(numbers);
        }
    }