package backtracking;

public class palindrome_partition {
    public static void main(String[] args){
        String ques ="nitin";
        partition(ques," ");
    }
    public static void partition(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =1;i <=ques.length();i++){
            String s = ques.substring(0,i);
            if(ispalindrome(s)==true){
                partition(ques.substring(i),ans+ s + "|");
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
