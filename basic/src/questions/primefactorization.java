package questions;
import java.util.*;
public class primefactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
            System.out.println(arr[i]);
        }
        int k = sc.nextInt();
        int result = check(arr,k);
        System.out.println(result);
    }
    public static int check(int[] arr,int k){
        int count =0;
        int start =0;
        int n = arr.length;
        int end = n-1;
        while(start<=end){
            int curr = arr[start] * arr[end];
            if(curr >k){
                end--;
            }
            else{
                count = count+(2*(end-start+1))+1;
                start++;
            }
        }
        return count;
    }

}
