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
    public ListNode sortList(ListNode head) {
        
      return Sort(head); 
    }
    public static ListNode Sort(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode h=slow.next;
        slow.next=null;
      head=  Sort(head);
      h=  Sort(h);
      return  merge(head,h);
    }
    public static ListNode merge(ListNode head,ListNode h){
        
        ListNode left=head;
        ListNode right=h;
        ListNode newHead=new ListNode();
        ListNode temp=newHead;
        while(left!=null&&right!=null){
            if(left.val<=right.val){
               
                  temp.next=left;
                 
                  left=left.next;
                
            }else{
                
                  temp.next=right;
                 
                  right=right.next;
            }
            temp=temp.next;
        }
       if(left!=null){
         temp.next=left;
                 
                 
               
       }else{
              temp.next=right;
                 
                  
                  
       }
        return newHead.next;
    }
}