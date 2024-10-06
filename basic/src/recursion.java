import java.util.*;
public class recursion {
    static void printinc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    static void printdc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printdc(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //printinc(n);
        printdc(n);
    }
}
//recursion function calling itself.
//pmi principle of mathematical induction.faith self work base case
//Self work jab hum 5 bhi print karege
//smaller subpromblem

//HALTING A function calling itself with different parameters and a base case to terminate the infinite loop.A function calls itself to solve its subpromblems.
//Recursion spell 1.identify the smaller promblem > let recursion solve it.
//2.self work- do your work.
/*3.identify the base case .
 */
