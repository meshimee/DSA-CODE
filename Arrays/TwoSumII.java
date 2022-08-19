package Arrays;

public class TwoSumII {
          public static int[] twoSum(int[] nums, int target) {
                    // int low = 0;
                    // int high = nums.length-1;

                    // while(low < high){
                    //           int currSum = 0;
                    //           currSum = nums[low]+nums[high];
                    //           if(currSum == target) return new int[]{low+1,high+1};

                    //           else if(currSum > target) high--;

                    //           else low++;
                    // }
                    // return new int[] {-1,-1};
                    int s = 0;
                    for(int i = 0; i < nums.length ; i++){
                              for(int j = i+1; j < nums.length ; j++){
                                        for(int k = i ; k < nums.length ; k++){
                                                  s += nums[k];
                                        }
                                        if(s == target){
                                                  System.out.println(i+" "+j);
                                        }
                              }
                    }
                    int[] arr ={0};
                    return arr;
          }
          public static void main(String[] args) {
                    int[] nums = {1,2,3,7,5};
                    int target = 12;
                    int[] ans = new int[2];
                    ans = twoSum(nums, target);

                    for(int ele : ans)
                    System.out.print(ele+" ");

          }
          
}
