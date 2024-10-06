import java.util.Scanner;

public class recursefibbo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printfibbo(n));
    }
    static int printfibbo(int n)
    {
        if(n==0 || n==1){
            return n;
        }
        return printfibbo(n-1) + printfibbo(n-2);
    }
}
//means agar n hai toh nth
/*term ka sum 0 se
0
1 1st term
0+1=1
1+1=2
2+1=3
3+2=5
5+3=8*/
