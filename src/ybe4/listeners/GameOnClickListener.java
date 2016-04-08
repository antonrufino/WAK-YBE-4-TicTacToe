package ybe4.listeners;

import ybe4.game.TicTacToe;
import ybe4.threads.*;

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
        new Thread(new HorizontalWinnerThread(t)).start();
        new Thread(new VerticalWinnerThread(t)).start();
        new Thread(new DiagonalWinnerThread(t)).start();
    }
}
