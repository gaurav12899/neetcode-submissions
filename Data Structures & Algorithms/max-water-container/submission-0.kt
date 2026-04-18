class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var i = 0
        var j = height.size-1
        while(i<j){
            maxArea = max(((j-i)*(min(height[i],height[j]))),maxArea)
            if(height[i]<height[j]){
                i++
            }else{
                j--
            }
        }
        return maxArea
    }
}
