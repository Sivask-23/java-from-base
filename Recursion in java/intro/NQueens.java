import java.util.Arrays;

public class NQueens {
    static void placeNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row:board){
            Arrays.fill(row,'.');
        }
        helperFn(board, 0);
    }

    private static void helperFn(char[][] board, int col) {
        if (col == board.length) {
            display(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 'Q';
                helperFn(board, col + 1);
                board[i][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
//        horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

//       vertically

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

//        upper left
        int cl = col;
        for (int i = row; i >= 0 && cl >= 0; i--, cl--) {
            if (board[i][cl] == 'Q') {
                return false;
            }
        }
//        upper right
        int r = row;
        for (int i = col; i < board.length && r >= 0; i++, r--) {
            if (board[r][i] == 'Q') {
                return false;
            }
        }

//        lower left
        r = row;
        for (int i = col; r < board.length && i >= 0; i--, r++) {
            if (board[r][i] == 'Q') {
                return false;
            }
        }

//        lower right
        r = row;
        for (int i = col; i < board.length && r < board.length; i++, r++) {
            if (board[r][i] == 'Q') {
                return false;
            }
        }

        return true;

    }

    private static void display(char[][] board) {
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=4;
        placeNQueens(n);

    }
}
