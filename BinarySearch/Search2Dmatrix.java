package BinarySearch;

public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        //boolean ans = searchMatrix_UsingLoops(matrix,target);
        boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);

     }
     
        private static boolean searchMatrix_UsingLoops(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;
            for(int i =0 ; i<n ; i++){
                  for(int j = 0; j<m ; j++){
                        if(matrix[i][j] == target)
                        return true;
                  }
            }
            return false;
        }
        //Optimised Approch
        private static boolean searchMatrix(int[][] matrix, int target) {
            int r = searchInCol(matrix,target);
            if(r == -1) return false;

            boolean isFound = binarySearch(matrix,r,target);
            return isFound;
      } 
      private static int searchInCol(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;
        int lowcol = matrix[0].length-1;
        while(low <= high){
              int mid = (low + high)/2;
              
              if(matrix[mid][0] <= target && target <= matrix[mid][lowcol])
                  return mid;
              
              else if(matrix[mid][0] < target){
                  low = mid + 1;
              }
              else
                  high = mid - 1 ;
          }
          return -1;
      }
      private static boolean binarySearch(int[][] matrix, int r, int target) {
        int low = 0;
        int high = matrix[0].length - 1;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[r][mid] == target)
                return true;
            
            else if(matrix[r][mid] < target)
                low = mid + 1;
            
            else
                high = mid - 1;
        }
        return false;
      }   
}
