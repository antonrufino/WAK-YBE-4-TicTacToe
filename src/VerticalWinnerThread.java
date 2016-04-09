package ybe4.threads;

import ybe4.game.TicTacToe;

public class VerticalWinnerThread extends WinnerThread implements Runnable {
    public VerticalWinnerThread(TicTacToe t) {
        super(t);
    }

    @Override
    public void run() {
        char winner;
        if ((winner = this.t.getVerticalWinner()) != ' ') {
            System.out.println(winner + "wins!");
        }
    }
}
