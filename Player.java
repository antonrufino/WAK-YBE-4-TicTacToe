import java.awt.*;
import javax.swing.*;

public class Player{
	private JFrame frame;

	public static void main(String[] args){
		new Player();
	}

	public Player(){
		this.frame = new JFrame("Tic-Tac-Toe");

		//adds component to the frame
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
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		JLabel player1 = new JLabel("Player 1 name: ");
		JLabel player2 = new JLabel("Player 2 name: ");
		JTextField name1 = new JTextField();
		JTextField name2 = new JTextField();
		JLabel best = new JLabel("Best of: ");
		JTextField bestof = new JTextField();
		JButton ok = new JButton("Ok");
		JButton cancel = new JButton("Cancel");

		panel.setLayout(gridbag);
		panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		
		//**PLAYER1

		gbc.fill = GridBagConstraints.BOTH;
		panel.add(player1);
		gridbag.setConstraints(player1, gbc);

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		panel.add(name1);
		gridbag.setConstraints(name1, gbc);
		
		//**PLAYER2

		gbc.fill = GridBagConstraints.BOTH;
		panel.add(player2);
		gridbag.setConstraints(player2, gbc);

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		panel.add(name2);
		gridbag.setConstraints(name2, gbc);

		//**BEST OF

		gbc.fill = GridBagConstraints.BOTH;
		panel.add(best);
		gridbag.setConstraints(best, gbc);
		gbc.weightx = 2.0;

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		panel.add(bestof);
		gridbag.setConstraints(bestof, gbc);
		
		//BUTTONS

		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 2.0;
		gbc.gridwidth = 2;                
        gbc.gridheight = 1;

        panel.add(new JLabel(""));

		panel.add(ok);
		gridbag.setConstraints(ok, gbc);

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		panel.add(cancel);
		gridbag.setConstraints(cancel, gbc);

		return panel;
	}
}