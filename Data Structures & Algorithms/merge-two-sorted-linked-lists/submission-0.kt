/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        

        var head = ListNode(0)
        var result = head
        var list1 = l1
        var list2 = l2
        while(list1!=null && list2!=null){
            if(list1.`val`<list2.`val`){
                head.next = list1
                list1 = list1.next
            }else{
                head.next = list2
                list2=list2.next
            }
            head=head.next!!
        }
        if(list1!=null)head.next = list1
        else if( list2!=null)head.next = list2
        return result.next
    }
}
