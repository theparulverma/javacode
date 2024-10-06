package binarytreepackage;

public class bstclient {
    public static void main(String[] args) {
        int[] in={10,20,30,40,50,60,70,80,90};
        bst b = new bst(in);
        //b.inorder();
        b.preorder();
        System.out.println(b.max());
        System.out.println(b.find(30));
    }
}
