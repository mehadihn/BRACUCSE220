import java.util.Scanner;
public class Task07{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int[] arr = new int [10];
    
    for(int i = 0 ; i<arr.length ; i++){
      arr[i] = sc.nextInt();
    }
    
    System.out.println("enter a number for index");
    int ind = sc.nextInt();
    
    for(int i  = 1 ; i<=arr[ind] ; i++){
      System.out.print("*");
    }
    
    System.out.println();
    
  }
}