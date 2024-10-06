package questions;
import javax.swing.tree.TreeNode;
import java.util.*;

 // Definition for a binary tree node.

public class inorder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> result = new ArrayList<>();
        return inorder(root,result);
    }
    public List<Integer> inorder(TreeNode root,List<Integer> result){
        if(root== null){
            return new ArrayList<>();
        }
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
        return result;
    }
}
