package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
          public static int majorityElement_UsingNestedLoop(int[] nums){
                    int count = 0;
                    int mx  = -9999999;
                    for(int i = 0 ; i<nums.length ; i++){
                              for(int j = 1 ; j<nums.length ; j++){
                                        if(nums[i] == nums[j])
                                        count++;
                                        mx = count;
                                        mx = Math.max(mx,count);
                              }

                    }
                    System.out.println(mx);
                    return mx;
                    
          }
          public static int majorityElement_UsingSorting(int[] nums) {
                    Arrays.sort(nums);
                   return nums[nums.length/2];
          }

          public static int majorityElement(int[] nums) {
                    int count = 0, ans = 0;
                     for (int num: nums) {
                         if (count == 0) {
                             ans = num;
                         }
                         if (num != ans) {
                             count--;
                         }
                         else {
                             count++;
                         }
                     }
                     return ans;
                 } 

          public static int majorityElement_UsingHashing(int[] nums) {
                    HashMap<Integer,Integer> hm =new HashMap<>();
                       for(int v:nums){
                           hm.put(v,hm.getOrDefault(v,0)+1);
                       }
                       
                       int ans=-1;
                       for(int key:hm.keySet()){
                           int val=hm.get(key);
                           if(val>(int)Math.floor(nums.length/2)){
                              ans=key;
                           break;
                           }
                       }
                       return ans;
                   }
               public static void main(String[] args) {
                         int[] nums = {3,2,3};     //{2,2,1,1,1,2,2};
                         int ans =   majorityElement_UsingNestedLoop(nums); //majorityElement_UsingHashing(nums);   //majorityElement_UsingSorting(nums);
                         System.out.println(ans);
               }
}
