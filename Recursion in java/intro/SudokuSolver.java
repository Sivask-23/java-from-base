public class SudokuSolver {
    static boolean isSafe(int[][] board, int row, int col, int num) {
//        checking col wise
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

//        checking row wise
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

//        checking grid wise

        int startrow = (row / 3) * 3;
        int startingcol = (col / 3) * 3;
        for (int i = startrow; i < startrow+3 ; i++) {
            for (int j = startingcol; j < startingcol+3; j++) {
                if (board[i][j]==num){
                    return false;
                }
            }
        }
    return true;
    }

    static boolean solveBoard(int[][]board){

        int row=-1;
        int col=-1;
        boolean empty=true;

//        find missing row and col and replace argument
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]==0){
                   row=i;
                   col=j;
                   empty=false;
                   break;
                }
            }
            if (empty==false){
                break;
            }
        }
        if (empty){
            return true;
        }

//        add number to obtained row and col
        for (int i = 1; i <=9 ; i++) {
            if (isSafe(board,row,col,i)){
                board[row][col]=i;
                if (solveBoard(board)){
                    return true;
                }else {
                    board[row][col]=0; // backtracking
                }
            }
        }

        return false;// sudoku cannot be able to solve

    }

    public static void main(String[] args) {

        System.out.println((char) (1 + '0'));

        int[][] board= {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        System.out.println("Can the sudoku board solvable ? "+solveBoard(board));
        if (solveBoard(board)){
            for (int [] row :board){
                for (int col:row){
                    System.out.print(col+" ");
                }
                System.out.println();
            }
        }
    }
}
