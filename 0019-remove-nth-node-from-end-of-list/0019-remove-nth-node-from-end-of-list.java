/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp=head;
     int size=0;
     while(temp!=null){
        temp=temp.next;
        size++;
     } 
     if(size-n==0){
        head=head.next;
        return head;
     }
     int index=size-n;
     temp=head;
     for(int i=1;i<index;i++){
        temp=temp.next;
     }
     temp.next=temp.next.next;
     return head;
    }
}