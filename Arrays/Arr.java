package Arrays;
import java.util.*;

public class Arr{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in); 
   System.out.println("Numbers of element in array: ");
   int n = sc.nextInt();
   int[] arr = new int[n];
   System.out.println("Element in array: ");
   for(int i = 0; i<n ; i++){
          arr[i]=sc.nextInt(); 
   }
   System.out.println("Target: ");
   int element = sc.nextInt();

   int[] arr1 = new int[2];
   for(int i = 0; i<n ; i++){
             if(arr[i] == element){
                    arr1[0] = i;
                    break;
             }
   }
   System.out.println(arr1[0]);
   for(int i = n-1 ; i>= 0 ; i--){
             if(arr[i] == element){
                       arr1[1] = i;
                       break;
             }
   }
   System.out.println(arr1[1]);
//    for(int i = 0; i<arr1.length;i++){
//           System.out.println(arr1[i]);
//    }
   sc.close();

 }

}