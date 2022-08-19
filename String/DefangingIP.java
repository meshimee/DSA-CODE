package String;
public class DefangingIP {
          public static String defangingIpAddr(String address){
                    StringBuilder sb = new StringBuilder();
                    for(char ch : address.toCharArray()){
                              if(ch == '.')
                              sb.append("[.]");
                              else
                              sb.append(ch);
                    }
                    return sb.toString();
                    
          }
          public static void main(String[] args) {
                    String address = "255.100.50.0";
                    String ans = defangingIpAddr(address);
                    System.out.printf(ans);   
          }
         

}
