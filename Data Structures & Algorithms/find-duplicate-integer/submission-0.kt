class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var set = mutableSetOf<Int>()
        for( i in nums){
            if(set.contains(i))return i
            else set.add(i)
        }
        return -1
    }
}
