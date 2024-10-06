import java.util.*;
public class LCAInForest {
        public static int findLCA(int[] parent, int x1, int x2) {
            // Set to store ancestors of x1
            Set<Integer> ancestors = new HashSet<>();

            // Traverse from x1 to the root, storing all ancestors
            while (x1 != -1) {
                ancestors.add(x1);
                x1 = parent[x1];
            }

            // Traverse from x2 to the root, checking if any ancestor matches with x1's
            while (x2 != -1) {
                if (ancestors.contains(x2)) {
                    return x2;  // Return the first common ancestor
                }
                x2 = parent[x2];
            }

            // If no common ancestor is found, return -1
            return -1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();  // Number of test cases

            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();  // Number of nodes
                int[] parent = new int[N];

                for (int i = 0; i < N; i++) {
                    parent[i] = scanner.nextInt();  // Parent list
                }

                int x1 = scanner.nextInt();
                int x2 = scanner.nextInt();

                // Find and print the LCA for the given nodes
                System.out.println(findLCA(parent, x1, x2));
            }

            scanner.close();
        }
}
