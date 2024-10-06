import java.util.*;
public class Leetcodejump {
        public static boolean canJump(int[] nums) {
            int n = nums.length;//5
            int[] dp = new int[n];
            int j =0;
            int k = n-1;//4
            for(int i =0;i<n;i++){
                j = nums[i];
                while(j > 0){
                    if(nums[j] > nums[i]){
                        i =j;//1// nums[1] = 3;
                        if(nums[i] == k-i){
                            return true;
                        }
                    }
                    j--;
                }
            }
            return false;
        }
        public static void main(String args[]){
            int[] nums = new int[]{2,3,1,1,4};
            System.out.println(canJump(nums));

        }
    }

