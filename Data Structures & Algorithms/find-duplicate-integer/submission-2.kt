class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slow = nums[0]
        var fast =  nums[0]
        //finding the place inside loop where both element exist
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        //finding the enterance of loop
        slow = nums[0]
        while(slow!=fast){
            slow = nums[slow]
            fast = nums[fast]
        }
        return slow
    }
}
