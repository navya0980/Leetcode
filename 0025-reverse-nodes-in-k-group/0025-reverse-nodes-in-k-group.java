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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode temp=head;
       ListNode prev=null,nextNode=null;
       while(temp!=null){
        ListNode kthnode=getkth(temp,k);
        if(kthnode==null){
            if(prev!=null)
                prev.next=nextNode;
                break;
        }
        nextNode=kthnode.next;
        kthnode.next=null;
        ListNode newhead=reverse(temp);
        if(temp==head){
            head=newhead;
        }else{
          prev.next=newhead;
        }
        prev=temp;
        temp=nextNode;

       } 
       return head;
    }
    public static ListNode getkth(ListNode temp,int k){
        int index=1;
        while(temp!=null&&index<k){
          temp=temp.next;
          index++;
        }
        return temp;

    }
    public static ListNode reverse(ListNode head){
          ListNode temp=head,prev=null;
          ListNode front=null;
         
          while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
          }
          return prev;
    }
}