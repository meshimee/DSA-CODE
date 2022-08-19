package Arrays;

public class BuyAndSellStock {
          public static int maxProfit_BruteForce(int[] prices) {
                    int mx = 0;
                    for(int i = 0 ; i<prices.length ; i++){
                              for(int j = i+1 ; j<prices.length ; j++){
                                        int ans = prices[j]-prices[i];
                                       
                                        mx = Math.max(ans,mx);

                              }
                    }
                    
                    return mx;
          }

         public static int maxProfit_ExtraSpace(int[] arr){
                    int[] ans = new int[arr.length];
                    int mx = 0;
                    for(int i = arr.length-1; i>= 0 ; i--){
                              if( i == arr.length-1)
                              ans[i] = arr[i];

                              else if(arr[i] > ans[i+1])
                              ans[i] = arr[i];

                              else
                              ans[i] = ans[i+1];
                    }
                    for(int i = 0 ; i<arr.length ; i++){
                            int res = (ans[i] - arr[i]);
                            mx = Math.max(res,mx); 
                    }
                   
                   return mx;


         }
         public static int maxProfit(int[] prices) {
          int maxProfit = 0;
          int minSoFar = prices[0];
          
          for(int i =0; i<prices.length;i++){
              minSoFar = Math.min(minSoFar,prices[i]);
              int profit = prices[i]-minSoFar;
              maxProfit = Math.max(maxProfit,profit);
          }
          return maxProfit;
      }
          public static void main(String[] args) {
                    int[] prices = {3,1,4,8,7,2,5};
                    int ans = maxProfit(prices); //maxProfit_ExtraSpace(prices);
                    System.out.println(ans);

          }
}
