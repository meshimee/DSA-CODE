package Arrays;
import java.util.*;

class sumfraction {

          public static void main(String args[]) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Press 1 to Add\nPress 2 to Multiply\n");
                    System.out.print("Enter the choice: ");
                    int t = sc.nextInt();
                    System.out.print("Enter the numerator 1: ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter the denominator 1: ");
                    int d1 = sc.nextInt();
                    System.out.print("Enter the numerator 2: ");
                    int n2 = sc.nextInt();
                    System.out.print("Enter the denominator 2: ");
                    int d2 = sc.nextInt();
                    fo ob = new fo(n1, d1, n2, d2);
                    switch (t) {
                              case 1: {
                                        ob.add();
                                        break;
                              }
                             
                              case 2: {
                                        ob.mult();
                                        break;
                              }
                              
                              default:
                                        System.out.println("Wrong Input");
                                        break;
                    }
                    sc.close();
          }
}

class fo {
          static int a1, a2, b1, b2;

          fo(int n11, int d11, int n22, int d22) {
                    a1 = n11;
                    b1 = d11;
                    a2 = n22;
                    b2 = d22;
          }

          public void add() {
                    int p = gcd(((a1 * b2) + (a2 * b1)), (b1 * b2));
                    int p1 = (((a1 * b2) + (a2 * b1)) / p);
                    int p2 = ((b1 * b2) / p);
                    System.out.println("The addition is: " + p1 + "/" + p2);
          }

          public static int gcd(int a, int b) {
                    if ((a >= b) && ((a % b) == 0))
                              return (b);
                    else
                              return (gcd(b, (a % b)));
          }

          public void mult() {
                    int p = gcd((a1 * a2), (b1 * b2));
                    int p1 = ((a1 * a2) / p);
                    int p2 = (b1 * b2) / p;
                    System.out.println("The addition is: " + p1 + "/" + p2);
          }

          
}