import java.util.Scanner;
public class Task11{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    System.out.println(allDigitOdd(num));
  }
  
  
  public static boolean allDigitOdd(int num){
    int temp = num;
    int count = 0;
    
    while(temp!=0){
      temp/=10;
      count++;
    }
    
    int[] arr = new int [count];
    
    int temp1 = num;
    int i = 0;
    
    while(temp1!=0){
      arr[i] = temp1%10;
      temp1/=10;
      i++;
    }
    
    boolean check = false;
    for(int j = 0 ; j<arr.length ; j++){
      if(arr[j]%2==0){
        check = false;
        break;
      }
      else {
        check = true;
      }
    }
    return check;
    
  }
}