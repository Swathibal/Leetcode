// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

// For example, the following two linked lists begin to intersect at node c1:


// It is guaranteed that there are no cycles anywhere in the entire linked structure.

// Note that the linked lists must retain their original structure after the function returns.

 

// Example 1:


// Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
// Output: Intersected at '8'
// Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
// From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

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
    public static int len(ListNode ele)
{
    int length=0;
    while(ele!=null)
    {
        length++;
        ele=ele.next;
    }
    return length;
}

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = len(headA);
        int lenB = len(headB);
        ListNode node1 = headA;
        ListNode node2 = headB;
        while(lenA>lenB)
        {
            node1 = node1.next;
            lenA--;
        }
        while(lenB>lenA)
        {
            node2 = node2.next;
            lenB--;
        }
        while(node1!=node2)
        {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
}
}
