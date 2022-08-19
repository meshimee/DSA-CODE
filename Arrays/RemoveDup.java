package Arrays;
public class RemoveDup {
          static int fun(int arr[]){
                    if(arr.length < 3) return arr.length;
                    int in = 2;
                    for(int i = 2 ; i<arr.length ; i++){
                              if(arr[i] != arr[in-2]){
                                        arr[in++] = arr[i];
                              }
                    }

                    return in;
                    
          }
      public static void main(String args[]){
                int[] arr = {1,1,1,2,2,3};
                int ans = fun(arr);
                System.out.println(ans);
      }    
}
