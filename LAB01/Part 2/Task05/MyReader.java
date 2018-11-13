import java.util.Scanner;
public class MyReader {
  int readInteger( ) {
    Scanner k = new Scanner(System.in);
    
    int answer = 0;
    
    String s = k.nextLine();
    try{
      if (s.contains(".")){
        throw new EitaIntegerNoiException();
      }
      else{    
        answer = Integer.valueOf(s);
        System.out.println("Perechi, User gave "+answer);
      }
    }
    catch(EitaIntegerNoiException n){
      System.out.println("parlam na "+s);
    }
    
    
    return answer;
    
  }
}
