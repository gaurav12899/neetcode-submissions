class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var mMap = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            var rem = target-nums[i]
          val complement = target - nums[i]
            
            if (mMap.containsKey(complement)) {
                return intArrayOf(mMap[complement]!!, i)
            }
            mMap[nums[i]] = i
        }
        return intArrayOf()
    }
}
