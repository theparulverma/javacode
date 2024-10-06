 class Pen {
    String color;
    String type;
    public static void write(){
        System.out.println("Writing Something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }

}

public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";
        p1.write();
        Pen p2 = new Pen();//new se, uss memory heap ke andar 1 jagah store ho jayegii
        p2.color="black";
        p2.type ="ball";
        p1.printcolor();
        p2.printcolor();
    }

}
