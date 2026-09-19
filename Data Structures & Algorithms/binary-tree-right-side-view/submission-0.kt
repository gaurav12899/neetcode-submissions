/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if(root==null)return emptyList()
        var list = mutableListOf<Int>()
        var queue =  ArrayDeque<TreeNode>()
        queue.addLast(root)
        while(queue.isNotEmpty()){
            val levelSize = queue.size
            repeat(levelSize){
                val node = queue.removeFirst()
                if(it==levelSize-1){
                    list.add(node.`val`)
                }
                node.left?.let{
                    queue.addLast(it)
                }
                node.right?.let{
                    queue.addLast(it)
                }
            }
        }
        return list
    }   
}
