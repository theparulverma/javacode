import java.util.*;
 public class introoops {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];
        Student parul= new Student();
        //parul.rno=110;
        //parul.names="Parul Verma";
        //parul.marks=90.f;

        System.out.println(parul.rno);
        System.out.println(parul.names);
        System.out.println(parul.marks);
       // parul.changeName("Shoelover ");
        //parul.greeting();
        Student random = new Student(parul);
       System.out.println(random.names);
       Student random2= new Student();//yeh automatically default constructor ko call karegaa
        System.out.println(random2.names);
        Student one = new Student();
        Student two = one;
        one.names ="Something Something";
        System.out.println(two.names);
    }
}  //create class
    class Student{
        int rno;
        String names;
        float marks=92.f;
//jo yaha value hogi usse pehle prefernce di jayegii
        //we need a way to add the values of the above properties object by object
        void greeting(){
            System.out.println("Hello: My name is "+this.names );
        }
        void changeName(String newName) {
        names = newName;
        }
        Student(Student other){
            this.names=other.names;//other ki jagah kunal replace hoga aur this ke jagah other replace hoga
            this.rno=other.rno;
            this.marks=other.marks;
        }
        Student(){
            //this is used to call a constructor from another constructor
            //internally :new Student(110,"person",99);
            this(110,"awii",100.0f);
        }
       // Student(){
          //  this.rno=110;
            //this.names="Parul Verma";
            //this.marks=90.5f;
        //}
        //Student ishika = new Student(110,"Ishika",80.2f);
        //here this will be replaced with ishika
        Student(int rno,String names,float marks){//yeh default constructor h
            this.rno=rno;
            this.names=names;
            this.marks=marks;
        }
    }


