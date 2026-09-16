/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root==null)return true
        var left = height(root.left)
        var right = height(root.right)

        if (kotlin.math.abs(left - right) > 1) {
            return false
        }

        return isBalanced(root.left) && isBalanced(root.right)
    }
    fun height(root:TreeNode?):Int{
        if(root==null)return 0
        return max(height(root.left),height(root.right))+1
    }
}
