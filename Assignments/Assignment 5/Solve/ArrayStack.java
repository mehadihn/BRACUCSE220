public class ArrayStack implements Stack{
  int size;
  Object [] data;
  
  public ArrayStack(){
    size=0;
    data = new Object[10];
  }
  
// The number of items on the stack
  public int size(){
    return size;
  }
// Returns true if the stack is empty
  public boolean isEmpty(){
    boolean c = false;
    if(size==0){
      c = true;
    }
    return c;
  }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
  public void push(Object e) throws StackOverflowException{
    if(data.length == size){
      throw new StackOverflowException();
    }
    else{
      data[size] = e;
      size++;
    }
  }
  
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
  public Object pop() throws StackUnderflowException{
    if(size==0){
      throw new StackUnderflowException();
    }
    else{
      Object temp = data[size-1];
      data[size-1] = null;
      size--;
      return temp;
    }
  }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
  public Object peek() throws StackUnderflowException{
    if(size == 0){
      throw new StackUnderflowException();
    }
    else{
      
    return data[size-1];
  }
    
  }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
  public String toString(){
    if(size==0){
      return "Empty Stack";
    }
    else{
    
    String out = "[ ";
    for(int i = size-1 ; i>=1; i--){
      out = out+data[i]+" ";
  }
    out = out+data[0]+" ]";
    return out;
  }
  }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
  public Object[] toArray(){
    Object[] newA = new Object [size];
    int j = 0;
    for(int i = size-1 ; i >=0 ; i--){
      newA[j] = data[i];
      j++;
    }
    return newA;
  }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
  public int search(Object e){
    int count = 0;

    for(int i = size-1 ; i>=0 ; i--){
      if(data[i]==e){
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