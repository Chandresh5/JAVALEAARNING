import java.util.*;
public class casting{
    public static void main(String [] mkc){
        Scanner sc =new Scanner(System.in);
       /*char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
        int number3 = 97;
        int number4 = 107;
        char ch1 = (char) number3;
        char ch3 = (char) number4;
        System.out.println(ch1);
        System.out.println(ch3);
         int  num= sc.nextInt();
        
        if(num >= 97 && num <= 122){
            long upper =Character.toUpperCase(num);
            System.out.println(upper);
        }else if( num >= 65 && num <= 90){
            long lower =Character.toLowerCase(num);
             System.out.println(lower);
        }*/
        System.out.println("enter the char:");
        
        char ch = sc.next().charAt(0);
        
        if(ch >='a' && ch <= 'z'){
            char upper =Character.toUpperCase(ch);
            System.out.println(upper);
        }else if( ch >= 'A' && ch <= 'Z'){
            char lower =Character.toLowerCase(ch);
             System.out.println(lower);
        }
       
         
       

    }
}