package Math;

public class PowerOfTwo {
          public static void main(String[] args) {
                    int n = 251;
                    boolean ans = powerOf(n);
                    System.out.println(ans);
          }

          private static boolean powerOf(int n) {
                    if(n <= 0) return false;

                    if(n%2 == 0) 
                    return powerOf(n/2);

                    if(n == 1) return true;

                    return false;
          }
}
