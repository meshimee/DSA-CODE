package String;

import java.util.HashMap;

public class IsomorphicString {
          public static void main(String[] args) {
                    String s = "egg";
                    String t = "add";

                    boolean ans = isIsomorphic(s,t);
                    System.out.println(ans);
          }

          private static boolean isIsomorphic(String s, String t) {
                    int n = s.length();
                    char seen[] = new char[128];
                    
                    for(int i = 0; i< n ; i++){
                              char c = s.charAt(i);
                              if(seen[i] != c){
                                        for(int l = 0; l<seen.length ; l++){
                                        // for(Character s : seen){ 
                                        if(seen[l] == t.charAt(i)) 
                                        return false;
                                        seen[l] = t.charAt(i);
                                        }
                              }
                              else if(seen[c] != t.charAt(i)) return false;
                    }
                    return true;
          }
}
