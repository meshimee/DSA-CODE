package PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class CreatePQ {
          public static void main(String[] args) {
                    PriorityQueue<Integer> pq = new PriorityQueue<>();
                    pq.add(5);
                    pq.add(6);
                    pq.add(7);
                    pq.add(0);
                    pq.add(8);
                    while(!pq.isEmpty()){
                              System.out.println(pq.peek());
                              pq.poll();
                    }
                    System.out.println(pq.size());

                    PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
                    pq1.add(10);
                    pq1.add(12);
                    pq1.add(122);
                    pq1.add(1);
                    while(!pq1.isEmpty()){
                              System.out.println(pq1.peek());
                              pq1.poll();
                    }
          }
}
