package binarytreepackage;

public class deletenodebst {
     //Definition for a binary tree node.
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

    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            //first we have to find or search that node after that we have to delete node and maintain as bst
            return delete(root,key);
        }
        public TreeNode delete(TreeNode root,int key){
            //jo value insert karege voh badi hai root se toh obviously right insert karege
            //agar leaf node delete karna h toh vaha se null return kardo toh jo uss se pehle vale ke right ya left mein jaha pe bhi null return karte
            if(root == null){
                return null;
            }
            if(root.val<key){
                root.right = delete(root.right,key);
            }
            else if(root.val>key){
                root.left = delete(root.left,key);
            }
            else{
                //1 child same for 0 child
                if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.right;
                   }
                else{
                    int max = max(root.left);//means maximum value nikal ke aayega left subtree mein se
                    root.left =delete(root.left,max);
                    root.val =  max;
                }
            }
            return root;
        }
        private int max(TreeNode node){
            if(node == null){
                return Integer.MIN_VALUE;
            }
            // int left = max(node.left);
            int right = max(node.right);
            return Math.max(node.val,right);
        }
    }
}
