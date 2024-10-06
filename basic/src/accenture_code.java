import java.util.*;
public class accenture_code {
    public static void main(String args[]){
//        int[] arr= {1,2,5,7,10,12,11,1};
//        int n =   8;
//       // int ans = SumOddIntegers(arr,n);
//        System.out.println(ans);
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 9){
            if(n % 2 == 0){
                n = (int)Math.floor((n-2)/2.0);
            }else if(n % 2 != 0){
                n = (int)Math.floor(n/2.0);
            }
        }
        System.out.println(n);
    }
//    public static int SumOddIntegers(int[] arr, int n){
//        int oddsum = 0;
//        for(int i = 0;i<n;i++){
//            if(arr[i] % 2 != 0 && arr[i] > 0){
//                oddsum = oddsum + arr[i];
//            }
//        }
//        return oddsum;
//    }

}
