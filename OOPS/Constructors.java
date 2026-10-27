public class Constructors{
    public static void main( String [] args){
        Student s1 = new Student(" chandresh"); // initialization  soruwat ki value ko call karta hai 
        Student s2 = new Student(63);
        System.out.println(s1.name);
        System.out.println(s2.roll);
        Stud s3 = new Stud();
       


    }
}
class Student{
    String name;
    int roll;
 
    Student(String name ){   
        this.name = name;

    }Student(int roll){
        this.roll = roll;
    }
}
 class Stud{
    String name;
    int roll;

    Stud(){
        System.out.println(" unknow");
        System.out.println(0);

    }
}