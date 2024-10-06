package com.parul.packages.properties.inheritance;

public class box {
    private double l;//you can use this variable only in this class/file  as it is private
    double h;
    double w;
    box(){
        this.h =-1;
        this.l =-1;
        this.w =-1;
    }
    //cube
    box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    box(double l,double h,double w){
        this.l =l;
        this.h =h;
        this.w =w;

    }
    box(box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }

}
