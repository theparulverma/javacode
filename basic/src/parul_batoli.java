import java.util.Scanner;

public class parul_batoli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++)
        {
             arr[i]=sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

    }
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        }
    }

