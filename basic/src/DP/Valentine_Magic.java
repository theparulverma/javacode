package DP;

import java.util.Arrays;

public class Valentine_Magic {
    public static void main(String[] args){
        int[] boys = { 2,11,3};
        int[] girls ={5,7,3,2};
        Arrays.sort(boys);
        Arrays.sort(girls);
        System.out.println(mindiff(boys,girls,0,0));
    }
 public static int mindiff(int[] boys, int[] girls, int i, int j){
         if(i == boys.length){
             return 0;
         }
         if(j == girls.length){
             return 10000000;
         }
         int selc = Math.abs(boys[i] - girls[j]) + mindiff(boys,girls,i+1,j+1);//as they are paired so both indexes +1
         int rej = mindiff(boys,girls,i,j+1);
        return Math.min(selc,rej);
  }
}