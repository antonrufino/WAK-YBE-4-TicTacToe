/**
 * Class name: TicTacToe
 * Class description: This will handle game logic.
 */

package ybe4.game;

public class TicTacToe {
    private static TicTacToe instance = new TicTacToe();

    char[][] board = new char[3][3];

    private TicTacToe() { }

    public static TicTacToe getInstance() {
        return TicTacToe.instance;
    }

    public void initBoard() {
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < 3; ++j)
                board[i][j] = '-';
    }

    public void printBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void setPosition(int row, int col, char player) {
        if (this.board[row][col] == '-')
            this.board[row][col] = player;
    }

    public char getWinner() {
        for (int i = 0; i < 3; ++i) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                if (board[i][0] != '-') return board[i][0];
        }

        for (int i = 0; i < 3; ++i) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
                if (board[0][i] != '-') return board[0][i];
        }

        for (int i = 0; i < 3; ++i) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
                if (board[0][0] != '-') return board[0][0];
        }

        for (int i = 0; i < 3; ++i) {
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
                if (board[0][2] != '-') return board[0][2];
        }

        return ' ';
    }
}
