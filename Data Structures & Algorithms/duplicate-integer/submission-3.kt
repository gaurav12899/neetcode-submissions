class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var mset = mutableSetOf<Int>()
        for(i in nums){
            if(mset.contains(i)){
                return true
            }
            mset.add(i)
        }
        return false

    }
}
