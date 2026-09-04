class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var rowSize = matrix.size
        var columnSize = matrix[0].size
        for(r in 0..rowSize-1){
            if(target>matrix[r][columnSize-1])continue
            else {
                var s = 0
                var e = columnSize-1
                while(s<=e){
                    var m =  s+(e-s)/2
                    if(matrix[r][m]<target){
                        s = m+1
                    }else if(matrix[r][m]>target){
                        e = m-1
                    }else{
                        return true
                    }
                }
            }
        }
        return false
    }
}
