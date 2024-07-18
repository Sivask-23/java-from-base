// print all solutions were queens are safe in n x n chess board

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static List<List<String>> solution(int n){
        List<List<String>> allBoard=new ArrayList<>(); // List of list to store solution [[q1,q2,q3,q4],[q1,q2,q3,q4]]
        char[][] board=new char[n][n]; // creates chess board
        backtrackHelper(board,allBoard,0); // we are checking by placing queens column wise and call by passing first column that is 0th column
        return allBoard;
    }

    public static void backtrackHelper(char[][] board,List<List<String>> allBoard, int col){ // function to do backtracking
        if (col==board.length){
            saveBoard(board,allBoard);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row,col,board)){ // if it's safe to place then we call next column to place queen in next column
                board[row][col]='Q';
                backtrackHelper(board,allBoard,col+1);
                board[row][col]='.'; // if it's not safe after checking all possible placement whenever an unsafe solution encounter then it will backtrack, and we will mark this position as unsafe
            }
        }
    }

    public static boolean isSafe(int row,int col,char[][] board){
//        checking horizontally safe
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]=='Q'){
                return false;
            }
        }
//        checking vertically
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col]=='Q'){
                return false;
            }
        }
//        upper left
        int r=row;
        for (int c = col; c>=0 && r>=0 ; c--,r--) {
            if (board[r][c]=='Q'){
                return false;
            }
        }

//        upper right
        r=row;
        for (int c = col; r>=0 && c<board.length ; c++,r--) {
            if (board[r][c]=='Q'){
                return false;
            }
        }

//        lower left
        r=row;
        for (int c = col; c>=0 && r<board.length ; r++,c--) {
            if (board[r][c]=='Q'){
                return false;
            }
        }

//        lower right
        r=row;
        for (int c = col; r<board.length && c<board.length ; c++,r++) {
            if (board[r][c]=='Q'){
                return false;
            }
        }

        return true;

    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        String row ="";
        List<String> newBoard=new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row="";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]=='Q'){
                    row+='Q';
                }
                else {
                    row+='-';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);

    }

    public static void main(String[] args) {

        System.out.println(solution(4));

    }
}
