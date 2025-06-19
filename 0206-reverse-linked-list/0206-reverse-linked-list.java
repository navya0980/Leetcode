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
        int size=0;

        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        int end=size-1;
        for(int i=0;i<size/2;i++){
            ListNode node=get(head,end); 
            int value=node.val;
            node.val=temp.val;
            temp.val=value; 
            end--;
            temp=temp.next;
        }
        return head;
    }
    public static ListNode get(ListNode head,int index){
           ListNode temp=head;
           for(int i=1;i<=index;i++){
            temp=temp.next;
           }
           return temp;

    }
}