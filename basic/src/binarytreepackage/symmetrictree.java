package binarytreepackage;

public class symmetrictree {
    public class treenode{
        int val;
        treenode left;
        treenode right;
        treenode(){

        }
        treenode(int val){
            this.val = val;
        }
        treenode(int val,treenode left,treenode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    class solution{
        public boolean issymmetric(treenode root){
            return symmetric(root.left,root.right);//humne ek aur function banaaya jismein main root node ke left aur right child ko bheja
        }
        public boolean symmetric(treenode root1,treenode root2){//then yaha pe aakar voh root as tree treat honge
            if(root1 == null && root2 == null){
                return true;
            }
            if(root1 == null || root2 == null){//it means ki sirf left subtree null hai aur right nhi hai toh false degaa,means 2 mein se 1 null hai
                return false;
            }
            if(root1.val != root2.val){
                return false;//
            }
            boolean f1 = symmetric(root1.left,root2.right);
            boolean f2 = symmetric(root1.right,root1.left);
            return f1 && f2;
        }

    }
}
