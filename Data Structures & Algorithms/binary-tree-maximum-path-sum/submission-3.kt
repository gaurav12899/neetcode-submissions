/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxPathSum(root: TreeNode?): Int {
        var ans = Int.MIN_VALUE
        fun dfs(root: TreeNode?): Int{
            if(root == null)return 0
            var left = maxOf(0,dfs(root.left))
            var right =  maxOf(0,dfs(root.right))
            var currentPath =  left + root.`val` + right
            ans = maxOf(ans,currentPath)
            return root.`val` + maxOf(left,right)
        }
        dfs(root)
        return ans
    }
}
