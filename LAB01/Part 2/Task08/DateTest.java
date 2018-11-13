public class DateTest extends Date{
  public static void main (String[]args){
    
    Date date = new Date();
    
    date.setMonth(5);
    date.setDay(4);
    date.setYear(2018);
    
    System.out.println("Month: "+date.getMonth());
    System.out.println("Day: "+date.getDay());
    System.out.println("Year: "+date.getYear());
    
    System.out.println("\nDate: "+date.displayDate());
    
    
  }
}