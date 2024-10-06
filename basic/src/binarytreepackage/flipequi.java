package binarytreepackage;

public class flipequi {
    public class treenode{
        int val;
        symmetrictree.treenode left;
        symmetrictree.treenode right;
        treenode(){

        }
        treenode(int val){
            this.val = val;
        }
        treenode(int val, flipequi.treenode left, flipequi.treenode right){
            this.val=val;
           // this.left=left;
            //this.right=right;
        }
    }
    class Solution{
        public boolean flipequiv(treenode root1, treenode root2){
         return equi(root1,root2);
        }
        public boolean equi(treenode root1,treenode root2){
            if(root1 == null && root2 == null){
                return true;
            }
            if(root1 == null || root2 == null){
                return false;
            }
            if(root1.val != root2.val){
                return false;
            }
           // boolean mirror= equi(root1.left,root2.right) && equi(root1.right,root2.left);
            //boolean flip = equi(root1.left,root2.left) && equi(root1.right,root2.right);
            //return mirror || flip;
            return true;
        }
    }
}
