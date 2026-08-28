class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        val ans = mutableListOf<List<Int>>()

        for (i in 0 until nums.size - 2) {

            if (i > 0 && nums[i] == nums[i - 1]) continue

            var l = i + 1
            var r = nums.size - 1

            while (l < r) {

                val sum = nums[i] + nums[l] + nums[r]

                if (sum < 0) {
                    l++
                } else if (sum > 0) {
                    r--
                } else {
                    ans.add(listOf(nums[i], nums[l], nums[r]))

                    // Skip duplicates
                    while (l < r && nums[l] == nums[l + 1]) l++
                    while (l < r && nums[r] == nums[r - 1]) r--

                    l++
                    r--
                }
            }
        }

        return ans
    }
}
