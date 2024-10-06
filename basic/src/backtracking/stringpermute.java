package backtracking;
import java.util.*;
public class stringpermute {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int n = st.length();
         permute(st,0,n-1);
        //System.out.println(ans);
    }
    public static void permute(String st, int start,int end){
        if(start == end) {
            System.out.println(st);
        }else{
            for(int i = start;i<= end ;i++){
                st = swap(st,start,i);//bcoz for level 1, start toh constant hoga, soo isliye start = 1, and i means start hi, soo (a,a) swap.
                //then (a,b) swap as start = 0, i = 1
                permute(st,start+1,end);
                st = swap(st,start,i);
            }
        }
    }
    public static String swap(String st,int start,int end){
        char temp;
        char[] charr = st.toCharArray();
        temp = charr[start];
        charr[start] = charr[end];
        charr[end] = temp;
        return  String.valueOf(charr);
    }

}
