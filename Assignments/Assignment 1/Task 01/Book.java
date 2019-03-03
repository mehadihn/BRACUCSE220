public class Book {
  public String name;
  public int id = 0;
  public static int idC = 1;
  public String author;
  public String publisher;
  
  public Book(String n , String a, String p){
    name = n;
    author = a;
    publisher = p;
    id= getId();
  }
  
  public int getId(){
    id = idC+id;
    idC++;
    return id;
  }
  
  public String toString(){
    return ("ID: "+id+"\nName: "+name
              +"\nAuthor: "+author
              +"\nPublisher: "+publisher);
  }
}