public class countsort {
    //non comparison based method or algorithm range nikal le the hai ki kaha tak max number hai
    //arr =  4,3,1,5,3,1,3,5
    //count jo harr number ki frequency batayega 0 se range tak jo given hai 0 ki frequency 0 hai, 1 ki 2 baar ,2 ki 0 ,3 ki 3, 4 ki 4 ,5 ki 2
    //ans = 1,1,3,3,3,4,5,5
    static int findmax(int[] arr){
        int max= arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static void basicCountSort(int[] arr){
        //find the largest element of the arr
        int max=findmax(arr);
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;//count arr baneagaa iss loop se it means konsa element kitni baar aayega
        }
        int k=0;
        for(int i=0;i<count.length;i++){//0
            for(int j=0;j<count[i];j++){
                arr[k++] =i;
            }
        }

    }
    static void display(int[] a){
        for(int val: a){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void count(int[] arr){
        int n=arr.length;
        int[] output = new int[n];
        int max =findmax(arr);
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        //find the index of each element in the original array and put in the output array
        for(int i=n-1;i>=0;i--){
            int idx = count[arr[i]] -1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        //copy all elementys of output to arr
        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args){
        int[] arr={1,4,5,2,2,5};
        count(arr);
        //basicCountSort(arr);
        display(arr);
    }
}//stability promblem occurs.why stability is important ?
//0
