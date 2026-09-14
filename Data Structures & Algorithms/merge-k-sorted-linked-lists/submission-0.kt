/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val pq =  PriorityQueue<ListNode>{ a,b->
            a.`val`- b.`val`
        }
        var dummy = ListNode(0)
        var current =  dummy
        for(node in lists){
            if (node != null) {
                pq.offer(node)
            }
        }
        while(pq.isNotEmpty()){
            var node = pq.poll()
            current.next = node
            current = current.next!!
            if(node.next!=null){
                pq.offer(node.next)
            }
        }
        return dummy.next
    }
}
