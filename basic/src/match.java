import java.util.*;
public class match {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int teamA = sc.nextInt();
        int[] a = new int[teamA];
        for(int i = 0 ;i<teamA;i++){
            a[i] = sc.nextInt();

        }
        int teamB = sc.nextInt();
        int[] b = new int[teamB];
        for(int j = 0;j<teamB;j++){
            b[j] = sc.nextInt();
        }
        int[] ans = new int[Math.min(teamA, teamB)];
                for(int i = teamA-teamB;i<ans.length;i++){
                    if(a[i] <= b[i]){
                    ans[i] = a[i];
                }else{
                    ans[i] = b[i];
                }
            }
                System.out.println(Arrays.toString(ans));
        }

    }

