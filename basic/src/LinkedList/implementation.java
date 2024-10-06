package LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{//linkedlidt name ki class bana di
        Node head=null;//2 pointer start vale ke liye
        Node tail=null;//end vale ke liye
        void insertAtEnd(int val){
            Node temp = new Node(val);//ek node banaya temp ke name se jis se end mein insert kar paaye
            if(head == null){
                head = temp;
                //tail = temp;yeh vali line humne hamesha likhni hogi toh isliye last mein kar denge
            }
            else{
                tail.next = temp;
                //tail = temp;
            }
            tail=temp;
        }
        void insertatBeg(int val){
            Node temp = new Node(val);
            if(head == null){//empty list
                head =tail = temp;
            }
            else{
                temp.next =head;
                head = temp;
            }

        }
        void insertatindex(int idx,int val){//means insert karna any index pe
         Node t = new Node(val);
         Node temp = head;
         if(idx == size()){
             insertAtEnd(val);
             return;
         }
         else if(idx == 0){
             insertatBeg(val);
             return;
         }
         else if(idx<0||idx>size()){
             System.out.println("wrong answer");
             return;
         }
         for(int i =1;i<= idx-1;i++){//it means jaha insert karna hai uss index se pehle ruk jaao
             temp=temp.next;
         }
         t.next = temp.next;
         temp.next=t;
        }
        int getat(int idx){//means index dekar uskii value nikalnii h
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
          Node temp = head;
          for(int i=1;i<idx;i++){
              temp = temp.next;
          }
          temp.next=temp.next.next;
         // size--;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedList ll= new linkedList();
        //ll.insertAtEnd(4);
        //ll.insertAtEnd(5);
        //ll.display();
        //ll.insertAtEnd(12);
        //ll.display();
        //ll.insertatBeg(29);
        //ll.display();
        //ll.insertatindex(4,10);
        //ll.display();
        //ll.insertatindex(0,100);
        //System.out.println(ll.getat(2));
        //ll.display();
        //System.out.println(ll.tail.data);
        ll.deleteAt(2);
        ll.display();
    }
}
