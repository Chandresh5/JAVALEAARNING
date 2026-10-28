public class CombineConstructors{
    public static void main(String [] args){
        Student s1 = new Student("chandresh kuamr " , 202);
        s1.display();
        Student s2 = new Student(s1);
        s2.display();

    }
} class Student{
    String name;
    int roll;
    Student(String name , int roll){
        this.name = name;
        this.roll = roll;


    }
    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
    }
    void display(){
         System.out.println("Name: " + name + ", Roll No: " + roll);
    }


}