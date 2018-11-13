import java.util.Scanner;
public class Task06{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num = sc.nextInt();
    char[] c = String.valueOf(num).toCharArray();
    int count = 0;
    
    int j = c.length-1;
    
    for(int i = 0 ; i<c.length/2; i++){
      if (c[i] == c[j]){
        count++;
      }
      
      j--;
      
    }
    
    if(count == c.length/2){
      System.out.println("It is a palindrome");
    }
    else{
      System.out.println("It is not a palindrome");
    }
    
  }
}
      