import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println((n % 2 == 0 && n > 2) ? "YES":"NO" );
  }
}
