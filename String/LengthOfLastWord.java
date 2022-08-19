package String;

public class LengthOfLastWord {
         public static int lengthOfLastWord(String s){
          // int c=0;
          // for(int i=s.length()-1;i>=0;i--){
          //     if(s.charAt(i)!=' ')
          //     c++;
          //     else
          //     {
          //         if(c==0)
          //             continue;
          //         else
          //             break;
          //     }
          // }
          // return c;
          int n = s.length()-1;
          int result = 0;
          while(n > 0){
                    if(s.charAt(n--) != ' ') result++;
                    else if(result>0) return result;
          }
          return result;
      }
         public static void main(String[] args) {
               String s = "Hello World"; 
               int ans = lengthOfLastWord(s);
               System.out.println(ans);   
         } 
}
