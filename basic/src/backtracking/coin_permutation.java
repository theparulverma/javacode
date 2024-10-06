package backtracking;

public class coin_permutation {
    public static void main(String[] args){
        int[] coin ={2,1,3,5};
        int amount = 4;
        permutation(coin, amount, " ");
    }
    public static void permutation(int[] coin,int amount, String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<coin.length;i++){
            if(amount >= coin[i]){
               // amount -= coin[i];
                permutation(coin, amount -= coin[i],ans+coin[i]);
               // amount += coin[i];//for undo or backtracking
            }
        }
    }

}
