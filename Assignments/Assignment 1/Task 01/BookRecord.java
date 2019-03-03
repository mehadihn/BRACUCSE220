import java.util.Scanner;
public class BookRecord{
  
  Scanner sc = new Scanner (System.in);
  
  Book b1 = new Book("Fundamental of Physics" , "Halliday & Resnick" , "Wiley");
  Book b2 = new Book("Algorithms in Java" , "Robert" , "Pearson");
  
  Book BookArray[] = {b1, b2};
  int size = 2;
  
  public void AddRecord(String n , String a , String p){
    Book newBook = new Book(n , a , p);
    if(size<BookArray.length){
      BookArray[size] = newBook;
      size++;
    }
    else{
      resize(size+1);
      BookArray[size] = newBook;
      size++;
    }
    System.out.println("Added\n");
  }
  
  public void resize(int s){
    Book newArray[] = new Book [s];
    for(int i = 0 ; i<BookArray.length ; i++){
      newArray[i] = BookArray[i];
    }
    BookArray = newArray;
  }
  
  public void PrintRecord(){
    for(int i = 0 ; i<BookArray.length ; i++){
      System.out.println(BookArray[i]);
      System.out.println();
    }
  }
  
  public void DeleteRecord(int id){
    int index = 0;
    for(int i = 0 ; i<BookArray.length ; i++){
      if(BookArray[i].id == id){
        index = i;
        break;
      }
    }
    
    int ns = size - index;
    if(index==0){
      System.out.println("Invalid Index");
    }
    else{
      for(int i = 0 ; i<ns ; i++){
        BookArray[index] = BookArray[(index+1)%BookArray.length];
        index++;
      }
      //BookArray[index%BookArray.length] = null;
      
      size--;
      Book newBook[] = new Book[size];
      
      for(int i = 0 ; i<newBook.length ; i++){
        newBook[i] = BookArray[i];
      }
      
      BookArray= newBook;
      
      
      System.out.println("Deleted\n");
    }
  }
  
  public void EditRecord(int id){
    int index = 0;
    for(int i = 0 ; i<BookArray.length ; i++){
      if(BookArray[i].id == id){
        index = i;
        break;
      }
    }
    System.out.println("What Do You want to Change: \n1.Name 2.Author 3.Publisher 4.Exit");
    int v = 0;
    
    
    while (v!=4){
      v = sc.nextInt();
      switch(v){
        
        case 1 : 
          System.out.println("Change Name:");
          BookArray[index].name = sc.next();
          System.out.println("Change Again: \n1.Name 2.Author 3.Publisher 4.Exit");
          break;
          
        case 2 : 
          System.out.println("Change Author:");
          BookArray[index].author = sc.next();
          System.out.println("Change Again: \n1.Name 2.Author 3.Publisher 4.Exit");
          break;
          
        case 3:
          System.out.println("Change Publisher:");
          BookArray[index].publisher = sc.next();
          System.out.println("Change Again: \n1.Name 2.Author 3.Publisher 4.Exit");
          break;
          
        case 4:
          break;
          
        default :
          System.out.println("Enter Again");
           System.out.println("1.Name 2.Author 3.Publisher 4.Exit");
          
      }
      
      
    }
  }
  
}






