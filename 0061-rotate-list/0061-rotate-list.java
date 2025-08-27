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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        int c=1;
        while(temp.next!=null){
            temp=temp.next;
            c++;

        }
        k=k%c;
       while(k!=0){
       temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        ListNode tail=temp.next;
        temp.next=null;
        tail.next=head;
        head=tail;
        k--;
       }
       return head;
        
    }
}