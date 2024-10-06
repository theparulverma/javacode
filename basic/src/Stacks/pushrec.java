package Stacks;
import java.util.*;
public class pushrec  {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(9);
        st.push(76);
        st.push(43);
        st.push(29);
        st.push(12);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>1){//bottom se karna hainaa haina remove element
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
//dekho jab hum
/*12
29
43
76
9 toh uss se bottom mein 9 delete hoyegaa */