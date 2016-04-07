/**
 * Class name: Main
 * Class description: Main class of program. 
 */

package ybe4;

import ybe4.game.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe t = TicTacToe.getInstance();
        t.initBoard();
        t.printBoard();
    }
}
