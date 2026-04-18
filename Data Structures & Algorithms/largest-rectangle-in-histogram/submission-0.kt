class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        var maxArea = 0
        var nse = nextSmallerElement(heights)
        var pse = previousSmallerElement(heights)
        for( i in heights.indices){
            var area = (nse[i]-pse[i]-1)*heights[i]
            maxArea = maxOf(area,maxArea)
        }
        return maxArea

    }
    fun nextSmallerElement(heights:IntArray): IntArray{
        val nse = IntArray(heights.size) { heights.size } 
        val stack = ArrayDeque<Int>()
        
        for (i in heights.indices.reversed()) {
            while (stack.isNotEmpty() && heights[stack.last()] >= heights[i]) {
                stack.removeLast()
            }
            
            if (stack.isNotEmpty()) {
                nse[i] = stack.last()
            }
            stack.addLast(i)
        }
        return nse
    }
    fun previousSmallerElement(heights: IntArray): IntArray {
        val pse = IntArray(heights.size) { -1 }
        val stack = ArrayDeque<Int>() 

        for (i in heights.indices) {
            while (stack.isNotEmpty() && heights[stack.last()] >= heights[i]) {
                stack.removeLast()
            }
            
            if (stack.isNotEmpty()) {
                pse[i] = stack.last()
            }
            stack.addLast(i)
        }
        return pse
    }
}
