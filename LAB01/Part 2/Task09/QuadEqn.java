public class QuadEqn{
  
  public int a;
  public int b;
  public int c;
  public double solution;
  
  public QuadEqn(){
  }
  
  public QuadEqn(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  public double root(){
    return (-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
  }
  
}