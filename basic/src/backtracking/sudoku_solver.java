package backtracking;

public class sudoku_solver {
    public static void main(String[] args){
        int[][] grid = {{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
        print(grid,0,0);
    }
    public static void print(int[][] grid,int cr,int cc){
        if(cc == 9){
            cc =0;
            cr++;
        }
        if(cr == 9){
            display(grid);
            return;
        }
        if(grid[cr][cc] != 0){
            print(grid,cr,cc+1);
        }
        else{
            for(int val=1;val <=9;val++){
                if(isitsafe(grid,cr,cc,val) == true){
                    grid[cr][cc] = val;
                    print(grid,cr,cc+1);
                    grid[cr][cc] =0;
                }
            }
        }
    }
    public static boolean isitsafe(int[][] grid,int cr,int cc, int val){
        //to check in row ki voh element exist toh nhi karta uss row mein karta h toh false return kardo
        for(int i =0;i<9;i++){
            if(grid[cr][i]== val){
                return false;
            }
        }
        //to check in column
        for(int i =0;i<9;i++){
            if(grid[i][cc]== val){
                return false;
            }
        }
        //3*3 matrix mein check
        int r = cr-cr%3;
        int c = cc-cc%3;
        for(int i =r;i<r+3;i++){
            for(int j = c;j<c+3;j++){
                if(grid[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[][] grid){
        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid.length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
