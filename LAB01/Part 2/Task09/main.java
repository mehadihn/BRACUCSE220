public class main extends QuadEqn{
  public static void main (String[]args){
    
    QuadEqn q = new QuadEqn (1, -5, 6);
    
    System.out.println("Equation is: ");
    
      System.out.print(q.a+"x2");
      
      if(q.b<0){
        System.out.print(q.b+"x");
      }
      else{
        System.out.print("+"+q.b+"x");
      }
      
      if(q.c<0){
        System.out.print(q.c);
      }
      else{
        System.out.print("+"+q.c);
      }
      
      System.out.println("\nthe root is:");
      System.out.println(q.root());
      
  }
}
  