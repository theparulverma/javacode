package Stacks;
import java.util.*;
public class reverserecstack {
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
       int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.size()==1) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(12);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(18);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
