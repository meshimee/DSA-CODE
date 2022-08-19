package String;

public class GoatLatin {
          private static boolean isVowel(char charAt) {
                    return (charAt == 'a' || charAt == 'e' || charAt =='i' || charAt == 'o' || charAt == 'u' 
                    || charAt == 'A' || charAt == 'E' || charAt == 'I' || charAt == 'O' || charAt == 'U');
          }
          public static String toGoatLatin(String str){
                    String arr[] = str.split(" ");
                    int n = arr.length;
                    StringBuilder sb1 = new StringBuilder("ma");
                    StringBuilder sb2 = new StringBuilder();

                    for(int i = 0 ; i<n ; i++){
                              sb1.append('a');
                              if(isVowel(arr[i].charAt(0))){
                                        arr[i] += sb1.toString();
                              }
                              else{
                                        arr[i] = arr[i].substring(1) + arr[i].charAt(0) + sb1.toString();
                              }
                              sb2.append(arr[i]+" ");

                    }
                   sb2.deleteCharAt(sb2.length()-1);
                    return sb2.toString();
          }
          public static void main(String[] args) {
                 String sentence = "The quick brown fox jumped over the lazy dog";
                 String ans = toGoatLatin(sentence);
                 System.out.println(ans);
                 

          }
}
