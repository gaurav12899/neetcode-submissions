/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */


class Solution {
    var diameter = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {   
        find(root)
        return diameter
    }
    fun find(root:TreeNode?):Int{

        if(root==null)return 0
        var lHeight = find(root.left)
        var rHeight = find(root.right)
        diameter = maxOf(diameter,lHeight+rHeight)
        return maxOf(lHeight,rHeight)+1
    }
    
}
