package ybe4.threads;

import ybe4.game.TicTacToe;

public class GetWinnerThread implements Runnable {
    private TicTacToe t;

    public GetWinnerThread(TicTacToe t) {
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
