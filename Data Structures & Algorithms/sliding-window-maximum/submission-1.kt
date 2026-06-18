class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
      var window = ArrayDeque<Int>()
      var result = IntArray(nums.size-k+1)
      var idx = 0
      for(i in nums.indices){
        if(window.isNotEmpty()&& window.first()<=i-k){
            window.removeFirst()
        }
        while(window.isNotEmpty() && nums[window.last()]<nums[i]){
            window.removeLast()
        }
        window.addLast(i)
        if(i>=k-1){
            result[idx++]= nums[window.first()]
        }
      }
      return result
    }
}
