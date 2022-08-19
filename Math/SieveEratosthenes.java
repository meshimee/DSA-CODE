package Math;

import java.util.Arrays;

public class SieveEratosthenes  {
          public static void main(String[] args) {
                    int n = 10;
                    boolean count[] = SieveEratosthenesFun(n);
                    int c = 0;
                    for(int i = 2; i<=n ; i++){
                        if(count[i] == false) c++;
                    }

                    
                    System.out.println(c);
                   
          }

        private static boolean[] SieveEratosthenesFun(int n) {
            boolean[] isPrime = new boolean[n+1];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;

            for(int i = 2; i*i <= n ; i++){
                for(int j = 2*i ; j <= n ; j += i){
                        isPrime[j] = false;
                }
            }
            
            
            return isPrime;
        }

        //   private static int isPrime(int n) {
                   
        //             if(n <= 2) return 0; //checking 0 & 1
        //             boolean[] composites = new boolean[n];
        //             int limit = (int)Math.sqrt(n);
        //             //array of composite --> True represents composite and False represents prime
        //             for(int i = 2 ; i <= limit ; i++){
        //                if(composites[i] == false){
        //                    for(int j = i*i ; j < n ; j+=i){
        //                        composites[j] = true;
        //                    }
        //                } 
        //             }
        //             int count = 0;
        //             for(int i = 2 ; i<n ; i++){
        //                 if(composites[i] == false) count++;
        //             }
        //             return count;
        //         }
          }

         

