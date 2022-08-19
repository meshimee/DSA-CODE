package String;

public class MaxNoBallon {
          public static int maxNumberOfBallon(String str){
                    int[] count = new int[26];
                    for(int i = 0 ; i<str.length() ; i++){
                             count[str.charAt(i) - 'a']++;
                    }
                    int min = count[1]; //b
                    min = Math.min(min,count[0]); //a
                    min = Math.min(min,count[11]/2); //l
                    min = Math.min(min,count[14]/2); //o
                    min = Math.min(min,count[13]); //n

                    return min;
                    
          }
          public static void main(String[] args) {
                    String text = "loonbalxballpoon";
                    int ans = maxNumberOfBallon(text);
                    System.out.println(ans);

          }
}
