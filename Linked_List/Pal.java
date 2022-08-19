//Weather a linked_List is Palindrome or not 
package Linked_List;
public class Pal {
          static ListNode head;
          static class ListNode{
                    int data;
                    ListNode next;
                    ListNode(int d){
                              data = d;
                              next = null;
                    }
          }
          public static void main(String[] args) {
                    ListNode n1 = new ListNode(1);
                    ListNode n2 = new ListNode(2);
                    // ListNode n3 = new ListNode(2);
                    // ListNode n4 = new ListNode(1);
                    // ListNode head = n1;
                    n1.next = n2;
                    n2.next = null;
                    // n3.next = n4;
                    // n4.next = null;
                    boolean ans = isPalindrome(head);
                    System.out.println(ans);
          }
          private static boolean isPalindrome(ListNode head) {
                    ListNode next=null;
                    ListNode curr=head;
                    ListNode prev=null;
                    ListNode head1=head;
                    int n=0;
                    while(head1!=null)
                    {
                        n++;
                        head1=head1.next;
                    }
                    int mid=n/2;
                    while(mid!=0)
                    {
                        next=curr.next;
                        curr.next=prev;
                        prev=curr;
                        curr=next;
                        mid--;
                    }
                    if(n%2!=0)
                        curr=curr.next;
                    while(curr!=null)
                    {
                        if(prev.data!=curr.data)
                            return false;
                        curr=curr.next;
                        prev=prev.next;
                    }
                    return true;
                    
          }
}
