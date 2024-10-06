package Stacks;
import java.util.*;
public class underflowoverflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(2);
        st.push(9);
        st.push(8);
        st.push(7);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //if stack is empty and u are performing pop and peep operation then it will give error.
    }
}
