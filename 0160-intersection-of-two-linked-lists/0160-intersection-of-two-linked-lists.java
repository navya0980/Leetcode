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
        ArrayList<ListNode>list=new ArrayList<>();
        ListNode tempA=headA;
        while(tempA!=null){
            list.add(tempA);
            tempA=tempA.next;
        }
        ListNode tempB=headB;
        while(tempB!=null){
            if(list.contains(tempB)){
                return tempB;
            }
            tempB=tempB.next;
        }
        return null;
    }
}