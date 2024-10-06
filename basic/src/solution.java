//
//    import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//    // Class name should be "Source",
//// otherwise solution won't be accepted
//    public class solution {
//        public static void main(String[] args) {
//
//            Scanner in = new Scanner(System.in);
//
//            // Declare the variable
//            int a;
//            int n = in.nextInt();
//            int k = in.nextInt();
//            int i = in.nextInt();
//            int[] arr = new int[n];
//            for(int j =0;j<n;j++){
//                arr[j] =in.nextInt();
//            }
//            int maxIndex = findMaxIndex(n,k,i,arr);
//            // Read the variable from STDIN
//            a = in.nextInt();
//
//            // Output the variable to STDOUT
//            System.out.println(maxIndex);
//        }
//        private static int findMaxIndex(int n, int k,int i, int[] arr){
//            int maxIndex =0;
//            int leftspells = i;
//            for(int j =0;j<n-1;j++){
//                int energyrequired = Math.max(0,arr[j+1]-arr[j]);
//                if(k >= energyrequired){
//                    k -= energyrequired;
//                    maxIndex = j+1;
//                }else if(leftspells > 0){
//                    leftspells--;
//                    k -= energyrequired;
//                    maxIndex = j+1;
//                }
//                else{
//                    break;
//                }
//            }
//            return maxIndex;
//        }
//    }

import java.util.Stack;

 class Solution {
    public String smallestString(String S) {
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == '1' && ch == '0') {
                stack.pop(); // Remove the '1' from the '10' pair
            } else {
                stack.push(ch); // Otherwise, push the character to the stack
            }
        }

        // Construct the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample Inputs
        String S1 = "0000111111";
        String S2 = "1111111";
        String S3 = "110";

        // Outputs
        System.out.println(solution.smallestString(S1)); // Output: 0000111111
        System.out.println(solution.smallestString(S2)); // Output: 1111111
        System.out.println(solution.smallestString(S3)); // Output: 0
    }
}
