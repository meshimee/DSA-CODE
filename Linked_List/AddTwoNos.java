// package Linked_List;

// import java.util.LinkedList;

// public class AddTwoNos {
//           static Node head;
          
//           static class Node {
//                     int data;
//                     Node next;
              
//                     Node(int d)
//                     {
//                         data = d;
//                         next = null;
//                     }
//                 }
//           public static void main(String[] args) {
//                     LinkedList<Integer> li1 = new LinkedList<>();
//                     li1.add(2);
//                     li1.add(4);
//                     li1.add(3);

//                     LinkedList<Integer> li2 = new LinkedList<>();
//                     li2.add(5);
//                     li2.add(6);
//                     li2.add(4);
//                     LinkedList<Integer> ans = addTwoNumber(li1,li2);
                    
                    // while (ans != null) {
                    //     System.out.print(ans.data + " ");
                    //     ans = ans.next;
                    // }
                    // }
        
                 
//           private static LinkedList<Integer> addTwoNumber(LinkedList<Integer> li1, LinkedList<Integer> li2) {
//                     LinkedList<Integer> li = new LinkedList<>();
//                     Node dummy = new Node();
//                     Node temp = dummy;
//                     int carry = 0;
//                     while(li1 != null || li2 != null || carry == 1){
//                         int sum = 0;
//                         if(li1 != null){
//                             sum += li1.val;
//                             li1 = li1.next;
//                         }
//                         if(li2 != null){
//                             sum += li2.val;
//                             li2 = li2.next;
//                         }
//                         sum += carry;
//                         carry = sum / 10;
//                         Node n1 = new Node(sum % 10);
//                         temp.next = n1;
//                         temp = temp.next;
//                     }
//                     li.head = dummy;

//                     return li;
//           }
// }
