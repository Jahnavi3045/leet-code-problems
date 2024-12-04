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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode p=head;
        int ctr=1;
        while(p.next!=null){
            ctr++;
            p=p.next;
        }
        p.next=head;
        
        k=k%ctr;
        k=ctr-k;
        
        for(int i=1;i<=k;i++){
            p=p.next;
        }
        head=p.next;
        p.next=null;

        return head;
    }
}