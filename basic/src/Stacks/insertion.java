package Stacks;
import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(2);
        st.push(9);
        st.push(8);
        st.push(7);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        int idx= 2;
        int x = 24;
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }

}
