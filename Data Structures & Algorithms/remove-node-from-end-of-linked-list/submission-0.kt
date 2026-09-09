/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        var total = 0
        var temp = head
        while(temp!=null){
            total++
            temp=temp?.next
        }
        if (n == total) {
            return head?.next
        }
        temp = head
        for(i in 0 until total-n-1){
            temp = temp?.next
        }
        temp?.next=temp.next?.next
        return head
    }
}
