package accenture;
import java.util.*;
public class longpalinsub {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
         String ans =islongpalin(st);
         System.out.println(ans);
    }
    public static String islongpalin(String st){
        if(st.length() < 2){
            return st;
        }
        int n = st.length();
        int maxlen = 1;
        int start = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0;i<n;i++){
            dp[i][i] = true;
        }
        for(int i = 0;i<n-1;i++){
            if(st.charAt(i) == st.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                maxlen = 2;
            }
        }
        for(int len = 3;len <= n;len++){
            for(int i = 0;i<= n-len;i++){
                int j = i + len -1;
                if(st.charAt(i) == st.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
                    start = i;
                    maxlen = len;

                }
            }
        }
        return st.substring(start,start+maxlen);

    }
}
