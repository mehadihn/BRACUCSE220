import java.util.Scanner;
public class Task08{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("enter the size of matrices");
    int s = sc.nextInt();
    int[] arr1 = new int [s];
    int[] arr2 = new int [s];
    
    int[] result = new int [s];
    
    System.out.println("enter the numbers for the first matrix");
    for(int i = 0 ; i<arr1.length ; i++){
      arr1[i] = sc.nextInt();
    }
    
    System.out.println("enter the numbers for the second matrix");
    for(int i = 0 ; i<arr2.length ; i++){
      arr2[i] = sc.nextInt();
    }
    
    for(int i = 0 ; i<s ; i++){
      result[i] = 5*arr1[i]-arr2[i];
    }
    
    System.out.print("Answer is: [");
    
    for(int i = 0 ; i<result.length-1 ; i++){
      System.out.print(result[i]+" ");
    }
    
    System.out.println(result[result.length-1]+"]");
    
  }
}
      
      
      
      
      
      
      
      
      
    
    