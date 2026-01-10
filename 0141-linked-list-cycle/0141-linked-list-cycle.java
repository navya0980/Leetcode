/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare=head,tortoise=head;
        while(hare!=null&&hare.next!=null){
           
            hare=hare.next.next;
            tortoise=tortoise.next;
             if(tortoise==hare){
                return true;
            }
        }
        return false;
    }
}