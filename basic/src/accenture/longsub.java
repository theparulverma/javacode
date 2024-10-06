package accenture;

import java.util.ArrayList;
import java.util.List;

public class longsub {
        static int maxlen = 0;
        public static void main(String args[]){
            int[] arr ={2,3,6,18};
            int n = 4;
            //int k = 3;
            List<Integer> temp = new ArrayList<>();//yeh temp array hai, jismein hum subsequence store kar rahe hai, jo condition match karti h, jiske elements ka
            //consecutive differnce divisible by k ho
            // mericall(arr,temp,k,0);
            triple(arr,temp,n,0);
            System.out.println(maxlen);
        }
        //    public static void mericall(int[] arr,List<Integer> temp,int k, int i){
//        if(i == arr.length){
//            if(maxlen <temp.size()){//agar jo hamara temp aaray hai jismein hum values rakh rahe h jo condition  ko follow kar rahe h
//                maxlen = temp.size();
//            }
//            return;
//        }
//        if(temp.isEmpty() || Math.abs(temp.get(temp.size()-1) - arr[i]) % k == 0){
//            temp.add(arr[i]);
//            mericall(arr,temp,k,i+1);
//            temp.remove(temp.size()-1);
//        }
//         mericall(arr,temp,k,i+1);//not pick
//    }
        public static void triple(int[] arr,List<Integer> temp,int n, int i ){
            if(i == n){
                if(maxlen < temp.size()){
                    maxlen = temp.size();
                }
                return;
            }
            if(temp.isEmpty() || temp.get(temp.size()-1)*3 == arr[i]){
                temp.add(arr[i]);
                triple(arr,temp,n,i+1);
                temp.remove(temp.size()-1);
            }
            triple(arr,temp,n,i+1);
        }
}
