package binarytreepackage;

public class ancestor {


    // Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            //ancestor means uske purvaaj ,papa things condition lowest toh minimum nikalana
           return common(root, p, q);
        }
        public TreeNode common(TreeNode root,TreeNode p,TreeNode q){
            if(root == null){
                return null;
            }
            if(root==p||root==q){
                return root;//agar root hi p ya q hai toh vohi uska lowest common ancestor hoga
            }
            TreeNode left = common(root.left,p,q);
            TreeNode right = common(root.right,p,q);
            if(left!=null && right!=null){
                return root;//agar left right mein values hqi toh uska ancestor uska root hi hoga
            }
            else if(left==null){
                return right;
            }
            else{
                return left;
            }

        }
    }
}
