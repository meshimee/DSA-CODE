package String;

class ToLowerCase{
          public static String toLowerCase(String str){
                    String result = "";
                    for(char ch : str.toCharArray()){
                              if(Character.isUpperCase(ch))
                              result = result + (char) + (ch + 32);
                              else
                              result = result + ch;
                    }
                    return result;
          }
          public static void main(String[] args) {
                    String s = "LOVELY";
                    String str = toLowerCase(s);
                    System.out.println(str);

          }
}