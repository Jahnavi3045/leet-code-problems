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
        if(head==null || head.next==null){
            return head;
        }
        ListNode p=new ListNode(0,head);
        ListNode q=head;

        int ctr=1;
        while(q.next!=null){
            ctr++;
            q=q.next;
        }

        ListNode prev=p,curr=head;

        while(ctr>=k){
            curr=prev.next;
            ListNode next=curr.next;
            for(int i=1;i<k;i++){
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev=curr;
            ctr=ctr-k;
        }

        return p.next;
    }
}