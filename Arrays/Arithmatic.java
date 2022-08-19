package Arrays;

public class Arithmatic {
          public static void main(String[] args) {
                    int[] arr = {1,2,3,4,8,5,6,7};
                    int ans = arithmaticSeries(arr);
                    System.out.println(ans);
          }

          private static int arithmaticSeries(int[] arr) {
                    int count = 0;
                    int totalCount = 0;
                    for(int i = 2 ; i<arr.length ; i++){
                              if(arr[i] - arr[i-1] == arr[i-1] - arr[i-2]){
                                        count++;
                                        totalCount = totalCount + count;
                              }
                              else 
                                        count = 0;
                    }
                    return totalCount;
          }
}
