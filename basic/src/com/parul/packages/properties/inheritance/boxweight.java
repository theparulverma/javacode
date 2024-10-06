package com.parul.packages.properties.inheritance;

public class boxweight extends box {
   double weight;
   public boxweight(){//constructor
       this.weight=-1;
   }
   boxweight(boxweight other){
       super(other);
       weight = other.weight;
   }
   boxweight(double side,double weight){
       super(side);
       this.weight = weight;
   }
    public boxweight(double l,double h,double w,double weight){
       super(l,h,w);//it means call the parent class constructor
        // used to initialise values present in parent class
        System.out.println(this.w);//super.w bhi use kar sakte h ,reason
       this.weight= weight;//child class care about parent class.
    }
}
