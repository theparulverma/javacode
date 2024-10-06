package com.parul.packages.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    static long population;//static variable
    boolean married;
    static void message(){
        System.out.println("Hello World");
        //System.out.println(this.age); cant use this over here bcoz yeh static function hai aur static function ke ander non static use nhi kar sakte.
    }
    public Human(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;//this variable will not be used,use only class name.
    }

}
