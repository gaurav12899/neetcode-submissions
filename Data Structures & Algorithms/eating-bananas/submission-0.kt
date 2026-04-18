class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var start = 1
        var end = piles.maxOrNull() ?: 1
        
        var bestSpeed = end

        while (start <= end) {
            val mid = start + (end - start) / 2 
            
            if (canFinish(piles, mid, h)) {
                bestSpeed = mid
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return bestSpeed
    }

    private fun canFinish(piles: IntArray, k: Int, h: Int): Boolean {
        var totalHours = 0L 
        
        for (pile in piles) {
            totalHours += (pile + k - 1) / k  //uper bound
        }
        
        return totalHours <= h
    }
}