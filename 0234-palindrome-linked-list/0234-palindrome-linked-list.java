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
        String s="";
        while(temp!=null){
            s+=temp.val+"";
            temp=temp.next;
        }
        int end=s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(end)){
               return false;
            }
            end--;
        }
        return true;
    }
}