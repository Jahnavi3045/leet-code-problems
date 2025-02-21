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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }
        ListNode p=new ListNode(0);
        ListNode q=new ListNode(0);
        ListNode np=p;
        ListNode nq=q;

        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                p.next=temp;
                p=p.next;
            }
            else{
                q.next=temp;
                q=q.next;
            }
            temp=temp.next;
        }
        p.next=nq.next;
        q.next=null;

        return np.next;
    }
}