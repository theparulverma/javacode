public class arrsumrecursion {
    public static void main(String[] args){
        int[] arr={2,1,8,6,3};
        int idx=0;
        printarray(arr,idx);
        System.out.println(sumarray(arr,idx));
    }
    static void printarray(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printarray(arr,idx+1);
    }
    static int sumarray(int[] arr,int idx){
        if(idx==arr.length){
            return 0;//kyuki hume sum nikalana hai toh 0 add karne se kuch fark nhi padegaa
        }
        int smallans =sumarray(arr,idx+1);
        return smallans+arr[idx];
    }
}
