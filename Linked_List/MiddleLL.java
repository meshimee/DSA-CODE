package Linked_List;
public class MiddleLL {
          static class Node{
                    int data;
                    Node next;
              
                    Node(int d)
                    {
                        data = d;
                        next = null;
                    }

                    public Node() {
                    }
          }
          public static void main(String[] args) {
                    Node n1 = new Node(1);
                    Node n2 = new Node(2);
                    Node n3 = new Node(3);
                    Node n4 = new Node(4);
                    Node n5 = new Node(5);
                    Node n6 = new Node(15);
                    Node head = n1;
                    n1.next = n2;
                    n2.next = n3;
                    n3.next = n4;
                    n4.next = n5;
                    n5.next = n6;
                    n6.next = null;
                    
                    Node ans = new Node();
                    ans = middleNode(head);
                    System.out.println(ans.data);
          }
          private static Node middleNode(Node head) {
                    Node fast = head;
                    Node slow = head;

                    while(fast != null && fast.next != null){
                              fast = fast.next.next;
                              slow = slow.next;
                    }
                    return slow;
          }
}
