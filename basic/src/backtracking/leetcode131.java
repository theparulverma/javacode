package backtracking;

import java.util.ArrayList;

public class leetcode131 {
    public static void main(String[] args){
        String ques ="nitin";
        ArrayList<String> ll = new ArrayList<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        partition(ques,ll,ans);
        System.out.println(ans);
    }
    public static void partition(String ques,ArrayList<String> ll,ArrayList<ArrayList<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<String>(ll));
            return;
        }
        for(int i =1;i <=ques.length();i++){
            String s = ques.substring(0,i);
            if(ispalindrome(s)==true){
                ll.add(s);
                partition(ques.substring(i),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String s){
        int i =0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


