import java.util.*;
public class practice1{
    public static void main(String [] mks){
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter the number :");
        // this the first methode of calculating avarege
        /*int a = sc.nextInt();
         System.out.println("enter the number :");
         int b = sc.nextInt();
          System.out.println("enter the number :");
          int c = sc.nextInt();
          int div = (a+b+c)/2;
          System.out.println(div);*/
          // this is second method of calculating the average 
          int i,n = 10, sum = 0;
          int average;
    
        for(i = 1; i <= n; i++){
             sum = sum+i;
             
        }
        average = sum/2;
        System.out.println(average);


    }
}