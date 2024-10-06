package backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class permutation2 {
        public static void main(String[] args){
            int[] coin ={1,1,2};
            //int amount = 4;
            ArrayList<Integer> ll = new ArrayList<>();
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            permutation(coin,ll,ans,0);
            System.out.println(ans);
        }
        public static void permutation(int[] coin,ArrayList<Integer> ll,ArrayList<ArrayList<Integer>> ans,int idx){
            if(ll.size()== coin.length){
                ans.add(new ArrayList<>(ll));
                return;
            }
            for(int i =idx;i<coin.length;i++){

               // if(!ll.contains(coin[i])){
               // if(i > idx && coin[i]==coin[i-1]){
                   // continue;
                //}
                    ll.add(coin[i]);
                    // amount -= coin[i];
                    permutation(coin, ll,ans,i);
                    ll.remove(ll.size()-1);
                    // amount += coin[i];//for undo or backtracking
               // }//112,211,121
            }
        }

    }
