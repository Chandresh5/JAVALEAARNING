public class Constructpract2{
    public static void main(String [] mk){
        Bankaccount b1 = new Bankaccount(" chandresh kumar bind " , 124044065010L, 1000000);
        b1.display();
        Bankaccount b2 = new Bankaccount(b1);
        b2.display();
        Bankaccount b3 = new Bankaccount();
        b3.display();

    }
} class Bankaccount{
    String bankaccount;
    long accountnumber;
    double balance;
    Bankaccount( String bankaccount, long accountnumber , double balance){
        this.bankaccount = bankaccount;
        this.accountnumber = accountnumber;
        this.balance = balance;

    }Bankaccount(Bankaccount other){
        this.bankaccount = other.bankaccount;
        this.accountnumber = other.accountnumber;
        this.balance = other.balance;

    }Bankaccount(){
        this("unknow" , 0 , 0);
    }
    void display(){
        System.out.println(" bank :" + bankaccount + " account:" + accountnumber + " balance:" + balance);
    }


}
