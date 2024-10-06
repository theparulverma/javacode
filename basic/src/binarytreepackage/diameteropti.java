/*package binarytreepackage;

public class diameteropti {
    public class TreeNode {
        int val;
        diameter.TreeNode left;
        diameter.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, diameter.TreeNode left, diameter.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

   class Solution {
        public int diameterof(TreeNode root) {
            return diameter(root).dt;
    }
    public diapair diameter(TreeNode root){
        if(root == null){
            return new diapair();
        }
        diapair ldp = diameter(root.left);
        diapair rdp = diameter(root.right);
        diapair sdp = new diapair();
        int sd = ldp.ht+rdp.ht+2;
        sdp.dt=Math.max(sd,Math.max(ldp.dt,rdp.dt));
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
    }
    class diapair{
        int dt=0;
        int ht=-1;

    }
}*/
