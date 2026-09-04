class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var s = 0
        var e = nums.size-1
        while(s<=e){
            var m = s+(e-s)/2
            if(nums[m]<target){
                s=m+1
            }else if(nums[m]>target){
                e=m-1
            }else return m
        }
        return -1
    }
}
