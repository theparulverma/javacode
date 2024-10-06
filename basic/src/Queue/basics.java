package Queue;
import access.A;

import java.util.*;
public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();//it removes the first element from the queue which is first inserted
        System.out.println(q);
        System.out.println(q.element());

    }
}
