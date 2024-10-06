import java.util.*;
public class pattern {
    public static void main(String args[]){
        // p1(4);
        //* //p1 pattern
        //* *
        //* * *
        //* * * *
        //p2(4);
        //****
        //****
        //****
        //****
        //p3(4);
        //****
        //***
        //**
        //*
        //p4(5);
        //1
        //12
        //123
        //1234
        //12345
        //p5(5);
        //*
        //*  *
        //*  *  *
        //*  *  *  *
        //*  *  *  *  *
        //*  *  *  *
        //*  *  *
        //*  *
        //*
        //p28(5);
        //
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
       // p30(5);
//        1
//        2 1 2
//        3 2 1 2 3
//        4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5
       // p17(5);
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5
        //  4 3 2 1 2 3 4
        //    3 2 1 2 3
        //      2 1 2
        //        1
    }
    public static void  p1(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void p2(int n){
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p3(int n){
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p4(int n){
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void p5(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalcol = i > n ? 2 * n - i  : i;
            for (int j = 1; j <= totalcol; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void p28(int n){
        for(int i = 1;i <= 2*n-1;i++){
            int totalcol = i > n ? 2*n -i :i;//10-6 = 4, means 6th row 4 stars print
            int spaces = n - totalcol;// Math.abs(n-i);
            for(int s=1;s <= spaces;s++){
                System.out.print(" ");
            }
            for(int j =1;j <= totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void p30(int n){
        for(int i =1;i<=n;i++){
            int spaces = n-i;//5-1 = 4 ,//5-2 = 3 space dene hai
            for(int s = 1;s <= spaces;s++){
                System.out.print(" ");
            }
            for(int j =i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j = 2;j<= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p17(int n){
        for(int i =1;i <= 2*n-1;i++){
            int totalcol = i>n ? 2*n-i:i;
            int spaces = n-totalcol;//Math.abs(n-i);//5-1 = 4 ,//5-2 = 3 space dene hai
            for(int s = 1;s <= spaces;s++){
                System.out.print("  ");
            }
            for(int j = totalcol; j >= 1;j--){
                System.out.print(j +" ");
            }
            for(int j = 2;j<= totalcol;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}


