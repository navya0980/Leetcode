/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
         ListNode tempB=headB;
         while(tempA!=null&&tempB!=null){
            tempA=tempA.next;
            tempB=tempB.next;
         }
         if(tempA==null){
            tempA=headB;
         }else{
            tempB=headA;
         }
         while(tempA!=null&&tempB!=null){
            
            tempA=tempA.next;
            tempB=tempB.next;
         }
         if(tempA==null){
            tempA=headB;
         }else{
            tempB=headA;
         }
         while(tempA!=null&&tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
         }

      return null;     
    }
}