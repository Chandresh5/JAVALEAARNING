public class Constructorspractice{
    public static void main(String [] mk){
        Book b1 = new Book("Bible",1000);
        b1.display();
        Book b2 = new Book(b1);
        b2.display();
        Book b3 = new Book();
        b3.display();

    }
} class Book{
    String bookname;
    double price;
    Book(String bookname , double price){
        this.bookname = bookname;
        this.price = price;
    }
    Book( Book other){
        this.bookname = other.bookname;
        this.price = other.price;
    }
    Book(){
        this("unknow" ,  0);
    }
    void display(){
        System.out.println("Bookname:" + bookname +  ", price:" + price);

    }
}