import java.util.Scanner;
public class Task05{
  public static void main(String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int[] num = new int [15];
    int[] count = new int [10];
    
    for(int i = 0 ; i<num.length ; i++){
      
      num[i] = sc.nextInt();
      
      count[num[i]]++;
      
    }
    
    for(int i = 0 ; i<count.length ; i++){
      
      System.out.println(i+" was found "+count[i]+" times");
    }
  }
}
