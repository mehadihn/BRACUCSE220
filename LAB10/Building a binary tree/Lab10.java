public class Lab10{
  
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
  
  public static void inOrderPrint(Node r){
    if(r!=null){
      inOrderPrint(r.left);
      System.out.println(r.item);
      inOrderPrint(r.right);
    }
  }
  
  public static void main (String[]args){
    Object[] arr = {null,10,5,15,2,8,null,20,null,4,6,null,null,null,18};
    Node n1=new Node(10,null,null,null);
    Node n2=new Node(5,null,null,null);
    n1.left=n2; n2.parent=n1;
    Node n3=new Node(15,null,null,null);
    n1.right=n3; n3.parent=n1;
    Node n4=new Node(2,null,null,null);
    n2.left=n4; n4.parent=n2;
    Node n5=new Node(8,null,null,null);
    n2.right=n5; n5.parent=n2;
    Node n7=new Node(20,null,null,null);
    n3.right=n7; n7.parent=n3;
    Node n9=new Node(4,null,null,null);
    n4.right=n9; n9.parent=n4;
    Node n10=new Node(6,null,null,null);
    n5.left=n10; n10.parent=n5;
    Node n14=new Node(18,null,null,null);
    n7.left=n14; n14.parent=n7;
    Node root = treeBuilder(arr,1);
    inOrderPrint(root);
  }
  
}