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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return head;
        }

        ListNode p=null,q=null,r=head;
        
        for(int i=1;i<k;i++){
            r=r.next;
        }
        p=r;
        q=head;
        
        while(r.next!=null){
            r=r.next;
            q=q.next;
        }

        int temp=p.val;
        p.val=q.val;
        q.val=temp;

        return head;
    }
}