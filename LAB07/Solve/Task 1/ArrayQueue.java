//Name : Mehadi Hassan
//ID : 17101177
//Sec : 01
//Lab : 07 : Task 01: Array Queue
public class ArrayQueue implements Queue{
  int size;
  int front;
  int rear;
  Object [] data;
  
  public ArrayQueue(){
    size=0;
    front = -1;
    rear = -1;
    data = new Object[5];
  }
  // The number of items in the queue
  public int size(){
    return size;
  }
  
// Returns true if the queue is empty
  public boolean isEmpty(){
    if (size==0){
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
    if (data.length == size){
      throw new QueueOverflowException();
    }
    else if(size==0){
      data[size] = o;
      size++;
      front++;
      rear++;
    }
    else{
     rear = (rear+1)%data.length;
      data[rear] = o;
      size++;
    }
    
  }
  
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
  public Object dequeue() throws QueueUnderflowException{
    if(size==0){
      throw new QueueUnderflowException();
    }
    else{
      Object temp = data[front];
      data[front] = null;
      front = (front+1)%data.length;
      size--;
      return temp;
    }
  }
  
// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
  public Object peek() throws QueueUnderflowException{
    if(size == 0){
      throw new QueueUnderflowException();
    }
    else{
      return data[front];
    }
  }
  
// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
  public String toString(){
    if(size==0){
      return "Empty Queue";
    }
    String out ="[ ";
    int j = front;
    for(int i = 0 ; i<size; i++){
      out = out+data[j]+" ";
      j = (j+1)%data.length;
    }
    out = out+"]";
    return out;
  }
  
// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
  public Object[] toArray(){
    Object[] arr = new Object[size];
    int i = front;
    for(int j = 0 ; j<size ; j++){
      arr[j] = data[i];
      i = (i+1)%data.length;
    }
    return arr;
  }
  
// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
  public int search(Object o){
    int count = 0;
    for(int i = 0 ; i<data.length ; i++){
      if(data[i] == o){
        return count;
      }
      count++;
    }
    
      return -1;
    }
}
