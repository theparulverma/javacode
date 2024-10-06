public class swap {
    public static void main(String args[]){
        int a = 24;
        int b = 25;
//        a = a + b;
//        b = a - b;
//        a = a - b;
        a= a^b;
        b= a^b;
        a=a^b;
        System.out.println("a value :" + a);
        System.out.println("b value :" + b);
    }

}
