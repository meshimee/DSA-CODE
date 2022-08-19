package DP_Problems;
public class Fibo {
          public static void main(String[] args) {
                  int n = 8;
                  int ans = fib(n);
                  System.out.println(ans);  
          }

          private static int fib(int n) {
                    if(n == 0) return 0;

                    if(n <= 2) return 1;

                    int a = 0;
                    int b = 1;
                    int c = 1;
                    int sum = 0;
                    int idx = 3;

                    while(idx <= n){
                            sum = a+b+c;
                            a = b;
                            b = c;
                            c = sum;
                            idx++;
                    }
                    return sum;
          }
}
