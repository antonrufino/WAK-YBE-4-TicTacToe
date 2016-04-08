package ybe4.threads;

import ybe4.game.TicTacToe;

public class WinnerThread implements Runnable {
    private TicTacToe t;

    public WinnerThread(TicTacToe t) {
        this.t = t;
    }

    @Override
    public void run() {
        char winner;
        if ((winner = t.getWinner()) != ' ') {
            System.out.println(winner);
        }
    }
}
