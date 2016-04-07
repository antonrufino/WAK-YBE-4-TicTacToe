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
                board[i][j] = ' ';
    }

    public void printBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
