package ybe4.threads;

import ybe4.game.TicTacToe;

public class DiagonalWinnerThread extends WinnerThread implements Runnable {
    private TicTacToe t;

    public DiagonalWinnerThread(TicTacToe t) {
        super(t);
    }

    @Override
    public void run() {
        char winner;
        if ((winner = this.t.getDiagonalWinner()) != ' ') {
            System.out.println(winner + " wins!");
        }
    }
}
