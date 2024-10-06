package Stacks;
import java.util.*;
public class copystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        /*int n;
        System.out.println("Enter the number of elements you want to insert");
        n= sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }*/
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse order like [1,2,3,4,5] to [5,4,3,2,1]
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            gt.push(x);
            st.pop();//or inspite of this we caan use gt.push(st.pop());
        }
        //for reverseing in same order we want 1 more stack
        Stack<Integer> rt = new Stack<>();
        while(gt.size() > 0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}

