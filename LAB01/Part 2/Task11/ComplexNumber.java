public class ComplexNumber extends RealNumber{ 
  private double imaginaryValue = 1.0; 
  
  
  public ComplexNumber(){ 
  } 
  
  public ComplexNumber(int x, int y){ 
    super.setRealValue(x); 
    imaginaryValue = y; 
  }
  
  public String toString() { 
    return "Real Part: "+getRealValue()+"\nImaginaryPart: "+getImaginaryValue(); 
  } 
  
  public void ping() { 
    System.out.println("I'm in ComplexNumber  class"); 
  } 
  
  public void check(){ 
    ping(); 
    super.ping(); 
    System.out.println("Checking ended."); 
  } 
  
}