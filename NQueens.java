package Backtracking;

public class NQueens {
   
    // Backtracking function to solve the N Queens problem
    public static void solveNQueens(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            // Print the board
            printBoard(board);
            return;
        }

        // Try placing queen in each row in the current column
        for (int j = 0; j < n; j++) {
            // Check if it is safe to place queen in this row and column
            if (isSafe(board, row, j)) {
                // Place queen on this cell
                board[row][j] = 'q';

                // Recur to place queens in the next column
                solveNQueens(board, row + 1);

                // Backtrack
                board[row][j] = 'x';
            }
        }
    }

    // Helper function to check if it is safe to place queen in this row and column
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // Check if there is any queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'q') {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'q') {
                return false;
            }
        }
        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'q') {
                return false;
            }
        }
        return true;
    }

    // Helper method to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Driver function to solve the N Queens problem and print the board
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        solveNQueens(board, 0);
    }
}
