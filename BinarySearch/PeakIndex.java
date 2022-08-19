package BinarySearch;

public class PeakIndex {
          public static int peakIndexInMountainArray(int[] arr) {
                    int mx = -99999;
                    int ans = -1;
                    for(int i = 1 ; i<arr.length ; i++){
                        if(arr[i] > mx){
                            ans = i;
                            mx=arr[i];
                        }
                    }
                    
                    return ans;
                }
          public static void main(String[] args) {
                int[] arr = {0,10,5,2}; 
                int ans = peakIndexInMountainArray(arr);  
                System.out.println(ans); 
          }
}
