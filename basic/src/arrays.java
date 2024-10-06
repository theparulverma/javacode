import java.util.*;
public class arrays {
    public static void main(String args[]){
//        int[] a = {1,2,3,4};
//        int sum = 0;
//        for(int i = 0;i<a.length;i++){
//            sum = sum+a[i];
//        }
//        System.out.println(sum);

//       int[] arr = {1,2,3,4};
//       for(int i =0;i<arr.length;i++){
//           if(arr[i] % 2 == 0){
//               System.out.println("even"+arr[i]);
//           }else{
//               System.out.println("odd"+arr[i]);
//           }
//       }
//        int[] a = {1, 2, 3, 5,6};
//        int[] b = {1, 2, 3, 4};
//
//        // Check if arrays a and b are equal
//        if (areArraysEqual(a, b)) {
//            System.out.println("a and b are equal");
//        } else {
//            System.out.println("a and b are not equal");
//        }
//    }
//
//    // Method to check if two arrays are equal
//    public static boolean areArraysEqual(int[] a, int[] b) {
//        // Check if arrays have the same length
//        if (a.length != b.length) {
//            return false;
//        }
//
//        // Compare each element of both arrays
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != b[i]) {
//                return false;
//            }
//        }
//
//        // If all elements match, arrays are equal
//        return true;

//        int[] a = {1,3,4,5};
//        Arrays.sort(a);
//        int sum1 = 0;
//        int sum2 = 0;
//        int max = a[a.length - 1];
//         sum1 = max *(max + 1) /2;
//         for(int i =0;i<a.length;i++){
//             sum2 += a[i];
//         }
//         int miss = sum1-sum2;
//        System.out.println(miss);
//        int[] arr = {3,8,5,2};
//        int min = arr[0];
//        int max = arr[0];
//        for(int i = 1;i<arr.length;i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//            else if(arr[i] >max){
//                max = arr[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
        //duplicate
//        int[] arr = {3,4,5,6,6};
//        for(int i =1;i<arr.length;i++){
//            if(arr[i] == arr[i-1]){
//                System.out.println(arr[i]);
//            }else{
//                System.out.println("not");
//            }
//        }
        int[] arr = {3, 4, 5, 6, 6};

        // Using a HashSet to track seen numbers
        HashSet<Integer> seen = new HashSet<>();
        boolean foundDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                System.out.println("Duplicate number is " + arr[i]);
                foundDuplicate = true;
                break;
            } else {
                seen.add(arr[i]);
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found");
        }
    }

}
