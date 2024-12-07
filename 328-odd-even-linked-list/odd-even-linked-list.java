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

        if(head==null || head.next==null){
            return head;
        }
        ListNode p=head;
        ListNode q=head.next;
        ListNode np=p;
        ListNode nq=q;

        while(nq!=null && nq.next!=null){
            np.next=np.next.next;
            np=np.next;
            nq.next=nq.next.next;
            nq=nq.next;
        }

        
        np.next=q;
        return head;
    }
}