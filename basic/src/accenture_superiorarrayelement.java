import java.util.*;
public class accenture_superiorarrayelement {
       public static void main(String args[]){
              int[] A = {1,20,6,4,5};
              int n = 5;
              inversion(A,n);
              //cut(4);
              int[] arr = {7,9,5,2,8,7};
              int sup = 0;
              int max = Integer.MIN_VALUE;
              for(int i = arr.length-1; i>= 0; i--){
                     if(arr[i] > max){
                            max = arr[i];
                            sup++;
                     }
              }
             // System.out.println(sup);
       }
       public static void cut(int n){
              int sum = 0;
              sum = (n *(n+1)/2) +1;
              sum = sum % 10000007;
              System.out.println(sum);
       }
       public static void inversion(int[]arr,int n){
              int inverse= 0;
              for(int j = 0;j<arr.length;j++){
                     for(int k = arr.length-1;k>=0;k--){
                            if(j<k && arr[j] > arr[k]){
                                   inverse++;
                            }
                     }
              }
              System.out.println(inverse);
       }
}
