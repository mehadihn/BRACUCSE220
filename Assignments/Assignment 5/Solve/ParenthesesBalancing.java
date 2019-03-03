public class ParenthesesBalancing{
  public String eqn = "";
  
  public String check(String eqn ,int o){
    System.out.println(eqn);
    char[] c = eqn.toCharArray();
    Stack stack;
    if(o==1){
      stack = new ArrayStack();
    }
    else{
      stack = new ListStack();
    }
    
    for(int i = 0 ; i<eqn.length() ; i++){
      if(c[i] =='[' || c[i]=='{' || c[i]== '('){
        try{
          stack.push(i+1);
          stack.push(c[i]);
        }
        catch(StackOverflowException e){
          System.out.println("Stack Overflow");
        }
        
      }
      else if (c[i] ==']' || c[i]=='}' || c[i]== ')' ){
        try{
          if(stack.isEmpty()){
            return "This expression is NOT correct.\nError at charecter #"+(i+1)+"." +c[i]+" has not opened";
          }
          else{
            
            if((char)stack.peek() == '(' && c[i] == ')'){
              stack.pop();
              stack.pop();
            }
            else if ((char)stack.peek() == '{' && c[i] == '}'){
              stack.pop();
              stack.pop();
            }
            else if ((char)stack.peek() == '[' && c[i] == ']'){
              stack.pop();
              stack.pop();
            }
            else{
              Object a = stack.pop();
              return "This expression is NOT correct.\nError at charecter #"+stack.pop()+"." +a+" has not closed";
            }
          }
        }
        
        catch(StackUnderflowException e){
          System.out.println("Underflow");
        }
      }
    }
    
    if(!stack.isEmpty()){
      try{
        return stack.peek()+" not closed";
      }
      catch(StackUnderflowException e){
      }
    }
    return "This expression is correct.";
  }
  
}