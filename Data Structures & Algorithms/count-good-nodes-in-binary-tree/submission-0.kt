/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {

    fun goodNodes(root: TreeNode?): Int {
        return dfs(root, Int.MIN_VALUE)
    }

    private fun dfs(node: TreeNode?, maxSoFar: Int): Int {
        if (node == null) return 0

        var count = 0
        var currentMax = maxSoFar

        if (node.`val` >= maxSoFar) {
            count++
            currentMax = node.`val`
        }

        count += dfs(node.left, currentMax)
        count += dfs(node.right, currentMax)

        return count
    }
}
