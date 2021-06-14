// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//   Input: head = [1,1,2]
// Output: [1,2]

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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode cur = head;
        if(head == null)
            return head;
        
        ListNode nxt = head.next;
        while(nxt!=null)
        {
            if(cur.val == nxt.val)
            {
                cur.next = nxt.next;
            }
            else
                cur = nxt;
            
            nxt = cur.next;
        }
        return head;
    }
}
