// Given the root of a binary tree, return all root-to-leaf paths in any order.

// A leaf is a node with no children.

 

// Example 1:


// Input: root = [1,2,3,null,5]
// Output: ["1->2->5","1->3"]
// Example 2:

// Input: root = [1]
// Output: ["1"]

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        String str ="";
        TreePaths(list,root,str);
        return list;
    }
    public void TreePaths(List<String> list,TreeNode root,String str)
    {
        if(root == null) return;
        
        
        if(root.left==null && root.right==null)
        {
            list.add(str+root.val);
        }
        str+=root.val+"->";
        TreePaths(list,root.left,str);
        TreePaths(list,root.right,str);
        
            
    }
}
