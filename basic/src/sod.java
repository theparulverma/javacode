public class sod {
    public static void main(String[] args)
    {
        int n;
        System.out.println(sod(1234));
    }
    static int sod(int n){
        if(n >= 0 && n<= 9) return n;
        return sod(n/10) + n%10;
    }
}
