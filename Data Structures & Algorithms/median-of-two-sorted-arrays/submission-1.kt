class Solution {
    fun findMedianSortedArrays(a1: IntArray, a2: IntArray): Double {
        val n1 = a1.size
        val n2 = a2.size
        
        // Ensure a1 is always the smaller array
        if (n1 > n2) return findMedianSortedArrays(a2, a1)
        
        var low = 0
        var high = n1
        val left = (n1 + n2 + 1) / 2
        
        // FIX 1: Must be <= to allow partition at the extreme edges (0 or n1)
        while (low <= high) {
            // Safer calculation to prevent integer overflow
            val mid1 = low + (high - low) / 2 
            val mid2 = left - mid1
            
            var l1 = Int.MIN_VALUE
            var l2 = Int.MIN_VALUE
            var r1 = Int.MAX_VALUE
            var r2 = Int.MAX_VALUE
            
            if (mid1 < n1) r1 = a1[mid1]
            if (mid2 < n2) r2 = a2[mid2]
            if (mid1 - 1 >= 0) l1 = a1[mid1 - 1]
            if (mid2 - 1 >= 0) l2 = a2[mid2 - 1]
            
            // Found the perfect partition
            if (l1 <= r2 && l2 <= r1) {
                // FIX 2: Use maxOf and minOf
                if ((n1 + n2) % 2 == 1) {
                    return maxOf(l1, l2).toDouble()
                } else {
                    return (maxOf(l1, l2) + minOf(r1, r2)) / 2.0
                }
            } else if (l1 > r2) {
                // Took too many from a1's left side, move partition left
                high = mid1 - 1
            } else {
                // Took too few from a1's left side, move partition right
                low = mid1 + 1
            }
        }
        
        return 0.0
    }
}