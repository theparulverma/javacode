package binarytreepackage;

public class bst {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public bst(int[] in){
        root = createtree(in,0,in.length-1);

    }
    public Node createtree(int[] in, int si,int ei){
        if(si>ei){
            return null;
        }
        int mid =(si+ei)/2;
        Node nn = new Node();
        nn.val = in[mid];
        nn.left=createtree(in,si,mid-1);
        nn.right=createtree(in,mid+1,ei);
        return nn;
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
    public int max(){
        return max(this.root);
    }
    private int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
       // int left = max(node.left);
        int right = max(node.right);
        return Math.max(node.val,right);
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
        else if(nn.val>item){
            return  find(nn.left,item);
        }
        else{
            return find(nn.right,item);
        }

    }
}
