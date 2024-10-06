package binarytreepackage;

//public class binarytreeclient {
    public class binarytreeclient {
        public static void main(String[] args) {
            binarytree bt = new binarytree();//binarytree jo humne class banayi h uska object banaya bt phir uske baad binarytree mein jo constructor banaya h voh call hoga aur create kardegaa tree ko
            bt.display();
            System.out.println(bt.find(80));
            System.out.println(bt.max());
            System.out.println(bt.ht());
            //bt.preoder();
            bt.inorder();
            bt.postorder();
            bt.preorder();
            bt.levelorder();
        }
    }


