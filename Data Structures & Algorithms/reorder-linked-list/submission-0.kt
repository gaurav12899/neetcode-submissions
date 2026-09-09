/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var slow = head
        var fast = head
        while(fast?.next!=null){
            slow=slow?.next
            fast=fast.next?.next
        }
        var second = reverseLinkedList(slow?.next) 
        slow?.next=null
        var first = head

        while(second!=null){
            var firstNext = first?.next
            var secondNext = second.next

            first?.next =  second
            second.next = firstNext

            first=firstNext
            second=secondNext
        }
    }
    fun reverseLinkedList(head:ListNode?):ListNode?{
        var prev :ListNode?= null
        var curr = head
        while(curr!=null){
            var next = curr.next
            curr.next =  prev
            prev = curr
            curr = next
        }
        return prev
    }
}
