import java.util.Scanner;

public class spiralmatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

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
        System.out.println("Spiral of Matrix");
        printspiralorder(mat, r, c);
        //printMatrix(mat);
        //int[][] ans =transpose(mat,r,c);
        //printMatrix(ans);
    }

    static void printspiralorder(int[][] matrix, int r, int c)
    {
        int topRow = 0, bottomRow =r-1;
        int leftCol = 0;
        int rightCol = c-1;
        int totalElements =0;
        while(totalElements < r * c){
            for(int j= leftCol ;j <= rightCol; j++)
            {
              System.out.print(matrix[topRow][j]);
              totalElements++;
            }
            topRow++;
           //toprow print karege ke leftcol to rightcol
            for(int i = topRow;i <= bottomRow && totalElements < r*c;i++)
            {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
          rightCol--;
            for(int j = rightCol; j>=leftCol && totalElements < r*c;j-- )
            {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;

            }
            bottomRow--;
            for(int i =bottomRow; i >= topRow && totalElements < r*c;i--)
            {
             System.out.print(matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++;
            //rightcol  print ke liye toprow to bottomrow
                // bootomrow ko print ke liye rightcol to leftcol
                //leftcol print ke liye bottomrow to toprow traverse
                // 1 top row
                //2.rightcol//not print double values
                //3.bottomrow
                //4.leftcol


        }
    }

}
