package LinkedList;

public class basicsl1 {
    public static void displayr(Node head){//display recursively
        if(head == null) return;
        System.out.print(head.data);
        displayr(head.next);//increment karega head ki value aage vale no. ke liye
    }
    public static void displayreverse(Node head){//display recursively
        if(head == null) return;
        displayr(head.next);//increment karega head ki value aage vale no. ke liye
        System.out.print(head.data);  //output 16 8 8 9 3 5
    }
    public static void display(Node head){
        Node temp = head;
         while(temp!=null){
             System.out.println(temp.data+" ");
             temp = temp.next;
         }

    }
    public static class Node{
        int data;//value
        Node next;//address of next location
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);//object create kara x name ka node class ka
        System.out.println(a.next);//null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        //System.out.println(a.next);//linkedlist@13677rctug87 it means b ka address
        //  System.out.println(a.next.data);//bina b ko print karae humne b ke data ko print kara diyaa
        a.next = b;
        b.next = c;
        c.next = d;
        displayr(a);
        Node temp = a;
        /*for(int i=1;i<=5;i++){
            System.out.println(temp.data);
            temp = temp.next;*/
        /*while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;*/
    }
     /*limitation of array
    1.fixed size
    2.continuos memory
    3. insert elements in between
    means insert toh kar payege lekin size fixed rehta hai toh we cant add as many elements we want
    oops user defined data type
     */
}
