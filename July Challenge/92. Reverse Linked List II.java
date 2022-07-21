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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
      
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode res = dummy;
        
        for(int i=1 ;i< left ;i++){    //iterating res to 1 prev of left
            res = res.next;
         }
        
        ListNode leftN = res.next;    //Storing the left Node
        
        ListNode prev =null;
        ListNode curr = res.next;
        ListNode next = curr;
        
        
        for(int i=0 ;i<right-left+1 ;i++){     //Reversing the left to right nodes
            next = curr.next;
            curr.next = prev;
            
            prev =curr;
            curr= next;
            
        }
          // 1->2->3->4->5 
          //res was at 1  and prev pointer is pointing to 4   , then res.next = prev;  ==> 1->4->3->2->null
          //curr is at 5 and and leftN has 2 , then leftN.next =curr;     ==> 1->4->3->2-> 
          //we got our desired reversed list
         
         
          
         
        res.next = prev;          
        leftN.next = curr;
       
        
        return dummy.next;
        
        
        
        
        
    }
}
