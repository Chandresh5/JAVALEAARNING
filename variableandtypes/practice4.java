import java.util.*;
public class practice4{
    public static void main(String [] mks){
        Scanner mk = new Scanner(System.in);
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f =3.14f;
        double d =99.9954;
         double result = ( f * b) + (i % c) - (d * s);
         System.out.println(result);
    }
}