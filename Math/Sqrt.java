package Math;

public class Sqrt {
          public static void main(String[] args) {
                    int n = 21473956;
                    int ans = sqrt(n);
                    System.out.println(ans);
          }

          private static int sqrt(int n) {
                    int i = 1;
                    while(i*i <= n){
                              i++;
                    }
                    return i-1;
          }

}
