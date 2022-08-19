package Math;

public class FactorialTrailingZeros {
        
                public static int trailingZero(int n) {
                    int p = 5;
                    int ans = 0;
                    while((n/p) > 0){
                      ans += (n/p);
                      p = p*5;
                     }
                     return ans;
                 }
                 public static int trailingZeroes(int n){
                   int res = 0;
                   for(int i = 5 ; i<= n ; i=i*5){
                     res = res + n/i;
                   }
                   return res;
                 }
              
                public static void main(String[] args) {
                          int n = 12;
                          int ans = trailingZeroes(n);
                          System.out.println(ans);
                }
         
}
