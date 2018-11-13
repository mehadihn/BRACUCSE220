//Name : Mehadi Hassan
//ID : 17101177
//Sec : 01
//Lab : 04 : Linked List


public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head = new Node(a[0],null);
    Node tail = head;
    for (int i = 1 ; i<a.length ; i++){
      Node x = new Node (a[i] , null);
      tail.next = x;
      tail = tail.next;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    Node temp = head;
    int count = 0;
    while(temp!=null){
      count++;
      temp = temp.next;
    }
    
    return count;
  }
  
  /* prints the elements in the list */
  public void printList(){
    Node temp = head;
    while(temp.next!=null){
      System.out.print(temp.element+", ");
      temp = temp.next;
    }
    System.out.println(temp.element+".");
    
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    Node temp = head;
    int count = 0;
    while(temp!=null){
      
      if(count==idx){
        break;
      }
      temp = temp.next;
      count++;
    }
    return temp;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Node temp = head;
    for(int i = 0 ; i<idx ; i++){
      temp = temp.next;
    }
    
    
    return temp.element; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    int count = countNode();
    Node temp = head;
    if (idx>count-1){
      return null;
    }
    else{
      for(int i = 0 ; i<idx ; i++){
        temp = temp.next;
      }
      Object  old = temp.element;
      temp.element = elem;
      
      return old;
    }
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    Node temp = head;
    int count = countNode();
    int index = -1;
    for(int i = 0 ; i<count ; i++){
      if(temp.element == elem){
        index = i;
        break;
      }
      temp = temp.next;
    }
    
    return index;
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    Node temp = head;
    int count = countNode();
    boolean check = false;
    for(int i = 0 ; i<count ; i++){
      if(temp.element == elem){
        check = true;
        break;
      }
      temp = temp.next;
    }
    
    return check;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node newNode = new Node(head.element, null);
    Node tail = newNode;
    
    for(Node n = head.next ; n!=null ; n=n.next){
      Node x = new Node(n.element , null);
      tail.next = x;
      tail = tail.next;
    }
    
    return newNode; 
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node reverseNode = new Node (head.element , null);
    
    for(Node n = head.next ; n!=null ; n = n.next){
      Node  x = new Node (n.element , reverseNode);
      reverseNode = x;
    }
    
    return reverseNode; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    int count = countNode();
    if(idx<0 || idx>count){
      
    }
    else if(idx == 0){
      Node n = new Node (elem, null);
      n.next = head;
      head = n;
    }
    else{
      int i = 0;
      Node x = null;
      Node y = null;
      for(Node n = head ; n!=null ; n = n.next){
        if (i==idx-1){
          x = n;
          y = n.next;
        }
        i++;
      }
      Node n = new Node (elem , null);
      n.next = y;
      x.next = n;
    }
    
    
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    
    int count = countNode();
    
    if(index<0 || index>count-1){
      return 0;
    }
    
    
    else if (index == 0){
      Node temp = head;
      
      head = temp.next;
      return temp.element;
    }
    else{
      int i = 0;
      for(Node n = head ; n!=null ; n=n.next){
        if(i == index-1){
          Node a = n;
          Node b = n.next;
          Node c = n.next.next;
          a.next = c;
          return b.element;
        }
        i++;
      }
    }
    return 0;
  }
  
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    Node temp = head;
    head = head.next;
    int count = countNode();
    
    Node a = head;
    for(int i = 0 ; i<=count ; i++){
      if(a.next == null){
        a.next = temp;
        temp.next = null;
      }
      a = a.next;
    }
    
  }
  

  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    Node x = head;
    Node y = null;
    int count = countNode();
    for(int i = 1 ; i<count ; i++){
      y = x;
      x = x.next;
    }
    y.next = null;
    x.next = head;
    head = x;
  }
}


