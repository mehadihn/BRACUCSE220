import java.util.Scanner;
public class Test{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    
    BookRecord b = new BookRecord();
    
    System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record\nEnter 5 to Exit");
    
    int v = 0;
    
    while (v!=5){
      v = sc.nextInt();
      switch(v){
        
        case 1 : 
          Scanner sc1 = new Scanner (System.in);
          System.out.println("Enter Name: ");
          String n = sc1.nextLine();
          System.out.println("Enter Author: ");
          String a = sc1.nextLine();
          System.out.println("Publisher: ");
          String p = sc1.nextLine();
          b.AddRecord(n , a , p);
          System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record\nEnter 5 to Exit");
          break;
          
        case 2 : 
          b.PrintRecord();
          System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record\nEnter 5 to Exit");
          break;
          
        case 3:
          System.out.println("Enter ID to Delete:");
          b.DeleteRecord(sc.nextInt());
          System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record\nEnter 5 to Exit");
          break;
          
        case 4:
          System.out.println("Enter ID to Edit:");
          b.EditRecord(sc.nextInt());
           System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record\nEnter 5 to Exit");
           break;
          
        case 5:
          break;
          
          
          
        default :
          System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record\nEnter 5 to Exit");
          
      }
    }
  }
}