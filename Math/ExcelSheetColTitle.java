package Math;

public class ExcelSheetColTitle {
          public static void main(String[] args) {
                    int n = 4;
                    String ans = convertToString(n);
                    System.out.println(ans);
          }

          private static String convertToString(int n) {
                    String result = "";
                    while(n > 0){
                     char ch = (char) ('A' + (n-1) % 26);
                     result = ch + result;
                     n = (n-1)/26;
                    }

                    return result;
          }
}
