package ybe4.listeners;

import ybe4.game.TicTacToe;
import ybe4.threads.GetWinnerThread;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GameOnClickListener implements ActionListener{
    private final int row, col;
    private TicTacToe t;

    public GameOnClickListener(int row, int col, TicTacToe t) {
        this.row = row;
        this.col = col;
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setPosition(row, col, (JButton) e.getSource());
        new Thread(new GetWinnerThread(t)).start();
    }
}
