import java.util.*;
public class sumwithalternate {
    public static void main(String []args){
        //upto 5 nos.1-2+3-4+5=3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(series(n));
    }
    static int series(int n) {
        if (n == 0) return 0;
        if(n % 2 == 0) {
            return series(n - 1) - n;
        } else {
            return series(n -1) + n;
        }
    }//even n0 add ho rahe hai odd no. subtract ho rahe h.
    //self work conditional hoga even or odd pe depend karega +n odd pe -n even pe
}
