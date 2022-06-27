/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    static int getSize(ListNode head){
        ListNode temp = head;
        int count=0;
        
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        
        int l1 = getSize(ptr1);
        int l2 = getSize(ptr2);
        
        if(l1>l2){
            int diff = l1-l2;
            
            for(int i=0 ;i<diff ;i++){
                ptr1 =ptr1.next;
            }
            
        }
        else {
            int diff = l2-l1;
            for(int i=0 ;i<diff ;i++){
                ptr2 =ptr2.next;
            }
            
        }
        
        while(ptr1 !=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return ptr1;
        
        
    }
}
