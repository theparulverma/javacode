package accenture;

public class rearrangement {
    public static void main(String args[]){
        int[] arr = {5,7,2,4,9,0};
        String ans = rearrange(arr);
        System.out.println(ans);
    }
    public static String rearrange(int[] n){
        String ans ="";
        for(int i = 0;i<n.length;i++){
            if(n[i] % 2 == 0){
                ans = ans+ "Even";
            }else{
                ans = ans+"Odd";
            }
        }
        return ans;
    }
}
