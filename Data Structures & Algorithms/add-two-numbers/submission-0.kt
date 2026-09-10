/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var  temp = ListNode(0)
        var dummyNode = temp
        var p1 = l1
        var p2 = l2
        var carry = 0
        while(p1!=null && p2!=null){
            var sum = p1.`val`+p2.`val`+carry
            val digit = sum % 10
            carry = sum / 10
            var node = ListNode(digit)
            temp.next = node
            temp = node
            p1=p1.next
            p2=p2.next
        }
        while(p1!=null){
            var sum = p1.`val`+carry
            val digit = sum % 10
            carry = sum / 10
            var node = ListNode(digit)
            temp.next = node
            temp = node
            p1 = p1.next
        }

        while(p2!=null){
            var sum = p2.`val`+carry
            val digit = sum % 10
            carry = sum / 10
            var node = ListNode(digit)
            temp.next = node
            temp = node
            p2 = p2.next
        }
        if(carry!=0){
            temp.next=ListNode(carry)
        }
        return dummyNode.next
    }
}
