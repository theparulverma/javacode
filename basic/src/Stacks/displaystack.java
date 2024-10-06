package Stacks;
import java.util.*;
public class displaystack {
    public static void displayreverserec(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();
        System.out.print(top+" ");
        displayreverserec(s);
        s.push(top);//dubara stack ko vaisi hi rakhna ke liye
    }
    public static void displayrec(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();
        displayrec(s);
        System.out.print(top+" ");
        s.push(top);//dubara stack ko vaisi hi rakhna ke liye
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(2);
        st.push(9);
        st.push(8);
        st.push(7);
        displayrec(st);
       /* Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.println(x+" ");
            st.push(x);
        }
        System.out.println(st);*/
        //while using array display the stack
       /* int n = st.size();
        int[] arr = new int[n];
        for(int i= n-1;i>=0l;i--){
            arr[i]=st.pop();
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }*/
    }
}
