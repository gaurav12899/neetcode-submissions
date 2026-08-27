class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toHashSet()
        var longest = 0

        for (num in set) {

            if (!set.contains(num - 1)) {

                var current = num
                var length = 1

                while (set.contains(current + 1)) {
                    current++
                    length++
                }

                longest = maxOf(longest, length)
            }
        }

        return longest
    
    }
}
