// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
// and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
  
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode();
        ListNode p=l1,q=l2,demo=temp;
        int carry=0;
        while(p!=null || q!=null)
        {
            int x = (p!=null) ? p.val:0;
            int y = (q!=null) ? q.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            demo.next=new ListNode(sum%10);
            demo=demo.next;
            if(p!=null)
                p=p.next;
            if(q!=null)
                q=q.next;
            
        }
        if (carry > 0) {
         demo.next= new ListNode(carry);
    }
        return temp.next;
    }
}
