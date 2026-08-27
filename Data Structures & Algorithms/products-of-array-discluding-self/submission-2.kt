class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
            val n = nums.size
        val prefix = IntArray(n)
        val suffix = IntArray(n)
        val ans = IntArray(n)

        // Prefix products
        prefix[0] = 1

        for (i in 1 until n) {
            prefix[i] = prefix[i - 1] * nums[i - 1]
        }

        // Suffix products
        suffix[n - 1] = 1

        for (i in n - 2 downTo 0) {
            suffix[i] = suffix[i + 1] * nums[i + 1]
        }

        // Prefix * suffix
        for (i in 0 until n) {
            ans[i] = prefix[i] * suffix[i]
        }

        return ans
    }
}
