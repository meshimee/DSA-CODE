package String;

public class SplitString {
          public static int balancedStringSplit(String str){
                    int lcount = 0, rcount = 0 , tcount = 0;
                    for(int i = 0 ; i<str.length() ; i++){
                              char ch = str.charAt(i);
                              if(ch == 'R') rcount++;

                              else lcount++;

                              if(lcount == rcount) tcount++;

                    }
                    return tcount;
          }
          public static void main(String[] args) {
                    String s = "RLLLLRRRLR";
                    int ans = balancedStringSplit(s);
                    System.out.println(ans);

          }
}
