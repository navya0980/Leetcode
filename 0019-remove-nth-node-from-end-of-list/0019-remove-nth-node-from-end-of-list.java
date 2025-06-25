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
        int size=0;
        ListNode temp=head;
        ListNode tail=temp;
        while(temp!=null){
            tail=temp;
            temp=temp.next;
            size++;
        }
        
        if(size-n==0){
            head=head.next;
            return head;
        }
        temp=head;
        for(int i=1;i<size-n;i++){
            temp=temp.next;
        }
        
            temp.next=temp.next.next;
        
        return head;

    }
    
}