class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var rows = Array(9){mutableSetOf<Char>()}
        var columns = Array(9){mutableSetOf<Char>()}
        var boxes = Array(9){mutableSetOf<Char>()}

        for(i in board.indices){
            for(j in board.indices){
                var num = board[i][j]
                if(board[i][j]=='.')continue
                
                var box = i/3*3+j/3

                if(num in rows[i] || num in columns[j] || num in boxes[box]){
                    return false
                }
                rows[i].add(num)
                columns[j].add(num)
                boxes[box].add(num)
            }
        }
        return true
    }
}
