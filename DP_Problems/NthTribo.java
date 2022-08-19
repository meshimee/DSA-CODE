package DP_Problems;

public class NthTribo {
          // public static int tribonacci(int n) {
          //           if(n == 0) return 0;

          //           if(n <= 2) return 1;

          //           else{
          //                     int a = 0;
          //                     int b = 1;
          //                     int c = 1;
          //                     int sum = 0;
          //                     int idx = 3;
          //                     while(idx <= n){
          //                       sum = a+b+c;
          //                       a = b;
          //                       b = c;
          //                       c = sum;
          //                       idx++;

          //                     }
          //                     return sum;
          //           }
        
          // }
          
          public static void main(String[] args) {
                    int n = 25;
                    int ans = tribonacci(n);
                    System.out.println(ans);

          }

          private static int tribonacci(int n) {
                    int[] dp = new int[40];
                    dp[0] = 0;
                    dp[1] = 1;
                    dp[2] = 1;
                    for(int i = 3; i<= n ; i++){
                              dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
                    }
                    for(int i = 0; i<dp.length ; i++){
                              System.out.print(dp[i]+" ");
                    }
                    return dp[n];
          }
}
