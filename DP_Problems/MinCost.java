package DP_Problems;

public class MinCost {
          public static void main(String[] args) {
                     //{1,3,5,9,2,7};
                     int[] cost = {1,100,1,1,1,100,1,1,100,1};
                    int ans = minCostClimbingStairs(cost);
                    System.out.println(ans);
          }

          // private static int minCostClimbingStairs(int[] cost) {
          //           int[] dp = new int[1001];
          //           dp[0] = cost[0];
          //           dp[1] = cost[1];
          //           int n = cost.length;
          //           for(int i = 2 ; i< n ; i++){
          //                     dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
          //                     return Math.min(dp[n-1],dp[n-2]);
          //           }
          //           return n;
                    
          // }

          public static int minCostClimbingStairs(int[] cost) {
                    if(cost.length==2){
                        return Math.min(cost[0],cost[1]);
                    }
                    int[] dp = new int[1001];
                    int x = minCostClimbingStairs(cost,0,dp);
                    int y = minCostClimbingStairs(cost,1,dp);
                    return Math.min(x,y);
                }

          public static int minCostClimbingStairs(int[] cost,int idx, int[]dp){
                    if(idx==cost.length-1 || idx==cost.length-2){
                        return cost[idx];
                    }
                    if(dp[idx]!=0){
                        return dp[idx];
                    }
                    int x = minCostClimbingStairs(cost,idx+1, dp);    
                    int y = minCostClimbingStairs(cost,idx+2, dp); 
                    dp[idx] = Math.min(x,y)+cost[idx];
                    return dp[idx];
                    
                }
                
         
}
