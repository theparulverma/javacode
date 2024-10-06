import java.util.*;
public class recursefact {
    /* base case if n=0 return 1
    self work n*n-1
    subpromblem f(n-1)
     */
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printfc(n));
    }
    static int printfc(int n){
        if(n==0) return 1;
        return n * printfc(n-1);
    }

}
