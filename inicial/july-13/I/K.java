import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t > 0) {
      String s = in.next();
      StringBuilder sb = new StringBuilder();
      sb.append(s.substring(s.length() - 2, s.length()));
      for(int i = s.length() - 4; i >= 0; i -= 2) {
        sb.insert(0, s.charAt(i));
      }
      System.out.println(sb.toString());
      t--;
    }
  }
}
