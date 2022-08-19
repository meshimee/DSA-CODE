package Arrays;

import java.io.*;
// import java.util.*;

public class BarChart{

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, arr[i]);
    }

    for (int i = 0; i < max; i++) {
      for (int val : arr) {
        if (i < val) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
      }

      System.out.println();
    }
  }

}

// import java.util.*;
// public class BarChart {
//       public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int[] arr = new int[n];
//                 for(int i = 0; i<n ; i++){
//                           arr[i] = sc.nextInt();
//                 }
//                 int max = Integer.MAX_VALUE;
//                 for(int i = 0 ; i<n ; i++){
//                           if(arr[i] > max)
//                           max= arr[i];
//                 }
//                 sc.close();
//                 for(int i = max; i>= 1 ; i--){
//                           for(int j = 0; j<arr.length ; j++){
//                                     if(arr[j] >= i)
//                                     System.out.print("*\t");

//                                     else
//                                     System.out.print(" ");
//                           }
//                           System.out.println();
//                 }


//       }    
// }
