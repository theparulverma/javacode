import java.util.Scanner;

public class multiply_matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter no. of Columns of Matrix 1");
        int c1 = sc.nextInt();
        System.out.println("Enter no. of Elements");
        int[][] a = new int[r1][c1];
        for(int i =0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no. of rows of matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter no. of Columns of Matrix 2");
        int c2 = sc.nextInt();
        System.out.println("Enter no. of Elements");
        int[][] b = new int[r2][c2];
        for(int i =0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1 ");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);
        multiply(a,r1,c1,b,r2,c2);
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
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2)
        {
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j =0;j<c2;j++){
                for(int k=0;k < c1;k++)
                {
                    mul[i][j] += a[i][k]* b[k][j];
                }
            }
            System.out.println("Multiplication of 2 Matrices");
            printMatrix(mul);
        }
    }

}
