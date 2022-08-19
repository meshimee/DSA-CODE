package Arrays;

public class RemoveElement {
          public static void main(String[] args) {
                    int[] arr = {3,3,2,2};
                    int val = 2;
                    int ans = RemoveElement(arr,val);
                    System.out.println(ans);
          }

          private static int RemoveElement(int[] arr, int val) {
                    int start = 0;
                    for(int i = 0 ; i<arr.length ; i++){
                              if(arr[i] != val)
                              arr[start++] = arr[i];
                    }
                    return start;
          }
}
