import java.util.ArrayList;

public class generate_parentheses {
    public static void main(String[] args){
        int n =3;
        ArrayList<String> ll = new ArrayList<>();
        generate(n,0,0," ",ll);
        System.out.println(ll);
    }
    public static void generate(int n, int open,int close,String ans,ArrayList<String> ll){
        if(open==n && close==n){
            //System.out.print(ans + " ");
            ll.add(ans);
            return;
        }
        if(open<n){
            generate(n,open+1,close,ans +"(",ll);
        }
        if(open>close){
            generate(n,open,close+1,ans+")",ll);
        }
    }
}
