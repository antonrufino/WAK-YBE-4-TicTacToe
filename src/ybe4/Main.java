/**
 * Class name: Main
 * Class description: Main class of program.
 */

package ybe4;

import java.awt.*;
import javax.swing.*;

public class Main{
	private JFrame frame;

	public static void main(String[] args){
		new Main();
	}

	public Main(){
		//**JFRAME CONSTRUCTOR
		this.frame = new JFrame("Tic-tac-toe");

		this.frame.add(addComponents());
		this.frame.pack();

		//set window size to 500X300
		this.frame.setSize(500, 300);
		//make program exit when window is closed
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//show the frame
		this.frame.setVisible(true);
	}

	private JPanel addComponents(){
		JPanel panel = new JPanel();
		JLabel top = new JLabel("Turn #: Name (Player #)", SwingConstants.CENTER);

		panel.setLayout(new BorderLayout(20,20));
		panel.add(top, BorderLayout.NORTH);
		panel.add(new JLabel("Joshua (P1): 2Game 3 out of 5 Mark(P2): 1", SwingConstants.CENTER), BorderLayout.SOUTH);
		panel.add(gridPanel(), BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createEmptyBorder(20,100,20,100));

		return panel;
	}

	private JPanel gridPanel(){
		JPanel gridPanel = new JPanel();
		GridLayout grid = new GridLayout(3,3,5,5);
		gridPanel.setLayout(grid);

		for (int i=0; i<9; i++){
			gridPanel.add(new Button(""));
		}
		return gridPanel;
	}
}
