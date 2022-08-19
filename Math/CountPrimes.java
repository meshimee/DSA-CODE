package Math;

public class CountPrimes {
          public static void main(String[] args) {
                    int n = 29;
                    countPrime(n);
                    //int ans = countPrime(n);
                    //System.out.println(ans);
          }

          // private static int countPrime(int n) {
                    
          // }
          private static void countPrime(int n) {
                    boolean flag = false;
                    for(int i = 2 ; i < n ; i++){
                              if(n % i == 0){ 
                              flag = true;
                              System.out.println( n + " is not a Prime Number ");
                              break;
                              }
                    }
                    if(flag == false) 
                    System.out.println(n + " is a prime number ");
          }
}
