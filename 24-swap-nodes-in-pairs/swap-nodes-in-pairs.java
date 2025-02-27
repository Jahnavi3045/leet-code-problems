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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null ){
            return head;
        }
        ListNode p=new ListNode(0,head);
        ListNode q=p;
        
        while(q.next!=null && q.next.next!=null){
            ListNode f=q.next;
            ListNode s=q.next.next;
            f.next=s.next;
            s.next=f;
            q.next=s;
            q=f;
        }

        return p.next;
    }
}