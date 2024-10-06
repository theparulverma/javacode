package questions;
import java.util.*;
public class Source {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a);
        System.out.println(b);
        int minutes = maxminutes(a,b);
        System.out.println(minutes);

    }
    public static int maxminutes(int x,int y){
        if(x <=0 || y<=0){
            return 0;
        }
        int chargeboth = 1+maxminutes(x-1,y-1);
        int chargeX = 1+maxminutes(x-1,y-2);
        int chargeY = 1+maxminutes(x-2,y-1);
        return Math.max(chargeboth,Math.max(chargeX,chargeY));
    }
}
