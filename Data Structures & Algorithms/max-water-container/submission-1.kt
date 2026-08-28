class Solution {
    fun maxArea(heights: IntArray): Int {
        // steps
        // 1. loop through left and right
        // 2. find min of l and r and find area btw them using min of both
        // 3. if l is left increase left othrwise decrease right

        var l=0
        var r =heights.size-1
        var mxWater = 0
        while(l<r){
            val water = minOf(heights[l],heights[r])*(r-l)
            mxWater = maxOf(mxWater,water)
            if(heights[l]<heights[r]){
                l++
            }else if(heights[l]>heights[r]){
                r--
            }else{
                l++
                r--
            }
        }
        return mxWater

        
    }
}
