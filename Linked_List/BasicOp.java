package Linked_List;

public class BasicOp {
          static Node head;
          
          static class Node {
                    int data;
                    Node next;
              
                    Node(int d)
                    {
                        data = d;
                        next = null;
                    }
                }
          public static void main(String[] args) {
                    Node n1 = new Node(3);
                    Node n2 = new Node(5);
                    Node n3 = new Node(7);
                    Node n4 = new Node(11);

                    Node head = n1;
                    head.next = n2;
                    n2.next = n3;
                    n3.next = n4;
                    n4.next = null;
                    //addFirst(13);
                    printList(head);
                    insert(13,head,0);
                    
                    delete(head,2);
                    printList(head);
          }
          
          private static void delete(Node head2, int pos) {
                    if(pos == 0){
                              head = head.next;
                              return;
                    }
                    Node prev = head;
                    for(int i = 0; i<pos-1 ; i++){
                              prev = prev.next;
                    }
                    prev.next = prev.next.next;
          }


          private static void insert(int i, Node head, int pos) {
                   Node toAdd = new Node(i);
                   if(pos == 0){
                    toAdd.next = head;
                    head = toAdd;
                    return;
                   } 
                   Node prev = head;
                   for(int j = 0; j<pos-1 ; j++){
                    prev = prev.next;
                   }
          toAdd.next = prev.next;
                   prev.next = toAdd;
                   printList(head);
          }

          // private static void addFirst(int i) {
          //  Node temp = new Node(i);
          //  temp.next = head;
          //  head = temp;
          //  return;
          // }

          private static void printList(Node head) {
                    Node current = head;
                    while(current != null){
                              System.out.print(current.data + " ");
                              current = current.next;
                    }
                    System.out.println();
          }
}
