package backtracking;

public class nqueen {
    public static void main(String[] args){
        int n =4;
        boolean[][] board = new boolean[n][n];
        queen(board,0,n);
    }
    public static void queen(boolean[][] board,int r, int tq){
        if(tq==0){//means all the queens jo hai voh placed ho gayi hai board mein
            display(board);
            return;

        }
        for(int c =0;c<board.length;c++){
            if(isitsafe(board,r,c)){
                board[r][c] = true;
                queen(board,r+1,tq-1);
                board[r][c]=false;
            }
        }
    }
    public static boolean isitsafe(boolean [][] board,int row, int col){
        //yeh vala loop uss row/column mein check karne ke liye
        int r=row;
        while(r>= 0){
            if(board[r][col]){
                return false;
            }
            r--;
        }//left diagnol mein check karne ke liye
        r= row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }//right diagnol mein check karne ke liye
        r=row;
        c=col;
        while(r >= 0 && c< board.length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public static void display(boolean[][] board){
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
