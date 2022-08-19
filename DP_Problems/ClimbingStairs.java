package DP_Problems;

public class ClimbingStairs {
          public static void main(String[] args) {
                    int n = 4;
                    int ans = climbStairs(n);
                    System.out.println(ans);
          }

          private static int climbStairs(int n) {
                    int[] dp = new int[n+1];
                    int ans = fun(n,dp);
                    return ans;
          }

          private static int fun(int n, int[] dp) {
                    if(n <= 1) return 1;

                    if(dp[n] > 0) return dp[n];

                    int op1 = fun(n-1,dp);
                    int op2 = fun(n-2,dp);
                    dp[n] =  op1+op2;
                    return dp[n];
          }
}
