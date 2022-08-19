package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
  public static void main(String[] args) {
    int[] arr1 = { 1, 4, 7, 8, 10 };
    int[] arr2 = { 2, 3, 9 };
    // MergeSorted_UsingExtraSpace(arr1 , arr2);
    MergeSorted_WithoutExtraSpace(arr1, arr2);
  }
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m-1;
    int j = n-1;
    int k = (m+n-1);
     
     while(i>=0 && j>=0){
         if(nums1[i] > nums2[j])
           nums1[k--] = nums1[i--]; 
         else
             nums1[k--] = nums2[j--];
     }
     while(i >= 0 ){
         nums1[k--] = nums1[i--];
         
     }
     while( j >= 0){
         nums1[k--] = nums2[j--];
     }
     for (int p = 0; p < n; p++) {
      System.out.print(nums1[p] + "  ");
    }
    for (int p = 0; p < m; p++) {
      System.out.print(nums2[p] + "  ");
    }
 }
  private static void MergeSorted_WithoutExtraSpace(int[] arr1, int[] arr2) {
    int n = arr1.length;
    int m = arr2.length;
    int i, k;
    for (i = 0; i < n; i++) {
     
      if (arr1[i] > arr2[0]) {
        int temp = arr1[i];
        arr1[i] = arr2[0];
        arr2[0] = temp;
      }

      int first = arr2[0];
    
      for (k = 1; k < m && arr2[k] < first; k++) {
        arr2[k - 1] = arr2[k];
      }
      arr2[k - 1] = first;
    }
  }

  private static void MergeSorted_UsingExtraSpace(int[] arr1, int[] arr2) {
    int n = arr1.length;
    int m = arr2.length;
    int[] ans = new int[n + m];
    int k = 0;
    for (int i = 0; i < n; i++) {
      ans[k++] = arr1[i];
    }
    for (int i = 0; i < m; i++) {
      ans[k++] = arr2[i];
    }

    Arrays.sort(ans);
    k = 0;
    for (int i = 0; i < n; i++) {
      arr1[i] = ans[k++];
    }
    for (int i = 0; i < m; i++) {
      arr2[i] = ans[k++];
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr1[i] + "  ");
    }
    for (int i = 0; i < m; i++) {
      System.out.print(arr2[i] + "  ");
    }
  }
}
