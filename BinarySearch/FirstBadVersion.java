package BinarySearch;

import java.util.Random;

public class FirstBadVersion {
          public int firstBadVersion(int n) {
                    int l =1;
                    int h = n;
                    int r = -1;
                    while(l<=h){
                        int mid = l+(h-l)/2;
                        if(isBadVersion(mid)==true){
                        r = mid;
                        h = mid - 1;
                        }
                        else{
                            l = mid + 1;
                        }
                    }
                    return r;
                    } 
          private boolean isBadVersion(int mid) {
                    Random rd = new Random(); // creating Random object
                    return rd.nextBoolean();
          }
          public static void main(String[] args) {
                    int n = 5;
                    int bad =4;
                    

                    
          }
}
