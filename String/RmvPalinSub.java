//1332. Remove Palindromic Subsequences
package String;
public class RmvPalinSub {
          public static void main(String[] args) {
                    String s = "ababa";
                    int ans = removePalindromeSub(s);
                    System.out.println(ans);
          }

          private static int removePalindromeSub(String s) {
                    int i = 0, j = s.length()-1;
                    boolean isPalindrome = true;

                    while(i <= j){
                              if(s.charAt(i) != s.charAt(j))
                              isPalindrome = false;
                              i++;
                              j--;
                    }
                    if(isPalindrome) return 1;

                    return 2;
          }
}
