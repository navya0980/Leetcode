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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode even=head;
        ListNode odd=head.next;
        ListNode temp=odd;
        while(even.next!=null&&odd.next!=null){
            even.next=odd.next;
            even=odd.next;
            odd.next=even.next;
            
            odd=even.next;
        }
       
       even.next=temp;


    return head;
    }
}