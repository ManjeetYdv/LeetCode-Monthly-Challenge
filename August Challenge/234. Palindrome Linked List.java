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
    public ListNode reverse(ListNode root){
        
        ListNode prev= null;
        ListNode curr = root;
        ListNode nxt = root;
        
        while(curr!=null){
            
           nxt = curr.next;
           curr.next = prev;
           prev= curr;
           curr = nxt;
            
        }
        
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        
        
        if(head.next==null) return true;
        
        
        ListNode slow = head;
        ListNode fast = head;
         
        while(fast.next!=null && fast.next.next!=null ){
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        slow.next = reverse(slow.next);
        slow = slow.next;
        
        fast = head;
        
        while(slow!=null){
            if(fast.val!=slow.val) return false;
            
            fast = fast.next;
            slow = slow.next;
            
        }
        
        return true;
        
    
   }
}
