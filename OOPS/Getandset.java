public class Getandset{
    public static void main(String [] mks){
        Person p1 = new Person();
        p1.setName("chandresh");
        System.out.println(p1.getName());
        p1.setAge(22);
        System.out.println(p1.getAge());
        Emplooye e1 = new Emplooye();
        e1.setEmpname("vishal");
        System.out.println(e1.getEmpname());
        e1.setSalary(40000);
        System.out.println(e1.getSalary());
        Rectangle r1 = new Rectangle();
        r1.setWidth(23);

        System.out.println(r1.getWidth());
        r1.setLenght(25);
        System.out.println(r1.getLenght());
        Movies m1 =  new Movies();
        m1.setName("jailer 2 ");
        System.out.println(m1.getName());
        m1.setRating(9.5);
        System.out.println(m1.getRating());

    }
}
class Person{
    private String name;
    private  int age;
    String getName(){
        return this.name;

    }
    int getAge(){

        return this.age;
    }
    void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }

}
class Emplooye{
     private String empname;
    private  double salary;
    String getEmpname(){
        return this.empname;
    }
    public double getSalary(){
        return this.salary;
    }

    void setEmpname(String newEmpname){
        this.empname = newEmpname; 
    }
    void setSalary(double newSalary){
        this.salary = newSalary;
    }

}
class Rectangle{
     private double  lenght;
     private double width;
    double getLenght(){
        return this.lenght;
    }
    double getWidth(){
        return this.width;
    }
    void setLenght( double newLenght){
        this.lenght = newLenght;
    }
    void setWidth(double newWidth){
        this.width = newWidth;
    }

}
class Movies{
     private String name;
     private double rating;
    String getName(){
        return this.name;
    }
    double getRating(){
        return this.rating;
    }
    void setName( String newName){
        this.name = newName;
    }
    void setRating(double newRating){
        this.rating = newRating;
    }

}