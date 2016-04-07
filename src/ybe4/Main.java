/**
 * Class name: Main
 * Class description: Main class of program.
 */

package ybe4;

import ybe4.game.TicTacToe;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static TicTacToe t;

    public static void main(String[] args) {
        char player = 'O';
        char winner = ' ';

        t = TicTacToe.getInstance();
        t.initBoard();

        while ((winner = t.getWinner()) == ' ') {
            actionMenu(player);
            t.printBoard();
            player = (player == 'O') ? 'X' : 'O';
        }

        System.out.println("Winner is " + winner);
    }

    private static void actionMenu(char player) {
        int row, col;

        System.out.print("row: ");
        row = scan.nextInt();

        System.out.print("col: ");
        col = scan.nextInt();

        t.setPosition(row, col, player);
    }
}
