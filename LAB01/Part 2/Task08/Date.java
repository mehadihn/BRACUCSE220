public class Date{
  
  public int month;
  public int day;
  public int year;
  
  public Date(){
  }
  
  public void setMonth(int m){
    month = m;
  }
  
  public int getMonth(){
    return month;
  }
  
  public void setDay(int d){
    day = d;
  }
  
  public int getDay(){
    return day;
  }
  
  public void setYear(int y){
    year = y;
  }
  
  public int getYear(){
    return year;
  }
  
  public String displayDate(){
    return month+"/"+day+"/"+year;
  }
  
}
  
  
    