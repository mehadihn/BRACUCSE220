import java.util.Scanner;
import java.util.Stack;//you should use the stack you have built in assignment 03. If you are using your own stack, remove this line; otherwise, import & use java's default stack class.
public class CSE220Assignment04{
  public static String postFixBuilder(String s){
    Stack  stack = new Stack();
    String post = "";
    
    for(int i = 0 ; i <s.length(); i++){
      char c = s.charAt(i);
      
      if(Character.isLetterOrDigit(c)){
        post = post+c;
      }
      else if (c == '('){
        stack.push(c);
      }
      else if (c == ')'){
        while (!stack.isEmpty() && (char)stack.peek() != '('){
          post += stack.pop();
        }
        if (!stack.isEmpty() && (char)stack.peek() != '('){
          return "Invalid Expression"; }         
        else{
          stack.pop();
        }
        
      }
      else{ 
        while (!stack.isEmpty() && prec(c)<=prec((char)stack.peek())){
          post = post + stack.pop();
        }
        stack.push(c);
        
        //remove this line
        
      }
    }
    while (!stack.isEmpty()){
            post += stack.pop();
    }
    return post;
  }
  public static int prec (char c){
    int p = 0;
    if(c == '+' || c == '-'){
      p = 1;
    }
    else if(c == '*' || c == '/'){
      p = 2;
    }
    return p;
  }

    public static int postFixEvaluator(String s){
        Stack stack =new Stack();
        char []a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>='0' && a[i]<='9'){
                int x=((int)a[i])-48;
                stack.push(x);
            }
            else{
                int x=(int)stack.pop();
                int y=(int)stack.pop();
                int z=0;
                if(a[i]=='+'){
                    z=y+x;
                }
                if(a[i]=='-'){
                    z=y-x;
                }
                if(a[i]=='*'){
                    z=y*x;
                }
                if(a[i]=='/'){
                    z=y/x;
                }
                if(a[i]=='%'){
                    z=y%x;
                }
                stack.push(z);
            }
        }
        int result=(int)stack.pop();
        return result;
    }
  
  public static void main(String[]args){
    String exp=new Scanner(System.in).next();
    String postFixExp = postFixBuilder(exp);
    System.out.println("Post Fix Expression: "+postFixExp);
      int result = postFixEvaluator(postFixExp);
      System.out.println("Answer: "+result);
  }
  
}