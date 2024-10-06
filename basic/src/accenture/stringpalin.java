package accenture;
import java.util.*;
public class stringpalin {
    public static void main(String args[]){
    String st ="naman";
    System.out.println(palin(st));
    }
    public static boolean palin(String st){
        int j = 0;
        int k = st.length()-1;
        while(j < k){
            if(st.charAt(j) != st.charAt(k)){
                return false;
            }
            k--;
            j++;
        }
        return true;
    }
}
