package Arrays;

public class MaxSubarray {
          public static int maxSubArray_UsingNestedLoops(int[] nums) {
                    int n = nums.length;
                    int maxi = nums[0];
                    
                    for(int i=0;i<n;i++)
                    {
                        for(int j=i;j<n;j++)
                        {
                            int sum=0;
                            for(int k = i ; k<=j; k++)
                            {
                                sum +=nums[k];
                            }
                            maxi = Math.max(sum,maxi);
                        }
                        //sum = 0;
                    }
                    return maxi;
                }
            
          private static int maxSubArray_UsingTwoLoops(int[] nums) {
                    
                              int n = nums.length;
                              int maxi = nums[0];
                              
                              for(int i=0;i<n;i++)
                              {
                                  int sum =0;
                                  for(int j=i;j<n;j++)
                                  {
                                      sum +=nums[j];
                                      maxi = Math.max(sum,maxi);
                                  }
                                  //sum = 0;
                              }
                              return maxi;
                    }
          

          public static void main(String[] args) {
                    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
                    int mx = KadaneAlgo(nums);                     //maxSubArray_UsingTwoLoops(nums);  //maxSubArray_UsingNestedLoops(nums);
                    System.out.println(mx);

          }

          private static int KadaneAlgo(int[] nums) {
                    
                              int n = nums.length;
                              int sum=0;
                              int maxi = nums[0];
                              for(int i: nums){
                                  sum +=i;
                                  maxi = Math.max(sum,maxi);
                                  if(sum<0) sum=0;
                              }
                              return maxi;
                          }
          }

