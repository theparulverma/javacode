public class prabhat_smart {
        public boolean check(int[] nums) {
            //    int count=0;
            for(int i = 0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    rotate(nums,nums.length-(i+1));
                    break;
                }
            }
            if(check2(nums) == 0) return true;
            return false;
        }
        static int check2(int[] arr){
            int count=0;
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    count++;
                }
            }
            return count;
        }
        static void swapArray(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        static void reverse(int[] arr, int i, int j) {
            while (i < j) {
                swapArray(arr, i, j);
                i++;
                j--;
            }
        }
        static void rotate(int[] arr, int k) {
            int n = arr.length;
            k = k % n;
            reverse(arr, 0, n - k - 1);
            reverse(arr, n - k, n - 1);
            reverse(arr, 0, n - 1);

        }

    }
/*class Solution {
    public int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;//rotate list
        k=k%length(head);
        for (int i = 0; i < k; i++) {
            temp2 = temp2.next;
        }
        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp2.next=head;
        head=temp1.next;
        temp1.next=null;
        return head;
    }
}*/


