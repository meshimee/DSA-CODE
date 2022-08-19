package Math;

public class Reverse {
          public static int reverse(int x) {
                    int ans = 0;
                     while(x != 0){
                         int n = x%10;
                         if((ans > Integer.MAX_VALUE/10) || (ans < Integer.MIN_VALUE/10))
                             return 0;
                         
                         ans = ans * 10 + n;
                         
                          x /= 10;
                     }
                     return ans;
           }
             
          public static void main(String[] args) {
                   int x = -123;
                   int n = reverse(x);
                   System.out.println(n);
                    
          }
}
