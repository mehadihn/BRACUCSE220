import java.util.Scanner;
public class Task10{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int[] arr = {1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
    
    System.out.println("Enter Position: ");
    int pos = sc.nextInt();
    
    System.out.println("Left Rotate:");
    
    for(int i = pos ; i<arr.length ; i++){
      System.out.print(arr[i]+", ");
    }
    
    for(int i = 0 ; i<pos-1; i++){
      System.out.print(arr[i]+", ");
    }
    
    System.out.println(arr[pos-1]+"\n");
    
    System.out.println("Right Rotate:");
    
    for(int i = arr.length-pos ; i<arr.length ; i++){
      System.out.print(arr[i]+", ");
    }
    
    for(int i = 0 ; i<(arr.length-pos)-1; i++){
      System.out.print(arr[i]+", ");
    }
    System.out.println(arr[(arr.length-pos)-1]);
    
  }
}