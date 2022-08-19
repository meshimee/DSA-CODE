package Arrays;
public class MoveZero {
          static void Sort(int arr[]) {
                    int n = arr.length;
                    
                    for (int i = 0; i < n - 1; i++){
                    
                      for (int j = 0; j < n - i - 1; j++){

                        if (arr[j]== 0) {
                          int temp = arr[j];
                          arr[j] = arr[j + 1];
                          arr[j + 1] = temp;
                        }
                      }
                    }

                        for(int i =0; i<arr.length ; i++){
                                  System.out.print(arr[i]+" ");
                        }

}

public static void main(String args[]) {
      
          int[] data = {22,3,4,0,9,0,12,0,4,33};
          
         Sort(data);
          
        }
}