package com.parul.packages.properties.inheritance;

public class  main {
    public static void main(String[] args) {
       // box box1 =new box(4,5,6);//argument dega constructors ko uss hisab se output aayegaa
        //box box2 = new box(box1);
        //System.out.println(box1.l + " "+ box1.w +" " +box1.h);
       // boxweight box3 = new boxweight();
        //System.out.println(box3.h + " " + box3.weight);
        //box box5 = new boxweight(2,3,4,8);//type of refernce variable "box" determines what u can access
        //System.out.println(box5.w);
        //there are many variables in both parent and child classes.
         //u are given access to variables that are in ref type i.e.boxweight
        //hence u should have access to weight variable
        //this also means that ones u are trying to access (weight)should be intialised.
        //but there when the obj khudse parent class ka type hai voh kaise constructor of child class ko call karegaa
        //isliye error aa raha h box 6 mein
       // boxweight box6 = new box(2,3,4);//it is giving an error bcoz bozweight is a child of box and it cant a
        //System.out.println(box6);
        boxprice box = new boxprice(5,8,200);
        System.out.println(box.cost);

    }
}
