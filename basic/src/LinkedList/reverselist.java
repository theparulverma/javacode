package LinkedList;

public class reverselist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        if(head ==null) return;//base case
        System.out.print(head.data+" ");//work
        display(head.next);//call
    }
    public static void displayrev(Node head){
        if(head ==null) return;//base case
        displayrev(head.next);//call
        System.out.print(head.data+" ");//work
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        //display(a);
        displayrev(a);
    }
}
