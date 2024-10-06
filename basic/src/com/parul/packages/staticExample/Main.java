package com.parul.packages.staticExample;

public class Main {
    public static void main(String[] args) {
    // Human parul= new Human(22,"mini",20000000,false);if we comment out these objects tab bhi hum access kar sakte hai bina object banaye kyuki static variable se.
     //Human paro= new Human(20,"pikachu",10000000,false);
        //System.out.println(Human.population);
        //System.out.println(Human.population);
       // greeting();//kisi static method se hum non static vale ko call nhi kar sakte
    }
    //this is not depends on objects  kyuki yeh static hai
    static void fun(){
       //greeting();
    }

    void greeting(){
        System.out.println("Hello World");
    }

}
