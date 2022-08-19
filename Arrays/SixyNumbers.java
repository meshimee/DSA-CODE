package Arrays;

public class SixyNumbers {
          public static void main(String[] args) {
                    int n1 = 30;
                    int n2 = 2;

                    for(int i = n2 ; i<n1 ; i++){
                              int ans = prime(n2);
                              if(ans != 0)
                              System.out.print(ans+" ");
                    }
                    System.out.println();
          }

          private static int prime(int n) {
                    boolean flag = false;
                    int i;
                    for( i = 2  ; i < n ; i++){
                              if(n%i == 0)
                              flag = true;
                              break;

                    }
                    if(flag == false)
                    return i;
                    return i;
          }
}
