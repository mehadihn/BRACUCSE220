public class Main extends BankAccount{
  public static void main (String[]args){
    
    BankAccount acc1 = new BankAccount("John", "Mohakhali", "1001", 5000.25);
    BankAccount acc2 = new BankAccount("Tom", "Gulshan", "1002", 2564.25);
    BankAccount acc3 = new BankAccount("Jerry", "Banani", "1003", 8960.25);
    
    acc1.addInterest();
    acc3.addInterest();
    
    System.out.println(acc1);
    System.out.println(acc2);
    System.out.println(acc3);
  }
}
    
    
    