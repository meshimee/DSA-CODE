package Arrays;
import java.lang.ProcessBuilder.Redirect.Type;

public class Mains
{
   public static int[] squareSorted(int[] arr){
      
      int[] ans = new int[arr.length];
      int low = 0;
      int high = arr.length-1;
      int k = high;
      for(int i = 0; i<arr.length ; i++){
         arr[i] = arr[i] * arr[i];
      }
      
     
      while(low < high){
         if(arr[low] < arr[high]){
            ans[k] = arr[high];
            k--;
            high--;
         }
         else{
         ans[k] = arr[low];
         k--;
         low++;
         }
      }


      return ans;

      
   }
       public static void main(String args[])
       {
         int[] nums = {-4,-1,0,3,10};
         int[] ans = squareSorted(nums);


         for(int i = 0; i<ans.length ; i++){
         System.out.println(ans[i]+" ");
          }
       }
}