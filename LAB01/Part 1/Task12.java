import java.util.Scanner;
public class Task12{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("enter first month:");
    int m1 = sc.nextInt();
    
    System.out.println("enter first day:");
    int d1 = sc.nextInt();
    
    System.out.println("enter second month:");
    int m2 = sc.nextInt();
    
    System.out.println("enter second day:");
    int d2 = sc.nextInt();
    
    System.out.println(before(m1, d1, m2, d2));
    
  }
  
  public static boolean before(int m1, int d1, int m2, int d2){
    
    boolean check = false;
    
    if(m1<=m2){
      if(d1<d2){
        check = true;
      }
    }
    
    else {
      check = false;
    }
    
    return check;
    
  }
}