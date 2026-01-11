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
        if(head.next==null&&n==1){
            return head.next;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int a=size-n;
        if(a==0){
            return head.next;
        }
        temp=head;
        ListNode prev=null;
        for(int i=0;i<size;i++){
            if(i==a){
                break;
            }
            prev=temp;
            temp=temp.next;

        }
        if(temp!=null&&prev!=null){
            prev.next=temp.next;
        }
        return head;
    }
}