package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    int fact = 1, n, n1;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\nEnter an Integer:");
    n = Integer.parseInt(br.readLine());
    for (n1 = n; n1 > 0; n1--) {
      fact = fact * n1;
    }
    System.out.println("\nFactorial of " + n + ":\t" + fact);

    int c = 0;
    for (int i = 2; i <= n / 2; ++i) {
      if (n % i == 0) {
        c = 1;
        break;
      }
    }

    if (c == 0)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
  }
}
