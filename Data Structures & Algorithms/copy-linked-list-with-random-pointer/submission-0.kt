/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        if(head == null)return null
        var map = HashMap<Node,Node>()
        var curr = head
        while(curr!=null){
            map[curr] = Node(curr.`val`)
            curr=curr.next
        }
        curr = head
        while(curr!=null){
            var copy = map[curr]!!
            copy.next = curr.next?.let{map[it]}
            copy.random = curr.random?.let{map[it]}
            curr=curr.next
        }
        return map[head]
    }
}
