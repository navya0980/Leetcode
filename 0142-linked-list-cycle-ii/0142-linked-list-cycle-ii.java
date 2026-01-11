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
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer> nodeMap=new HashMap<>();
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            if(nodeMap.containsKey(temp)){
                return temp;
            }
            nodeMap.put(temp,count);
            count++;
            temp=temp.next;
        }
        return null;
        
    }
}