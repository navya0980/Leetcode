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
        StringBuilder str=new StringBuilder();
        while(temp!=null){
            str.append(temp.val+"");

            temp=temp.next;

        }
      for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
      }
      return true;
    }
}