public class CombineConstructors{
    public static void main(String [] args){
        Student s1 = new Student("chandresh kuamr " , 202);
        s1.display();
        Student s2 = new Student(s1);
        s2.display();
        Student s3 = new Student();
        s3.display();

    }
} class Student{
    String name;
    int roll;
    Student(String name , int roll){
        this.name = name;   //Parameterized Constructor hai  q ki  humne  ise value asing kar ke diya 
        this.roll = roll;


    }
    Student(Student other){
        this.name = other.name; //  yah  Copy Constructor hai isme koi bhi value asign nhi kiya balaki copy kiya gaya hai 
        this.roll = other.roll;
    }
    Student(){
    this("unknow",0); // yah default  constructure hai 
    }
    void display(){
         System.out.println("Name: " + name + ", Roll No: " + roll);
    }


}