class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var start = 1
        var end = piles.maxOrNull()!!
        var ans = end

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (isValid(piles, mid, h)) {
                ans = mid
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return ans
    }

    fun isValid(piles: IntArray, k: Int, h: Int): Boolean {
        var time = 0

        for (pile in piles) {
            time += (pile + k - 1) / k

            if (time > h) return false
        }

        return true
    }
}