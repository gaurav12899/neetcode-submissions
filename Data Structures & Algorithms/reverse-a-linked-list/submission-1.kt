/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(curr: ListNode?): ListNode? {
        var prev :ListNode? = null
        var head = curr
        while(head!=null){
            var next :ListNode? = null
            next = head.next
            head.next = prev
            prev = head
            head = next
        }
        return prev
    }
}
