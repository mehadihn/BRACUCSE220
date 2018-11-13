public class TreeTask7{
  public static void main(String[]args){
    Object[] arr = {null,10,5,15,2,8,null,20,null,4,6,null,null,null,18};
    Node root = treeBuilder(arr,1);
    Node copy = copyTree(root);
    System.out.println("Copied Tree");
    inOrderPrint(copy);
  }
  
  public static Node treeBuilder(Object[]a, int i){ 
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
  
  public static Node copyTree(Node n) {
    if (n == null)
      return null;
    else {
      Node copy = new Node(n.item, copyTree(n.left), copyTree(n.right));
      return copy;
    }
  }
  
  public static void inOrderPrint(Node r){ 
    if(r!=null){ 
      inOrderPrint(r.left);
      System.out.println(r.item);  
      inOrderPrint(r.right); 
    } 
  }
  
  
  
}