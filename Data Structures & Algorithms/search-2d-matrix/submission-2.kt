class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var r = 0
        var c = matrix[0].size - 1

        while (r < matrix.size && c >= 0) {
            when {
                matrix[r][c] > target -> c--
                matrix[r][c] < target -> r++
                else -> return true
            }
        }

        return false
    }
}