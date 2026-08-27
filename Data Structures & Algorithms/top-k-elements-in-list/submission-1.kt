class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var freq = mutableMapOf<Int,Int>()
        for(num in nums){
            freq[num] = freq.getOrDefault(num, 0) + 1
        }
        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }

        for ((num, count) in freq) {
            buckets[count].add(num)
        }
        var result = mutableListOf<Int>()
        for(bucket in buckets.size-1 downTo 1){
            for(num in buckets[bucket]){
                result.add(num)
                if(result.size==k)return result.toIntArray()
            }
        }
                return result.toIntArray()

    }
}
