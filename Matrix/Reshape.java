package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Reshape {
          public static void main(String[] args) {
                    int[][] mat = {{1,2},{3,4}};
                    int r = 1;
                    int c = 4;
                    // int[][] res = reshape(mat,r,c);
                    // for(int i = 0 ; i < res)
                    reshape(mat, r, c);
          }

          private static void reshape(int[][] mat, int r, int c) {
                    int n = mat.length;
                    int m = mat[0].length;

                    List<Integer> li = new ArrayList<>();
                    for(int i = 0; i < n ; i++){
                              for(int j = 0; j < m ; j++){
                                        li.add(mat[i][j]);
                              }
                    }
                    int[][] ans = new int[r][c];
                    int k = 0;
                    for(int i = 0; i < r ; i++){
                               for(int j = 0 ; j < c ; j++){
                                         ans[i][j] = li.get(k++);
                               }
                    }
                    

          }
}
