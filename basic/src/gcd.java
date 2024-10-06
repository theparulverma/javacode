import java.util.*;
public class gcd {
//input 2 no. 16 and 12 ka gcd nikalo 16->1,2,4,8,16 && 12->1,2,3,4,6,12 && common 1,2,4 toh 4 gcd hoga
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcdi(x,y));
    }
    /*static int igcd(int x,int y)
    {
     while(x%y !=0){
         int rem=x%y;
         x=y;
         y=rem;
     }
     return y;
    }
}*/
static int gcdi(int x,int y){
    if(y == 0){
        return x;
    }
    return gcdi(y,x%y);//eulcid's algorithm
}
}
