package Arrays;

public class indexValue {
          public static void main(String[] args) {
                    int[] arr = {8,1,5,7,6};
                    int ans = indexVal(arr);
                    System.out.println(ans);
          }

          private static int indexVal(int[] arr) {
                    int ans = -999999;
                    int valI = arr[0] + 0;
                    for(int j = 1 ; j < arr.length ; j++){
                              ans = Math.max(ans, valI + arr[j] - j);
                              valI = Math.max(valI, arr[j] + j);

                    }
                    return ans;
          }
}
