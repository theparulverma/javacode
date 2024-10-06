public class reverse {
    public static void main(String args[]){
//        int n = 1234;
//        int rev = 0;
//        while(n>0){
//            int rem = n%10;
//            rev = rev*10+rem;
//            n=n/10;
//        }
//        System.out.println(rev);
       // reverse a String
//        String ex = "DAD";
//        String rev ="";
//        for(int i=ex.length()-1;i>=0;i--){
//            rev = rev+ex.charAt(i);
//        }
//        if(ex.equals(rev)){
//            System.out.println("palin");
//        }else{
//            System.out.println("not");
//        }
       // System.out.println(rev);
//        int n = 10;
//        int a = 0;
//        int b = 1;
//        int fib = 0;
//        System.out.println(a);
//        System.out.println(b);
//        for(int i = 2;i<10;i++){
//            fib = a +b;
//            System.out.println(fib);
//            a = b;
//            b = fib;
//        }
//        int n = 23890;
//        int palin = n;
//        int rev = 0;
//        while(n > 0){
//            int rem = n%10;
//            rev = rev*10+rem;
//            n = n/10;
//        }
//        if(palin == rev) {
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not");
//        }
//        int s = 2;
//        int end = 10;
//        for(int i = s; i < end;i++){
//            if(isPrime(i) == true){
//                System.out.println(i);
//            }
////                System.out.println("not");
////            }
//        }
//
//    }
//    public static boolean isPrime(int n) {
//        if(n <= 1){
//            return false;
//        }
//        for (int j = 2; j <= Math.sqrt(n); j++) {//for 2 as math.srt(2) = 1.41 , aur 2 <= 1.141, yeh nhi hai toh loop mein nhi ghusegaaa, aur aaisi true return kar degaa
//            if (n % j == 0) {
//                return false;
//            }
//        }
////        return true;
//        int n = 5;
//        int fact = 1;
//        for(int i =1;i<=n;i++){
//            fact = fact *i;
//        }
//        System.out.println(fact);
//        int n = 153;
//        int k = n;
//        int arm = n;
//        int ans = 0;
//        int count = 0;
//        while(n > 0){
//            n=n/10;
//            count++;
//        }
//        while(k>0){
//            int rem = k % 10;
//            ans = ans+ (int)Math.pow(rem,count);
//            k = k/10;
//        }
//        if(arm ==  ans){
//            System.out.println("yes armstrong");
//        }else{
//            System.out.println("not");
//        }

        int num = 1234562290;
        int even = 0;
        int odd = 0;
        while(num != 0){
            int rem = num%10;
            if(rem % 2 == 0){
                even++;
            }else{
                odd++;
            }
            num = num/10;
        }
        System.out.println(even);
        System.out.println(odd);
    }


}
