 class gocomet {
    //reverse a string
    public static void main(String[] args){
 String s = "aaab";
        int len = s.length();
        String rev = "";
        for(int i = len-1;i >= 0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
//        char[] charArray = s.toCharArray();//[a,a,a,b]
//        int left = 0;
//        int right = charArray.length-1;
//        while(left < right){
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//            left++;
//            right--;
////        }
//        String reverse = new String(charArray);
//        System.out.println("reversed :" +  reverse);

        int[] arr = {1,2,3,4,5};
        int min = arr[0];
        int max = arr[0];
        for(int i =1;i<5;i++){
             if(arr[i] > arr[i-1]) {
                max = arr[i];
            }
        }
        for(int i =1;i<5;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum :" + min +" maximum :"+ max);
    }
}
//[1,2,3,4,5]