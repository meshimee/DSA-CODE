package Arrays;
public class FirstPalindromicString {

          public static String firstPal(String[] str){
                    for(String word : str){
                              if(ispalin(word))
                              return word;
                    }
                    return "";
          }
          private static boolean ispalin(String str){
                    int low = 0;
                    int high = str.length() - 1;
                    
                    while(low < high){
                        if(str.charAt(low) == str.charAt(high)){
                            low++;
                            high--;
                            continue;
                        }
                           else{
                               return false;
                           }
                    }
                    return true;
                }
          public static void main(String[] args) {
                    String[] words = {"abc","car","adak","rcecar","nitin","cool"};
                    String str = firstPal(words);
                    System.out.println(str);

          }
}
