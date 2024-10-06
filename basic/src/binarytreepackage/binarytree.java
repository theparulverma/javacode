package binarytreepackage;
import java.util.*;
import java.util.Scanner;

//public class binarytree {

   // import java.util.*;
    public class binarytree {
       /* public static void main(String[] args) {
            binarytree bt = new binarytree();//binarytree jo humne class banayi h uska object banaya bt phir uske baad binarytree mein jo constructor banaya h voh call hoga aur create kardegaa tree ko
            bt.display();
        }*/
        public class Node{//node ke name se class with node type values left right
            int val;
            Node left;
            Node right;
        }
        Scanner sc = new Scanner(System.in);
        private Node root;//node type ki root
        public binarytree(){
            root=createtree();
        }
        private Node createtree(){
            int item = sc.nextInt();
            Node nn = new Node();
            nn.val=item;
            Boolean hlc = sc.nextBoolean();//hlc means has left child
            if(hlc){
                nn.left=createtree();
            }
            Boolean hrc = sc.nextBoolean();//hrc means has right child
            if(hrc){
                nn.right=createtree();
            }
            return nn;
        }
        public void display(){//aab jo yeh h voh accessible hai through binarytreeclient vale class se aur iss se hum
            display(root);
        }
        private void display(Node node){
            if(node == null){
                return;
            }
            String s =" ";
            s="<--" +node.val+ "-->";
            if(node.left != null){
                s=node.left.val + s;
            }
            else{
                s="."+s;
            }
            if(node.right != null){
                s = s + node.right.val;
            }
            else{
                s=s+".";
            }
            System.out.println(s);
            display(node.left);
            display(node.right);
        }
        public boolean find(int item){
            return find(this.root,item);
        }
        private boolean find(Node nn, int item){
            if(nn == null){
                return false;
            }
            if(nn.val == item){
                return true;
            }
            boolean left = find(nn.left,item);
            boolean right = find(nn.right,item);
            return left||right;
        }
        public int max(){
            return max(this.root);
        }
        private int max(Node node){
            if(node == null){
                return Integer.MIN_VALUE;
            }
            int left = max(node.left);
            int right = max(node.right);
            return Math.max(node.val,Math.max(left,right));
        }
        public int ht(){
            return ht(this.root);
        }
        private int ht(Node node){
            if(node == null){
                return -1;
            }
            int left = ht(node.left);
            int right = ht(node.right);
            return Math.max(left,right)+1;
        }
        public void preorder(){
            preorder(this.root);
            System.out.println();
        }
        private void preorder(Node node){
            if(node == null){
                return;
            }
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
        public void postorder(){
            postorder(this.root);
            System.out.println();
        }
        private void postorder(Node node){
            if(node == null){
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.val+" ");
        }
        public void inorder(){
            inorder(this.root);
            System.out.println();
        }
        private void inorder(Node node){
            if(node == null){
                return;
            }
            inorder(node.left);
            System.out.println(node.val+" ");
            inorder(node.right);
        }
        public void levelorder(){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){//agar queue khalli nhi h toh
                Node rv = q.poll();
                System.out.println(rv.val + " ");
                if(rv.left != null){
                    q.add(rv.left);
                }
                if(rv.right != null){//not equal to null means uss root ka right hai toh insert into queue
                    q.add(rv.right);
                }
            }
            System.out.println();
        }

    }



