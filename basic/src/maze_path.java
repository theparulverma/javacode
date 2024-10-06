public class maze_path {
    public static void main(String[] args){
        int n =4;
        int m =5;
        path(0,0,n-1,m-1,"");
    }//cc current column,cr current row, er-end row,ec-end column
    public static void path(int cr,int cc, int er,int ec,String ans){
         if(cr == er && cc == ec){
             System.out.println(ans);
             return;
         }
         if(cr>er || cc >ec){
             return;
         }
         path(cc+1,cr,er,ec,ans+"H");
         path(cc,cr+1,er,ec,ans+"V");
    }
}
