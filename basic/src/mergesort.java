public class mergesort {
    //n log n algorithm
    static void displayarr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }//recursive work pehle hota hai baad mein self work hota hai matlab pehle array ko divide karege then self work karke usko sort karege
    static void mergefull(int[] arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for(i = 0;i < n1; i++) left[i] = arr[l+i];
        for(j = 0;j < n2; j++) right[j] = arr[mid+1+j];
        i=0;
        j=0;
        k=l;
        while(i < n1 && j<n2){
            if(left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while(i<n1)
            arr[k++] = left[i++];
        while(j<n2)
            arr[k++] = right[j++];
    }
    static void merge(int[] arr,int l,int r){
        if(l >= r) return;
        int mid =(l+r)/2;
        merge(arr,l,mid);//first half sort solve ho gaya
        merge(arr,mid+1,r);//second half solved
        mergefull(arr,l,mid,r);

    }
    public static void main(String[] args){
        int[] arr ={4,1,3,5,2};
        int n = arr.length;
        System.out.println("Array before sorting");
        displayarr(arr);//4 1 3 5 2
        merge(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting");
        displayarr(arr);// 1 2 3 4 5
    }
}
