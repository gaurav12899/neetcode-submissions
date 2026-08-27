class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var s = mutableSetOf<Int>()
        for( i in nums){
            if(!s.add(i))return true
        }
        return false
    }
}
