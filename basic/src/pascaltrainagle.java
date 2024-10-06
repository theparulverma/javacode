import java.util.*;
public class pascaltrainagle {
    //jagged array which has different no.of columns in every row
    //in every row first and last element is 1
    //pascal triangle means ek element ka sum upper ke 2 element ka sum.
    //p[i][j]=p[i-1][j]+p[i-1]+p[j-1]
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);

    }
    static int[][] pascal(int n)
    {
        int[][] ans = new int[n][];
        for(int i=0;i<n;i++)
        {
            //ith rows has i+1 columns
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for(int j =1;j<i;j++)
            {
                ans[i][j]=ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
}
