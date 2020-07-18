import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t > 0) {
      int n = in.nextInt(); 
      int odd = 0;
      int even = 0;
      int sum = 0;
      while(n > 0) {
        int val = in.nextInt(); 
        sum += val;
        if(val % 2 == 0) {
          even++;
        } else {
          odd++;
        }
        n--;
      }
      if(sum % 2 != 0) {
        System.out.println("YES");
      } else if(odd != 0 && even != 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
      t--;
    }
  }
}
