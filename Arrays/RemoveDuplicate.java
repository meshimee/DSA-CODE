package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
          public static int  removeDuplicates_UsingSet(int[] nums) {
                    Set<Integer> st = new HashSet<>();
                    for(int i = 0 ; i<nums.length ; i++){
                           st.add(nums[i]);   
                    }
                    int k=st.size();
                    int j=0;
                    for(int x:st){
                      nums[j++]=x;
              }
                      return k;
          }
          public static int removeDuplicates(int[] nums){      //using two pointer O(n)
                 int i = 0;
                 for(int j = 0 ; j<nums.length ; j++){
                     if(nums[i] != nums[j]){
                            i++;
                     }
                     nums[i] = nums[j];
                 }
                 return i+1;
          }
         public static void main(String[] args) {
                   int[] arr = {1,1,2};
                   int n = removeDuplicates(arr);
                   System.out.println(n);

         } 
}
