package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum{
      public static int[] twoSumUsingLoops(int[] nums, int target) {    //TC:O(n*n) SC:O(1)
                int[] ans = new int[2];
                for(int i = 0; i<nums.length ; i++){
                          for(int j = i+1 ; j<nums.length ; j++){
                              if(nums[i]+nums[j]==target&& j!=i){
                                        ans[0] = nums[i];
                                        ans[1] = nums[j];
                              }
                }
          }
          return ans;
}

          private static int[] twoSum(int[] nums, int target){      //TC:O(n*n)     //SC:O(n)
                    int[] ans = new int[2];
                    Map<Integer, Integer> mp = new HashMap<>();
                    for(int i = 0; i < nums.length; ++i){
                        if(mp.containsKey(target - nums[i])){
                            ans[0] = mp.get(target - nums[i]);
                            System.out.println(ans[0]);
                            ans[1] = i;
                        }
                        
                        mp.put(nums[i], i);
                    }
                    return ans;
                }
          
      public static void main(String[] args) {
                int[] arr = {2,7,11,15};
                int target = 9;
                int[] ans = new int[2];
                ans = twoSum(arr, target);  //twoSumUsingLoops(arr, target);
                for(int i:ans){
                    System.out.println(i+" ");
                }

      }    
}