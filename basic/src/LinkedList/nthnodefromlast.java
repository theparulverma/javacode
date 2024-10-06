package LinkedList;

public class nthnodefromlast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(100);
        Node b =new Node(13);
        Node c =new Node(4);
        Node d =new Node(29);
        a.next=b;
        b.next=c;
        c.next=d;

    }

}
