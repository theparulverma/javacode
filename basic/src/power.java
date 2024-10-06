import java.util.*;
public class power {
    /*static int pow(int p,int q){//p voh number hai aur q uskii power
       if(q == 0) return 1;
       return pow(p,q-1) * p;
    }*/
    public static void main(String[] args){
        int p,q;
        System.out.println (pow(5,4));
    }
    static int pow(int p,int q){
        if(q == 0) return 1;
        if(q % 2 == 0){
            return pow(p,q/2) * pow(p,q/2);
        }else {
            return p * pow(p, q / 2) * pow(p, q / 2);
        }
    }
}
//second approach for power if we write in form -> p^q/2 * p^q/2 for even || odd p^q/2*p^q/2*p
//time complexity o(lo