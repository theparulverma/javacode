public class quick {//worst case n^2 average case nlogn best case constant space leta hai
//self work pehle karege then recursive work.pivot element choose kiya then usko sahi jagah pe rakhdo ,pivot se left vale elements chote rakh lo right vale pivot se bade elements
    //self work means pehle partition pivot element vala then quick sort recursive vala unn 2 array ko sort karega.
    //take 2 pointers i and j phir arr[i]<7 toh aaisi rehne denge j piche se check karege ki 7 se greater ho sab right side mein arr[i] and arr[j] swap karege while i <pivot index se and j greater than pivot index se
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int cnt=0;
        for(int i = st+1;i<= end;i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotidx = st+cnt;
        swap(arr,st,pivotidx);
        int i =st;
        int j=end;
        //elements lesser left ,greater right side of pivotidx
        while(i < pivotidx && j > pivotidx){
            while(arr[i] <= pivot) i++;
            while(arr[j] >= pivot) j--;
            if(i < pivotidx && j > pivotidx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }
    static void quicksort(int[] arr,int st,int end){
        if(st >= end) return;
        int pi = partition(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);

    }
public static void main(String[] args){
    int[] arr ={4,1,3,5,2};
    int n = arr.length;
    System.out.println("Array before sorting");
    displayarr(arr);//4 1 3 5 2
    System.out.println();
    quicksort(arr,0,arr.length-1);
    System.out.println("Array after sorting");
    displayarr(arr);// 1 2 3 4 5
}
    static void displayarr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
//no quick sort is not a stable algorithm .avg case/best case=o(n log n)
