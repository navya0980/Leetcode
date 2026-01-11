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
    public boolean isPalindrome(ListNode head) {
      ListNode temp=head;
      int size=0;
      while(temp!=null){
         size++;
         temp=temp.next;
      } 
      temp=head;
      ListNode prev=null,node=null;
      for(int i=0;i<size/2;i++){
         node=temp.next;
         if(temp==head){
            temp.next=null;
         }else{
            temp.next=prev;
         }
         prev=temp;
         temp=node;
      } 
      if(size%2!=0&&node!=null){
        node=node.next;
      }
      while(prev!=null&&node!=null){
        if(prev.val!=node.val){
            return false;
        }
        prev=prev.next;node=node.next;
      }
      return true;
    }
}