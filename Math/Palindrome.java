package Math;

public class Palindrome {
          public static boolean isPalindrome(int x) {
                    if(x < 0) return false;
                    int tmp = x;
                    int y = 0;
                    while(x != 0){
                        int r = x%10;
                        y = y*10 + r;
                        x = x/10;
                        }
                    if(tmp == y) return true;
                    
                    return false;
                }
                public static void main(String[] args) {
                          int x = -121;
                          boolean ans = isPalindrome(x);
                          System.out.println(ans);
                }
          
}
