import java.util.Scanner;
public class transpose_matrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter no. of elements");
        for(int i = 0;i< r; i++)
        {
            for(int j = 0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(mat);
        System.out.println("Transpose of Matrix");
        transposeInPlace(mat,r,c);
        printMatrix(mat);
        //int[][] ans =transpose(mat,r,c);
        //printMatrix(ans);
    }
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] trans,int r,int c)
    {
        int[][] ans = new int[c][r];
        for(int i = 0;i<c;i++)
        {
            for(int j = 0;j<r;i++)
            {
                ans[i][j]=trans[j][i];
            }
        }
        return ans;
    }
    static void transposeInPlace(int[][] matrix, int r,int c)
    {
        for (int i = 0;i < c;i++)
        {
            for(int j = i;j < r;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }

}
