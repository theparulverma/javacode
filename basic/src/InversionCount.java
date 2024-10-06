import java.util.*;
public class InversionCount {
    // Main function to count inversions in the array using merge sort
    public static int mergeSort(int[] arr, int arraySize) {
        int[] temp = new int[arraySize];
        return _mergeSort(arr, temp, 0, arraySize - 1);
    }

    // Recursive function to perform merge sort and count inversions
    private static int _mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid, invCount = 0;
        if (right > left) {
            // Find the middle point to divide the array into two halves
            mid = (right + left) / 2;

            // Count inversions in the left half
            invCount += _mergeSort(arr, temp, left, mid);

            // Count inversions in the right half
            invCount += _mergeSort(arr, temp, mid + 1, right);

            // Count inversions while merging both halves
            invCount += merge(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    // Function to merge two halves and count inversions
    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; // Starting index for left subarray
        int j = mid;  // Starting index for right subarray
        int k = left; // Starting index to be sorted
        int invCount = 0;

        // Merge the two halves while counting inversions
        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i); // Count inversions
            }
        }

        // Copy remaining elements of left subarray, if any
        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right subarray, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted subarray into original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    // Main method to test the inversion count function
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        int n = arr.length;
        int ans = mergeSort(arr, n);
        System.out.println("Number of inversions are " + ans);
    }

}
