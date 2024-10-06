import java.util.*;
public class secondlargest {
    public static void main(String[] args){
        int[] arr= {12,35,1,10,33,1};
        Arrays.sort(arr);
        int n = arr.length;
        if(n== 1){
            System.out.println("no");
        }
        if(n==2){
            if(arr[1] != arr[0]){
                System.out.println(arr[0]);
            }else{
                System.out.println("no");
            }
        }
        if(n >= 3){
            if(arr[n-1] != arr[n-2]){
                System.out.println(arr[n-2]);
            }else{
                System.out.println("n0");
            }
        }
    }
}
