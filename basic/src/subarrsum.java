import java.util.Scanner;
// means 2 arrays ko divide karke uska prefix aur suffix sum nikalna hai aur voh hum check pref[i] equal to suffix i+1 kyuki suffix ka toh ek aage vala element hi toh sum hoga .
//hume suffix sum bhi nhi nikalna hoga kyuki total sum mein se prefix vala subtract kardo.

public class subarrsum {
    static int findArraySum(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum + arr[i];
        }
        return totalsum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalsum = findArraySum(arr);
        int prefsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefsum = prefsum + arr[i];
            int suffixsum = totalsum - prefsum;
            if (suffixsum == prefsum) {
                return true;
            }

        }

        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);
        System.out.println("Equal Partition Possible:" + equalSumPartition(arr));

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

