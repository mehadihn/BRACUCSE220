import java.util.Scanner;
public class Task02{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    int[] arr = new int[10];
    
    for(int i =0 ; i< arr.length ; i++){
      arr[i] = sc.nextInt();
    }
    
    int big = arr[0];
    int bigInd = 0;
    int small = arr[0];
    int smallInd = 0;
    for (int  i = 0 ; i<arr.length ; i++){
      
      if(arr[i]>big){
        big = arr[i];
        bigInd = i;
      }
      
      else if (arr[i]<small){
        small = arr[i];
        smallInd = i;
      }
    }
    
    int temp = arr[bigInd];
    arr[bigInd] = arr[smallInd];
    arr[smallInd] = temp;
    
    for (int i = 0 ; i<arr.length-1 ; i++){
      System.out.print(arr[i]+", ");
    }
    System.out.println(arr[arr.length-1]);
    
  }
}
