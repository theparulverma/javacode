
package binarytreepackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelorder {

    public class TreeNode{
        int val;//tree class internally
        TreeNode left;
        TreeNode right;
    }
    TreeNode root;
    Scanner sc = new Scanner(System.in);
    public levelorder(){
        //auto generated constructor
        root = buildTree();
    }
    private TreeNode buildTree(){
        int item = sc.nextInt();
        TreeNode node = new TreeNode();
        node.val=item;
        root=node;//main root ko as voh jo input kara h voh node
        Queue<TreeNode> q= new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            TreeNode rv= q.poll();//jo queue mein se value nikali hai usko uss value ka tree banane ke liye rv treenode mein store kara diya
            int c1=sc.nextInt();
            int c2=sc.nextInt();//values input karane ke liye
             if(c1!=-1){//it means agar c1 ki value -1 nhi h means it consists some value ek baar left side dusri baar right side ke liye
                 TreeNode n = new TreeNode();
                 n.val=c1;
                 rv.left=n;
                 q.add(n);
             }
             if(c2!=-1){
                 TreeNode n = new TreeNode();
                 n.val=c2;
                 rv.right=n;
                 q.add(n);
             }
        }
        return root;
    }
    public void postorder(){
        postorder(this.root);
        System.out.println();
    }
    private void postorder(TreeNode node ){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val+" ");
    }
    public static void main(String[] args){
        levelorder cl= new levelorder();
        cl.postorder();
    }
}
//[3,9,20,null,null,15,7]