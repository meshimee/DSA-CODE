package BinarySearch;

public class ArrangingCoin {
          public static void main(String[] args) {
                    int n = 8;
                    int ans = arrangeCoins(n);
                    System.out.println(ans);
          }
                    //O(n) soln
          // private static int arrangeCoins(int n) {
          //           int i = 1;
          //           int res = 0;

          //           while(n >= i){
          //             n -= i;
          //             res++;
          //             i++;
          //           }
          //           return res;
          // }
                    //O(logn) soln using binary search

          private static int arrangeCoins(int n) {
                    long li = 0, hi = n;
                    while(li <= hi){
                              long mid = li - (hi + li)/2;
                              if(n >= (mid * (mid+1))/2) li = mid + 1;

                              else
                              hi = mid - 1;

                    }
                    return (int)li - 1;
          }

                    //O(1) using 
          
}
