class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        for(i in matrix.indices){
            var row = matrix[i]
            if(binarySearch(row,target))return true 
        }
        return false

    }
    fun binarySearch(arr:IntArray,target:Int):Boolean{
        var start =0
        var end = arr.size-1
        while(start<=end){
            var mid = (start+end)/2
            var midEle = arr[mid]
            if(midEle==target)return true
            else if(midEle<target)start=mid+1
            else end = mid-1
        }
        return false
    }
}
