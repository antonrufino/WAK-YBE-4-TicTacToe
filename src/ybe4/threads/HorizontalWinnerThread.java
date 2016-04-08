package ybe4.threads;

import ybe4.game.TicTacToe;

public class HorizontalWinnerThread extends WinnerThread implements Runnable {
    public HorizontalWinnerThread(TicTacToe t) {
        super(t);
    }

    @Override
    public void run() {
        char winner;
        if ((winner = this.t.getHorizontalWinner()) != ' ') {
            System.out.println(winner + " wins!");
			
        }
    }
}
