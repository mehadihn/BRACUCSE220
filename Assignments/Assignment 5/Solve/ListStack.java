public class ListStack implements Stack{
  int size;
  Node top;
  
  
  public ListStack(){
    size = 0;
    top = null;
  }
  
// The number of items on the stack
  public int size(){
    int count = 0;
    for(Node temp = top ; temp!=null ; temp = temp.next){
      count++;
    }
    return count;
  }
// Returns true if the stack is empty
  public boolean isEmpty(){
    if(top==null){
      return true;
    }
    return false;
  }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
  public void push(Object e) throws StackOverflowException{
    Node nTop = new Node (e , null);
    nTop.next = top;
    top = nTop;
    size++;
  }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
  public Object pop() throws StackUnderflowException{
    if(top==null){
      throw new StackUnderflowException();
    }
    else{
      
      Node oTop = top;
      top = top.next;
      oTop.next = null;
      size--;
      return oTop.val;
    }
  }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
  public Object peek() throws StackUnderflowException{
    if(top==null){
      throw new StackUnderflowException();
    }  
    return top.val;
  }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
  public String toString(){
    Node nTop = top;
    if(nTop==null){
      return "Empty Stack";
    }
    else{
    String s = "[ ";
    
    for(nTop = top; nTop.next!=null ; nTop = nTop.next){
      s = s+ nTop.val+" ";
    }
    s = s + nTop.val +" ]";
    
    return s;
  }
  }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
  public Object[] toArray(){
    Object[] nArray = new Object[size];
    int i = 0;
    for(Node nTop = top;nTop!=null ; nTop = nTop.next){
      nArray[i] = nTop.val;
     i++;
    }
    
    return nArray;
  }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
  public int search(Object e){
    int count = 0;
    for(Node nTop = top ; nTop!=null ; nTop = nTop.next){
      if(nTop.val == e){
        break;
      }
      count++;
    }
    if(count!=0){
      return count;
    }
    return -1;
  }
}