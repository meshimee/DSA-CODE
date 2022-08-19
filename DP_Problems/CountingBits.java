package DP_Problems;

public class CountingBits {
          public static void main(String[] args) {
                    int n = 5;
                    int[] ans = new int[n+1];
                    ans = countBits(n);
                    for(int i = 0 ; i<ans.length ; i++){
                              System.out.print(ans[i]+" ");
                    }
          }

          private static int[] countBits(int n) {
                    int[] ans = new int[n+1];
                    for(int i = 0 ; i<ans.length ; i++){
                              if(i % 2 == 0){
                               ans[i] = ans[i/2];
                              }
                              else
                               ans[i] = ans[i/2]+1;

                    }
                    return ans;
          }

//           private static int[] countBits(int n) {
//                     int[] ans = new int[n+1];
//                     for(int i = 0 ; i<ans.length ; i++){
//                               ans[i] = count(i);
//                     }
//                     return ans;
//           }

//           private static int count(int n) {
//                     int c = 0;
//                     while(n != 0){
//                     int i = (n&1);
//                     if(i==1) c++;
//                     n = n>>1;
//         }
//         return c;
//           }
}
