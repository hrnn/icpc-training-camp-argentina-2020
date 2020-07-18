import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    long m = in.nextLong();
    long a = in.nextLong();
    long width = n / a;
    long height = m / a;
    
    if(n % a  != 0) width++;
    if(m % a != 0) height++;
 
    System.out.println(width * height);
  }
}
 
