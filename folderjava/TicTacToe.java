import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    // Initialize the board with empty spaces
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current board state
    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Switch player turns
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Place the player's move on the board
    public boolean placeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    // Check for a win or draw
    public char checkWinner() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0]; // Winner found in row
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i]; // Winner found in column
            }
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0]; // Winner found in diagonal (top-left to bottom-right)
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2]; // Winner found in diagonal (top-right to bottom-left)
        }

        // Check for draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return ' '; // Game still ongoing
                }
            }
        }
        return 'D'; // Draw
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        char winner = ' ';

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O");
        System.out.println("Let's begin!");

        while (winner == ' ') {
            game.printBoard();
            int row, col;
            do {
                System.out.println("Player " + game.currentPlayer + ", enter your move (row[1-3] column[1-3]): ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } while (!game.placeMove(row, col));
            game.switchPlayer();
            winner = game.checkWinner();
        }

        game.printBoard();
        if (winner == 'D') {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Player " + winner + " wins!");
        }
        scanner.close();
    }
}
