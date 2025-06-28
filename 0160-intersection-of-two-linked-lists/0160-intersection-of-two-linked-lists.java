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
         int len1=0;
         int len2=0;
         while(tempA!=null){
            len1++;
            tempA=tempA.next;
         }
         while(tempB!=null){
            len2++;
            tempB=tempB.next;
         }
        
         if(len1>len2){
            int diff=len1-len2;
            while(diff!=0){
               headA=headA.next;
               diff--;
            }
         }else{
            int diff=len2-len1;
            while(diff!=0){
                headB=headB.next;
                diff--;
            }
         }
          tempA=headA;
         tempB=headB;
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