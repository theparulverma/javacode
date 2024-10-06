public class Multiple {
    //12 ke multiples nikalne hai 5 tak 12,24,36,48,60
    public static void main(String [] args){
        mult(5,4);
    }
    static void mult(int num,int k)
    {
        if(k==1){
            System.out.println(num);//base case
            return;
        }
        mult(num,k-1);//recursive work
        System.out.println(num *k);//self work
    }
}
