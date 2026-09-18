/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var deque = ArrayDeque<TreeNode?>()
        val list = mutableListOf<List<Int>>()
        if(root==null)return list
        deque.addLast(root)
        while(deque.isNotEmpty()){
            val levelSize = deque.size
            val inList = mutableListOf<Int>()

            repeat(levelSize){
                val node = deque.removeFirst()
                inList.add(node!!.`val`)
                if(node.left!=null){
                    deque.addLast(node.left)
                }
                if(node.right!=null){
                    deque.addLast(node.right)
                }
            }
            list.add(inList)
        }
        return list
    }
}
