public class arrayrecursion {
    public static void main(String[] args){
        int[] arr={2,4,5,8};
        printarray(arr,0);
    }
    static void printarray(int[] arr,int idx)
    {
        if(idx == arr.length-1){
            return;
        }//self work
        System.out.println(arr[idx]);
        //recursive work
        printarray(arr,idx+1);
    }
}
