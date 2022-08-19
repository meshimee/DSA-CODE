package Linked_List;

public class Reverse {
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
                    Node n1 = new Node(10);
                    Node n2 = new Node(20);
                    Node n3 = new Node(30);
                    Node n4 = new Node(40);
                    Node n5 = new Node(50);
                    Node head = n1;
                    n1.next = n2;
                    n2.next = n3;
                    n3.next = n4;
                    n4.next = n5;
                    n5.next = null;
                    printllist(head);
                    head = reverseList(head);
                    printllist(head);
                    
                   
          }
          private static Node reverseList(Node head) {
                    Node curr = head;
                    Node prev = null;

                    while( curr != null){
                              Node temp = curr.next;
                              curr.next = prev;
                              prev = curr;
                              curr = temp;
                    }
                    return prev;
          }
          // private static void reverseList(Node head) {
          //           Node prev = head;
          //           Node curr = head.next;
          //           while(curr != null){
          //                     Node temp = curr.next;
          //                     curr.next = prev;
          //                     prev = curr;
          //                     curr = temp;
          //           }
          //           head.next = null;
          //           head = prev;
          // }
          private static void printllist(Node head) {
                    Node curr = head;
                    while(curr != null){
                              System.out.print(curr.data+"->");
                              curr = curr.next;
                    }
                    System.out.println();
          }

          
}
