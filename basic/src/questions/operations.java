
package questions;
import java.util.*;

public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> sequence = new ArrayList<>();
        if (transform(a, b, a, sequence)) {
            System.out.println("YES");
            System.out.println(sequence.size());
            for (int x : sequence) {
                System.out.print(x + " ");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static boolean transform(int a, int target, int currentSum, ArrayList<Integer> sequence) {
        if (currentSum == target) {
            sequence.add(target);
            return true;
        }

        // Try multiplying by 2
        if (currentSum * 2 <= target) {
            sequence.add(currentSum * 2);
            if (transform(a, target, currentSum * 2, sequence)) {
                return true;
            }
            sequence.remove(sequence.size() - 1);  // Backtrack
        }

        // Try appending 1
        if (currentSum * 10 + 1 <= target) {
            sequence.add(currentSum * 10 + 1);
            if (transform(a, target, currentSum * 10 + 1, sequence)) {
                return true;
            }
            sequence.remove(sequence.size() - 1);  // Backtrack
        }

        return false;
    }
}






