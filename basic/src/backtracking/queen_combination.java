/*package backtracking;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class queen_combination {//iss vale program mein sirf voh output dega jaise ki b0 hai toh b1,b2,b3 tak then b1 hai toh it only allow b2,b3 then b2 hai it will only allow for b3
    public static void main(String[] args){
        int n =4;//n means boxes jismein hume total queen place karni h
        int tq=2;//total queen
      //  boolean[] board = new boolean[n];
        ArrayList<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(n,tq,ll,ans,0);
        System.out.println(ans);
        //combination(n,tq,0," ",0);
    }
    public static void combination(int n ,int tq,ArrayList<Integer> ll,List<List<Integer>>ans,int idx) {//qpsf means kitnii queen aab tak place ho gayii hai short form of queen placed soo far
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                combination(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf,i+1);
                board[i] = false;//undo
            }
        }
    }
}*/
