package backtracking;

import java.util.ArrayList;

public class coin_combination {
    public static void main(String[] args){
        int[] coin ={2,1,3,5};
        int amount = 4;
        ArrayList<Integer> ll = new ArrayList<>();
        //in 2d list harr index pe 1d list ka address hoga
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        combination(coin, amount, ll,0,ans);
        System.out.println(ans);
    }
    public static void combination(int[] coin,int amount, ArrayList<Integer> ll,int idx,ArrayList<ArrayList<Integer>> ans){
        if(amount == 0){
            ans.add(new ArrayList<Integer>(ll));
            return;
        }
        for(int i =idx;i<coin.length;i++){
            if(amount >= coin[i]){
                // amount -= coin[i];
                ll.add(coin[i]);
                combination(coin, amount - coin[i],ll,i,ans);
                // amount += coin[i];//for undo or backtracking
                ll.remove(ll.size()-1);//it means uss list ke peeche se voh element remove karege.like[2,2] tha first combination ,aab dusra jo aayega voh [2,2,1,1]hai
                //yeh jo remove kiya h humne it means backtrack hua h
            }
        }
    }


}
