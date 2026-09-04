class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        var st = Stack<Int>()
        var maxArea =0
        for(i in 0..heights.size){
            val currentHeight = if (i == heights.size) 0 else heights[i]

            while(st.isNotEmpty() && heights[st.peek()]>currentHeight){
                val top = st.pop()
                val height = heights[top]
                var width = if(st.isEmpty()) i else i-st.peek()-1
                var area = width*height
                maxArea = maxOf(area,maxArea)
            }
            st.push(i)
        }
        return maxArea
    }
}
