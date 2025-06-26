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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head,prev,front;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        prev=slow;
        slow=slow.next;
        prev.next=null;
        while(slow!=null){
            front=slow.next;
            slow.next=prev;
            prev=slow;
            slow=front;
        }
        fast=head;
        slow=prev;
        while(slow!=null){
            if(fast.val!=slow.val)
              return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}