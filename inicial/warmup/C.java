import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while(n > 0) {
      String s = in.next();
      if(s.length() > 10) {
        System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1) );
      } else {
        System.out.println(s);
      }
      n--;
    }
 
  }
}
