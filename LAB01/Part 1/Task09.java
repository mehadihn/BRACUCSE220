import java.util.Scanner;
public class Task09{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int[] arr = new int [10];
    
    for(int i = 0 ; i<arr.length ; i++){
      arr[i] = sc.nextInt();
    }
    
    print(arr);
    square(arr);
    print(arr);
    
  }
    
    public static void print(int[] arr){
      
      for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      
    }
    
  
  
  public static void square(int[] arr){
    for(int i = 0 ; i<arr.length ; i++){
      arr[i]*=arr[i];
    }
  }
  
  
}