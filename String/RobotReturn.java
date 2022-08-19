package String;

public class RobotReturn {
          public static boolean judgeCircle(String str){
                    int x = 0;
                    int y = 0;

                    for(int i = 0 ; i<str.length() ; i++){
                              char ch = str.charAt(i);
                              if(ch == 'L') x++;

                              else if(ch == 'R') x--;

                              else if(ch == 'U') y++;

                              else y--;
                    }
                    return (x == 0 && y == 0);

          }
          public static void main(String[] args) {
                    String moves = "LR";
                    boolean ans = judgeCircle(moves);
                    System.out.println(ans);
          }
          
}
