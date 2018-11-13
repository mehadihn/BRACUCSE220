public class Node{
  Object item;
  Node left;
  Node right;
  Node parent;
  public Node(Object i, Node l, Node r, Node p){
    item = i;
    left = l;
    right = r;
    parent = p;
  }
   public Node treeBuilder(Object[]a, int i){ 
    if(i<0 || i>=a.length || a[i]==null) return null; 
    else{ 
      Node root = new Node (a[i],null,null,null); 
      Node myLeft = treeBuilder(a,2*i); 
      Node myRight = treeBuilder(a,2*i+1); 
      root.left=myLeft; 
      root.right=myRight; 
      if(myLeft!=null) myLeft.parent=root; 
      if(myRight!=null) myRight.parent=root; 
      return root; 
    }
  
  
   }
  
}