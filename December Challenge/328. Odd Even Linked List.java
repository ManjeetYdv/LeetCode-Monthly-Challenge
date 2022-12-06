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
        if(head==null || head.next==null || head.next.next==null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evens = head.next; //even head

        while(odd!=null &&  odd.next!=null && even.next!=null){
            ListNode oddnext = even.next;
            even.next = even.next.next; 
            even = even.next;
            odd.next = oddnext;
            odd = oddnext;
          }

          odd.next = evens;
          return head;

    }
}
