package Linked_List;
import java.util.LinkedList;
public class MergeTwoSortedLL {
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
                    Node n1 = new Node(1);
                    Node n2 = new Node(2);
                    Node n3 = new Node(3);
                    Node n4 = new Node(5);
                    Node head = n1;
                    head.next = n2;
                    n2.next = n3;
                    n3.next = n4;
                    n4.next = null;

                    Node m1 = new Node(1);
                    Node m2 = new Node(2);
                    Node m3 = new Node(3);
                    Node m4 = new Node(5);
                    Node head1 = m1;
                    head1.next = m2;
                    m2.next = m3;
                    m3.next = m4;
                    m4.next = null;
                  

                   Node ans = mergeTwoList(head,head1);
                   System.out.println(ans);

          }
          private static Node mergeTwoList(Node head, Node head1) {
                    Node n1 = head;
                    Node n2 = head1;
                    Node n = new Node();
          
                    LinkedList<Integer> list = new LinkedList<>();

                    while(n1 != null && n2 != null){
                               if(n1.data <= n2.data){
                                        list.add(n1.data);
                                        n1 = n1.next;
                               }
                               else{
                                        list.add(n2.data);
                                        n2 = n2.next;
                               }
                               
                    }
                    while(n1 != null){
                              list.add(n1.data);
                              n1 = n1.next;
                               
                    }
                    while(n2 != null){
                              list.add(n2.data);
                              n2 = n2.next;
                              
                    }
                   
                    return n;
          }
          
}
