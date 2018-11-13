public class Task01{
  public static void main(String[]args){
    
    int[] a = new int[] {1,6,5,5};
    
    System.out.println(firstLast6(a));
    
  }
  
  public static boolean firstLast6(int[] a){
    
    if(a[0]==6){
      return true;
    }
    
    else if(a[a.length-1]==6){
      return true;
    }
    
    else{
      return false;
    }
  }
}