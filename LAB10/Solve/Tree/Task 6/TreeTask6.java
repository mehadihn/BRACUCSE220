public class TreeTask6{
  public static void main(String[]args){
    Object[] arr = {null,10,5,15,2,8,null,20,null,4,6,null,null,null,18};
    Object[] arr1 = {null,10,5,15,2,8,null,20,null,4,6,null,null,null,18};
    Node root1 = treeBuilder(arr,1);
    Node root2 = treeBuilder(arr1,1);
    System.out.println(same(root1 , root2));
    
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
  
  public static boolean same(Node n1, Node n2) {
    if (n1 == null || n2 == null) {
      if (n1 == null && n2 == null){
        return true;
      }
      else{
        return false;
      }
    }
    else {
      return n1.item.equals(n2.item)
        && same(n1.left, n2.left)
        && same(n1.right, n2.right);
    }
  }
}