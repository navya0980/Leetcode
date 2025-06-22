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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode front=null;
        while(temp!=null){
              front=temp.next;
             
             if(temp==head){
               
                temp.next=null;
                prev=temp;

             }else{
                temp.next=prev;
                prev=temp;

             }
             temp=front;
        }
       head=prev;
       

       return head;
    }
}