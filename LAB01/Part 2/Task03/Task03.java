import java.util.Scanner;
public class Task03{
    public static void main(String[]args){
        
      Scanner sc=new Scanner(System.in);
      
      int x,n=sc.nextInt();
      int a[]=new int[n];
      
      try{
        a[5]=99;
        x=n/0;
      }
      
      catch(ArrayIndexOutOfBoundsException arr){
        System.out.println("Array Length is not correct");
      }
      
      catch(ArithmeticException arth){
        System.out.println("Can not divide by zero");
      }
      
      finally{
        System.out.println("THE END");
      }
      
    }
}