/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(curr: ListNode?): ListNode? {
        var prev :ListNode? = null
        var next :ListNode? = null
        var head = curr
        if(head == null || head.next==null)return head
        while(head!=null){
            next = head.next
            head.next = prev
            prev = head
            head = next
        }
        return prev
    }
}
