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
        
        
        ListNode lessX = new ListNode(-1);
        ListNode moreX = new ListNode(-1);
        
        ListNode l = lessX;
        ListNode m = moreX;
        
        while(head!=null){
            if(head.val<x){
                ListNode t = new ListNode(head.val);
                l.next =t;
                l = l.next; 
            }
            else{
                ListNode t =new ListNode(head.val);
                m.next = t;
                m = m.next;
            }
            head = head.next;
        }
        
        l.next = moreX.next;
        
        return lessX.next;
    }
}
