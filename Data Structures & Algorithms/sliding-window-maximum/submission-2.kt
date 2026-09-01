class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
            var deque = ArrayDeque<Int>()
            var ans = mutableListOf<Int>()
            for(right in nums.indices){
                while(deque.isNotEmpty() && deque.first()<=right-k){
                    deque.removeFirst()
                }
                while(deque.isNotEmpty() &&  nums[deque.last()]<=nums[right]){
                    deque.removeLast()
                }
                deque.addLast(right)
                if(right>=k-1){
                    ans.add(nums[deque.first()])
                }
            }
            return ans.toIntArray()
    }
}
