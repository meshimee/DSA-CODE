package BinarySearch;

public class IsSubsequence {
          public static boolean isSubsequence(String s, String t) {
                    if(s.length() == 0) return true;
                    
                    if(t.length() == 0) return false;
                    
                    int s_idx = 0;
                    for(int i = 0 ; i<t.length() ; ++i){
                        if(t.charAt(i) == s.charAt(s_idx)) 
                            s_idx++;
                        
                        if(s_idx == s.length()) return true;
                    }
                    return false;
                }
          public static void main(String[] args) {
                   String s = "axc";
                   String t = "ahbgdc";
                   boolean ans = isSubsequence(s, t);
                   System.out.println(ans);
          }
}
