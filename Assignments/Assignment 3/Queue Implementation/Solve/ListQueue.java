//Name : Mehadi Hassan
//ID : 17101177
//Sec : 01
//Assignment : 03 : List Queue
public class ListQueue implements Queue{
  int size;
  Node front;
  Node rear;
  
  
  public ListQueue(){
    size = 0;
    front = null;
    rear = null;
  }
  
// The number of items in the queue
  public int size(){
    return size;
  }
  
  
// Returns true if the queue is empty
  public boolean isEmpty(){
    if(size == 0){
      return true;
    }
    else{
      return false;
    }
  }
  
// Adds the new item on the back of the queue, throwing the
// QueueOverflowException if the queue is at maximum capacity. It
// does not throw an exception for an "unbounded" queue, which 
// dynamically adjusts capacity as needed.
  public void enqueue(Object o) throws QueueOverflowException{
    Node t = new Node (o , null);
    if(size == 0){
      front = t;
      rear = t;
    }
    else{
      rear.next = t;
      rear = rear.next;
    }
    size++;
    
  }
  
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
  public Object dequeue() throws QueueUnderflowException{
    if (size == 0){
      throw new QueueUnderflowException();
    }
    else{
      Object t = front.val;
      front = front.next;
      size--;
      return t;
    }
  }
  
// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
  public Object peek() throws QueueUnderflowException{
    if(size==0){
      throw new QueueUnderflowException();
    }
    else{
      return front.val;
    }
  }
  
  
// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
  public String toString(){
    if(size == 0){
      return "Empty Queue";
    }
    String s = "[ ";
    for(Node temp = front ; temp!=null ; temp = temp.next){
      s = s+temp.val+" ";
    }
    s = s+"]";
    return s;
  }
  
// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
  public Object[] toArray(){
    Object a[] = new Object[size];
    Node temp = front; 
    for(int i = 0 ; i<size ; i++){
      a[i] = temp.val;
      temp = temp.next;
    }
    return a;
  }
  
// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
  public int search(Object o){
    int count = 0;
    for(Node temp = front ; temp!=null ; temp = temp.next){
      if(temp.val == o){
        return count;
      }
      count++;
    }
    
    return -1;
    
  }
}