/*package binarytreepackage;

public class balancedbinary {

    public class TreeNode {
        int val;
        diameter.TreeNode left;
        diameter.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, diameter.TreeNode left, diameter.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }*/
  /*  class Solution {//complexity O(n2)
        public boolean isBalanced(TreeNode root) {
        return balanced(root);
        }
        public boolean balanced(TreeNode root){
            if(root == null){
                return true;
            }
            boolean left = balanced(root.left);
            boolean right = balanced(root.right);
            boolean sb = Math.abs(height(root.left)-height(root.right)) <= 1;
            return left&&right&&sb;
        }
        public int height(diameter.TreeNode root){
            if(root == null){
                return -1;
            }
            int righth=height(root.right);
            int lefth=height(root.left);
            return Math.max(righth,lefth)+1;
        }
    }
}*/

/*class Solution{//O(n)
    public boolean isBalanced(diameteropti.TreeNode root){
        return calculate(root).balance;
    }
    public balancedpair calculate(diameteropti.TreeNode root){
        if(root == null){
            return new balancedpair();
        }
        balancedpair lbp=calculate(root.left);//left balanced pair
        balancedpair rbp=calculate(root.right);//right balanced pair
        balancedpair sbp=new balancedpair();//self balanced pair
        sbp.ht = Math.max(lbp.ht,rbp.ht)+1;
        boolean sb =Math.abs(lbp.ht-rbp.ht)<=1;
        sbp.balance=lbp.balance && rbp.balance && sb;
        return sbp;

        // return sbp;
    }
    class balancedpair{
        int ht=-1;
        boolean balance=true;
    }
}*/
