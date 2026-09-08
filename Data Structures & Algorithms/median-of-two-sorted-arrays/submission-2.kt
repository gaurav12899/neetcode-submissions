class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        if (nums1.size > nums2.size) {
            return findMedianSortedArrays(nums2, nums1)
        }       
        var n1 = nums1.size
        var n2 = nums2.size
        var low = 0
        var high = n1
        var left = (n1+n2+1)/2
        while(low<=high){
            var i = low +(high-low)/2
            var j = left-i

            var leftnums1 = if(i==0) Int.MIN_VALUE else nums1[i-1]
            var rightnums1 = if(i==n1) Int.MAX_VALUE else nums1[i]

            var leftnums2 = if(j==0) Int.MIN_VALUE else nums2[j-1]
            var rightnums2 = if(j==n2) Int.MAX_VALUE else nums2[j]

            if(leftnums1>rightnums2) high=i-1
            else if(leftnums2>rightnums1) low = i+1
            else{
                val leftMax = max(leftnums1,leftnums2)
                if ((n1 + n2) % 2 == 1) {
                    return leftMax.toDouble()
                }
                val rightMin = minOf(rightnums1, rightnums2)
                return (leftMax + rightMin) / 2.0

            }

        }
            return 0.0

    }
}
