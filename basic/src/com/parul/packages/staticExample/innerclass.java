package com.parul.packages.staticExample;

public class innerclass {//outside class static nhi ho sakti jo uske ander hoti hai voh static ho sakti hai.iske upper koi aur class nhi hai.
    static class test{//yeh vali class innerclass pe depend karti hai.jab non stAtic hogii lekin jab static hogi toh voh depend nhi karegiii.on the objects of innerclass
        String name;
        public test(String name){//constructor
            this.name = name;
        }
    }

    public static void main(String[] args) {
       test a = new test("parul");
        test b = new test("rahul");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
//static class A {
//}yeh class nhi ban sakti static
