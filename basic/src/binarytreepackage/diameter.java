package binarytreepackage;

public class diameter {

     // Definition for a binary tree node.
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
     class Solution{
          public int diameterof(TreeNode root){
              if(root == null){
                  return 0;
              }
              int leftd=diameterof(root.left);
              int rightd=diameterof(root.right);
              int sumd=height(root.left)+height(root.right)+2;
              return Math.max(rightd,Math.max(rightd,sumd));
          }
          public int height(TreeNode root){
               if(root == null){
                   return -1;
               }
               int righth=height(root.right);
               int lefth=height(root.left);
               return Math.max(righth,lefth)+1;
          }
     }

}
