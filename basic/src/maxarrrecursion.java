public class maxarrrecursion {
    public static void main(String[] args){
        int[] arr ={4,61,8,10};
        int idx=0;
        printarray(arr,idx);
        System.out.println(maxarray(arr,idx));
    }
    static void printarray(int[] arr,int idx){
        if(idx == arr.length)
            return;
        System.out.println(arr[idx]);
        printarray(arr,idx+1);
    }
    static int maxarray(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallans = maxarray(arr,idx+1);
        return Math.max(smallans,arr[idx]);
    }

}
