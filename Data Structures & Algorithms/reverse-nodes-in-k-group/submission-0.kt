class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {

        val dummy = ListNode(0)
        dummy.next = head

        var groupPrev: ListNode? = dummy

        while (true) {

            // Find the kth node
            var kth = groupPrev

            repeat(k) {
                kth = kth?.next
            }

            // Not enough nodes
            if (kth == null) {
                break
            }

            val groupNext = kth.next

            // Reverse the group
            var prev = groupNext
            var current = groupPrev?.next

            while (current != groupNext) {
                val next = current?.next
                current?.next = prev
                prev = current
                current = next
            }

            // Connect previous part to reversed group
            val oldGroupStart = groupPrev?.next
            groupPrev?.next = kth

            // Move groupPrev to the end of reversed group
            groupPrev = oldGroupStart
        }

        return dummy.next
    }
}