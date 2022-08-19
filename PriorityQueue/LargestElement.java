package PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class LargestElement {
          public static void main(String[] args) {
                    int[] arr = {12,3,40,43,1,32,65};
                    largestElement(arr);
          }

          private static void largestElement(int[] arr) {
                    PriorityQueue<Integer> pq = new PriorityQueue<>();
                    for(int i : arr){
                              pq.add(i);
                    }
                    System.out.println(pq.peek());


                   
          }
}
