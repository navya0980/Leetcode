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
        //checking the edge case
        if(head==null||head.next==null||k==0){
            return head;
        }
        //finding the size of the linked list
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;

        }
        
       k=k%size;
       if(k==0)return head;
       temp.next=head;
       int n=size-k;
       temp=head;
       for(int i=1;i<n;i++){
           temp=temp.next;
       }
       ListNode newHead=temp.next;
       temp.next=null;


       return newHead;

        
    }
}