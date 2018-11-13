public class BankAccount{
  
  public String name;
  public String address;
  public String AccountID;
  public double balance;
  
  public BankAccount(){
  }
  
  public BankAccount(String n, String a, String i, double b){
    this.name = n;
    this.address = a;
    this.AccountID = i;
    this.balance = b;
  }
  
  public String getName(){
    return name;
  }
  
  public void setName(String n){
    this.name = n;
  }
  
  public String getAccountID(){
    return AccountID;
  }
  
  public void setAccountID(String i){
    this.AccountID = i;
  }
  
  public String getAddress(){
    return address;
  }
  
  public void setAddress(String a){
    this.address = a;
  }
  
  public double getBalance(){
    return balance;
  }
  
  public void setBalance(double c){
    this.balance = c;
  }
  
  public void addInterest(){
    this.balance = this.balance+(this.balance*7/100);
  }
  
  public String toString(){
    return "Name:" + name+"\nAddress: " + address +
      "\nAccountID: " + AccountID + "\nBalance: " + balance+"\n";
  }
  
}