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
        if(head==null){
            return head;
        }
       ListNode odd=head,even=head.next,tempOdd=odd,tempEven=even;
       while(tempOdd!=null&&tempEven!=null&&tempOdd.next!=null&&tempEven.next!=null){
        tempOdd.next=tempEven.next;
         tempOdd=tempOdd.next;
        tempEven.next=tempOdd.next;
       
        tempEven=tempEven.next;
       }
       tempOdd.next=even;
      if(tempEven!=null){
         tempEven.next=null;
      }
       return head;

    }
}