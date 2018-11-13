import java.util.Scanner;
public class Task10{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("enter month:");
    int month = sc.nextInt();
    
    System.out.println("enter day:");
    int day = sc.nextInt();
    
    System.out.println(season(month , day));
    
  }
  
  public static String season(int month , int day){
    
    if((month<=3 || month==12) && (day>=16 || day<=15)){
      return "Winter";
    }
    
    
    else if((month>=3 || month<=6) && (day>=16 || day<=15)){
      return "Spring";
    }
    
    else if((month>=6 || month<=9) && (day>=16 || day<=15)){
      return "Summer";
    }
    
    else return "Fall";
  }
}