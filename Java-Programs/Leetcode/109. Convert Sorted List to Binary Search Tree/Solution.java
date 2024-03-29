// Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

// For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 

// Example 1:

// Input: head = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]
// Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.

// Example 2:

// Input: head = []
// Output: []

// Example 3:

// Input: head = [0]
// Output: [0]

// Example 4:

// Input: head = [1,3]
// Output: [3,1]

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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        
            ListNode slow=head;
            ListNode fast=head;
            ListNode pre=null;
            ListNode cur=head;
            ListNode next = null;
            while(fast!=null&&fast.next!=null)
            {
                pre=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            if(pre!=null)
                pre.next=null;
            next = slow.next;
            slow.next=null;
            
            TreeNode root = new TreeNode(slow.val);
        
        if(fast==slow)
            return root;
            
            root.left = sortedListToBST(cur);
            root.right = sortedListToBST(next);
        
        return root;
    }
}
