package BinarySearch;

public class FindSmallestNum {
          public static int guessNumber(int n) {
                    int i = 1;
                    int j = n;
                    while(i<=j){
                        int mid = i+(j-i)/2;
                        if(guess(mid) == 0)
                            return mid;
                        else if(guess(mid) == -1)
                            j = mid - 1;
                        else if(guess(mid) == 1)
                            i = mid + 1;
                    }
                    return -1;
                }
          private static int guess(int mid) {
                    
                    return 0;
          }
          public static void main(String[] args) {
                int n = 10;
                int pick = 6;
                int ans = guessNumber(n);
                System.out.println(ans);

          }
}
