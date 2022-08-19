package Linked_List;
public class PalindromeLL {
          static Node head;
          static class Node{
                    int data;
                    Node next;
                    Node(int d){
                              data = d;
                              next = null;
                    }
          }
          public static void main(String[] args) {
                    Node n1 = new Node(1);
                    Node n2 = new Node(2);
                    // Node n3 = new Node(2);
                    // Node n4 = new Node(1);
                    // Node head = n1;
                    n1.next = n2;
                    n2.next = null;
                    // n3.next = n4;
                    // n4.next = null;
                    //boolean ans = isPalindrome(head);
                    //System.out.println(ans);
          }
//           private static boolean isPalindrome(Node head) {
//                     if(head == null) return true;

//                     Node mid = middleElement(head);
//                     mid.next = reverseList(mid.next);
//                     Node head1 = head;
//                     Node head2 = mid.next;
        
//         while(head2 != null){
//             if(head1.data != head2.data)
//                 return false;
//             head1 = head1.next;
//             head2 = head2.next;
//         }
//         return true;

//  }
//           private static Node reverseList(Node mid) {
//                     Node curr = mid;
//                     Node prev = null;
//                     while(curr != null){
//                               Node temp = curr.next;
//                               curr.next = prev;
//                               prev = curr;
//                               curr = temp;
//                     }
//                     return prev;
//           }
//           private static Node middleElement(Node head) {
//                     Node fast = head;
//                     Node slow = head;
//                     while(fast != null && fast.next != null){
//                               fast = fast.next.next;
//                               slow = slow.next;
//                     }
//                     return slow;
//           }
        //   public boolean isPalindrome(ListNode head) {
        //     if(head == null || head.next == null) return true;
            
        //     ListNode slow = head;
        //     ListNode fast = head;
            
        //     while(fast.next != null && fast.next.next != null){
        //         slow = slow.next;
        //         fast = fast.next.next;
        //     }
        //     slow.next = reverseList(slow.next);
        //     slow = slow.next;
            
        //     while(slow != null){
        //         if(head.val != slow.val)
        //             return false;
                
        //         head = head.next;
        //         slow = slow.next;
        //     }
        //     return true; 
        // }
        // ListNode reverseList(ListNode head){
        //     ListNode pre = null;
        //     ListNode next = null;
            
        //     while(head != null){
        //         next = head.next;
        //         head.next = pre;
        //         pre = head;
        //         head = next;
        //     }
        //     return pre;
        // }
}
