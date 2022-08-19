package Arrays;

public class SearchInsertPos {
          public static void main(String[] args) {
                    int[] nums = {1,3,5,6};
                    int target = 7;
          
                    int ans =   searchInsert_UsingBS(nums, target);       //searchInsert_UsingLS(nums,target);
                    System.out.println(ans);   
          }

          private static int searchInsert_UsingLS(int[] nums, int target) {               //Linear time
                    for(int i = 0 ; i<nums.length ; i++){
                       if(nums[i] == target || nums[i] > target) return i;
                    }
                              return nums.length;
          }
          private static int searchInsert_UsingBS(int[] nums , int target){                        //TC: log(n)
                    int low = 0;
                    int high = nums.length-1;
                    while(low <= high){
                       int mid = low + (high-low)/2;
                        if(target < nums[mid]){
                            high = mid -1;
                        }else if(target > nums[mid]){
                            low = mid +1;
                        }else{ // target == nums[mid]
                            return mid;
                        }
                    }
                    return low;
                }
          }

