class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i =0;i<9;i++){
            unordered_set<char> row, col, box;
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(row.count(board[i][j])){
                        return false;
                    }
                    row.insert(board[i][j]);
                }
                if(board[j][i]!='.'){
                    if(col.count(board[j][i])){
                        return false;
                    }
                    col.insert(board[j][i]);
                }
                int rowIdx = 3*(i/3) + j/3;
                int colIdx = 3*(i%3) + j%3;
                if(board[rowIdx][colIdx]!='.'){
                    if(box.count(board[rowIdx][colIdx])){
                        return false;
                    }
                    box.insert(board[rowIdx][colIdx]);
                }
            }

        }
        return true;
    }
};
