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
    Map<ListNode,Integer>nodeMap=new HashMap<>();
    ListNode tempA=headA;
    ListNode tempB=headB;
    while(tempB!=null){
       
        nodeMap.put(tempB,1);
        tempB=tempB.next;
        
    }
    while(tempA!=null){
        if(nodeMap.containsKey(tempA))
         return tempA;
        tempA=tempA.next;
    }
    return null;
    }
}