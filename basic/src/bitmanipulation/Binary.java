package bitmanipulation;
import java.util.*;
public class Binary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder res = new StringBuilder();
         while(n!= 1){
             if(n % 2 ==  1){
              res = res.append(1);
             }else{
                 res = res.append(0);
             }
             n=n/2;
         } res.append(1);
      res = new StringBuilder(res.reverse().toString());
     System.out.println(res);
}
}