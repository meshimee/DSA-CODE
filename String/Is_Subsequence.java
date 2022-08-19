package String;

public class Is_Subsequence {
          public static void main(String[] args) {
                    String s = "axc";
                    String t = "aqprbsdc";

                    boolean ans = checkIsSubsequnce(s,t);
                    System.out.println(ans);
          }

          private static boolean checkIsSubsequnce(String s, String t) {
                    if(s.length() == 0 && t.length() == 0) return false;

                    if(s.length() == 0) return true;

                    if(t.length() == 0) return false;

                    int idx = 0;
                    for(int i = 0 ; i<t.length() ; i++){
                              if(s.charAt(idx) == t.charAt(i))
                              idx++;

                              if(idx == s.length()) return true;
                    }
                    return false;
          }
}
