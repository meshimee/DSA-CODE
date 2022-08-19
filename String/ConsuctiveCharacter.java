package String;

public class ConsuctiveCharacter {
          public static int maxPower(String s) {
                    int count = 1, max_count = 1;
                    char prev = s.charAt(0);
                    for(int i = 1; i < s.length(); ++i){
                        if(s.charAt(i) == prev){
                            count++;
                            max_count = Math.max(max_count, count);
                        } else {
                            count = 1;
                            prev = s.charAt(i);
                        }
                    }
                    return max_count;
                }
            
          public static void main(String[] args) {
                    String s = "abbcccddddeeeeedcba";
                    int ans = maxPower(s);
                    System.out.println(ans);

          }
}
