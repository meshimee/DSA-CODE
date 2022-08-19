package BinarySearch;

class PowerXY{
          public static void main(String[] args) {
                    double n = 5.000;
                    int p = 3;
                    double ans = pow(n,p);
                    System.out.println(ans);
          }

          public static double pow(double x, int n) {
                    if (n == 0) return 1;
                    
                    double sub = pow(x, n/2);
                    
                    if (n % 2 == 1 ){
                        return sub*sub*x;
                    }
                    else if (n % 2 == -1){
                        return sub*sub* 1/x;
                    }
                    else{
                        return sub*sub; 
                    }
                }
          }
