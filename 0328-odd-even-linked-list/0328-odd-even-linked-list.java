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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();
        ListNode temp=head;
        int index=0;
        while(temp!=null){
            if(index%2==0){
                even.add(temp.val);
            }else{
                odd.add(temp.val);
            }
            temp=temp.next;
            index++;

        }
        temp=head;
        index=0;
        while(index<even.size()){
            temp.val=even.get(index);
            temp=temp.next;
            index++;

        }
        index=0;
        while(index<odd.size()){
            temp.val=odd.get(index);
            temp=temp.next;
            index++;

        }
        
return head;
    }
}