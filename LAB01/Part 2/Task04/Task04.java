import java.util.InputMismatchException;
import java.util.Scanner;
public class Task04{
  public static void main(String[]args){
    
    try{
      Scanner sc=new Scanner(System.in);
      
      int x,n=sc.nextInt();
      int a[]=new int[n];
      
      
      a[5]=99;
      x=n/0;
    }
    
    catch(ArrayIndexOutOfBoundsException arr){
      System.out.println("Array Length is not correct");
    }
    
    catch(ArithmeticException arth){
      System.out.println("Can not divide by zero");
    }
    
    catch(InputMismatchException inp){
      System.out.println("Input is not correct");
    }
    
    catch(NegativeArraySizeException neg){
      System.out.println("Array legth can not be negative");
    }
    
    catch(Exception exc){
      System.out.println("Something wrong");
    }
    
    finally{
      System.out.println("THE END");
    }
    
  }
}