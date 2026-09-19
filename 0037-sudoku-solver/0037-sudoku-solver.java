class Solution {
    boolean solved=false;
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    void solve(char[][]board){
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(check(board,r,c,ch)){
                            board[r][c]=ch;
                            solve(board);
                            if (solved) return;
                            board[r][c]='.';
                        }
                    }
                    return;
                }
            }
        }
        solved=true;
    }
    boolean check(char[][]board,int r,int c,char val){
        for(int i=0;i<9;i++){
            if(board[r][i]==val) return false;
            if(board[i][c]==val) return false;
            if(board[3*(r/3)+i/3][3*(c/3)+i%3]==val)return false;
        }
        return true;
    }
}