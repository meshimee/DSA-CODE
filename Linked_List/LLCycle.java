package Linked_List;
public class LLCycle {
          static class Node{
                    int data;
                    Node next;
                    Node(int d){
                               data = d;
                               next = null;
                              
                    }
                    public Node() {
                    }
          }
          public static void main(String[] args) {
                Node n1 = new Node(3);
                Node n2 = new Node(2);
                Node n3 = new Node(0);
                Node n4 = new Node(-4);
                Node head = n1;
                
                n1.next = n2;
                n2.next = n3;
                n3.next = n4;
                n4.next = null;
                boolean ans = hasCycle(head);
                System.out.println(ans);
          }
          private static boolean hasCycle(Node head) {
            if (head == null || head.next == null)
            return false;

        Node slow  = head;
        Node fast  = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {                      
                return true;
            }
        }
        return false;
          }
}
