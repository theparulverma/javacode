package Stacks;

import java.util.*;
//stack unlimited size
public class basicsostack {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>():
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(24);
        st.push(98);
        st.push(5);
        //peek
        System.out.println((st.peek()));
        System.out.println(st);
        //st.pop();
        //System.out.println(st);
        //st.pop();
        //System.out.println(st);
        System.out.println("size is : " + st.size());
        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);

    }
}
