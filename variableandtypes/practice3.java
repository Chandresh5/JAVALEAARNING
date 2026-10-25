import java.util.*;
public class practice3{
    public static void main( String [] mks){
        Scanner mk = new Scanner(System.in);
        System.out.println(" enter the price pencil:");
        double pencil = mk.nextDouble();
         System.out.println(" enter the price pen:");
         double pen = mk.nextDouble();
         System.out.println(" enter the price eraser:");
         double eraser = mk.nextDouble();
         double total = pencil+pen+eraser;
         System.out.println(total);
         double tax = total*18/100;
          System.out.println(tax);
         double finalbill = tax+total;
          System.out.println(finalbill);
    }
}