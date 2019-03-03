import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    ParenthesesBalancing a = new ParenthesesBalancing();
    System.out.println("Enter Your Choice:\n1.Array Based\n2.Linkedlist Based");
    int c = sc.nextInt();
     System.out.println("Enter Your Equation:");
     String eqn = sc.next();
     System.out.println(a.check(eqn , c));
  }
}