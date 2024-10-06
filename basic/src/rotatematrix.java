import java.util.*;
public class rotatematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter no. of elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(mat);
        rotate(mat,r);
        System.out.println("Rotation of matrix");
        printMatrix(mat);
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
    static void reverseArray(int[] arr)
    {
        int i = 0;
        int j =arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] matrix, int n){
        transposeInPlace(matrix,n,n);
        for(int i =0; i<n;i++)
        {
            reverseArray(matrix[i]);
        }
    }
}
