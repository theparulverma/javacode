package DP;

public class Edit_distance {
 public static void main(String[] args){
     String s1 ="FOOD";
     String s2 ="MONEY";
     System.out.println(editd(s1,s2,0,0));
 }
 //i -> s1, j-> s2
    public static int editd(String s1, String s2,int i, int j){
         int ans = 0;
         if(i == s1.length()){
           return s2.length()-j;//it means jab hamara i string s1 ki length tak phoch jaye index,then hume jo operations chaiye hoge s1 ko s2 banane mein then s2. length() - j lagege
         }
         if(j == s2.length()){
             return s1.length() -i;
         }
         if(s1.charAt(i) == s2.charAt(j)){
             ans = editd(s1,s2,i+1,j+1);
         }else{
             int D = editd(s1,s2,i+1,j);//d stands for delete ,delete a letter from s1 , soo s1 ka i index i+1 hoyegaa
             int I = editd(s1,s2,i,j+1);//it means when we insert a letter in s1 string so ,it will match the s2 string that char, soo j idex will incremnet by 1
             int R = editd(s1,s2,i+1,j+1);//R stands for replace
             ans = 1+ Math.min(D,Math.min(I,R));
         }
         return ans;
    }
}
