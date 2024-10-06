package Queue;
import java.util.*;
public class displayqueue {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.poll());//q.poll means remove karna ele,ment ans usko store karana helper queue mein.
        }
        while(helper.size()>0){
            q.add(helper.poll());
        }
    }
}

