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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=new ListNode(0,head);
        ListNode prev=p;
        ListNode curr=head;
        
        while(curr!=null){
            boolean flag=false;
            while(curr.next != null && curr.val == curr.next.val){
                curr=curr.next;
                flag=true;
            }
            if(flag){
                prev.next=curr.next;
            }
            else{
                prev=prev.next;
            }   
            curr=curr.next;
        }

        return p.next;
    }
}