public class ClassIntro{
    public static void main(String [] args){
        Pen p1 = new Pen (); // create  a pen  object called p1 
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Student s1 = new Student();
        s1.setName(" chandresh");
        s1.setAge(18);
        System.out.println(s1.age);
        System.out.println(s1.name);
        Student s2 = new Student();
        s2.calcPercentage(85,90,78);
       
        System.out.println(s2.percentage);
        BankAccount mk = new BankAccount();
        mk.username="chandresh";
        System.out.println(mk.username);
        mk.setPassword("chansei2993");
        

    }

} 
class Pen{
    String color;
    int tip;
     void setColor(String newColor){
        color = newColor;
     }

    void setTip(int newTip) {
        tip = newTip;

     }


}
class BankAccount{
     public  String username;
      private String Password;
      public void setPassword( String pwd){
        Password = pwd;
      }

}
class Student{
    String name;
    int age;
    float percentage;
    void setName(String newName){
        name = newName; 
    }
    void setAge(int newAge){
        age = newAge;
    }
    void calcPercentage(int phy , int chem , int math){
        percentage = (phy + chem + math )/3;
    }

}