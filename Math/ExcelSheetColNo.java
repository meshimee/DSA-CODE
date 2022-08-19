package Math;

public class ExcelSheetColNo {
          public static void main(String[] args) {
                    String str = "ABC";
                    int ans = titleToNumber(str);
                    System.out.println(ans);
          }

          private static int titleToNumber(String str) {
                    int result = 0;
                    for(char ch : str.toCharArray()){
                              int d = ch - 'A' + 1;
                              result = result * 26 + d;
                    }
                    return result;
          }
}
