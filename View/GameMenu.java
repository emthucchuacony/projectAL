package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GameMenu  extends JFrame{
	JLabel txtSnackGame;
	JPanel contentPane;
	JButton start, help, more, exit;
	public GameMenu() throws HeadlessException {
		init();
	}

	public void init() {
		this.setTitle("PONG GAME");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 555);
		this.setSize(700, 700);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(6, 6, 6,6));
		getContentPane().setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		start = new JButton("START");
		start.setForeground(new Color(255, 255, 255));
		start.setFont(new Font("Lucida Console", Font.PLAIN, 55));
		start.setBorder(new EmptyBorder(0, 0, 0, 0));
		start.setBackground(new Color(0, 0, 0));
		start.setBounds(252, 200, 194, 62);
		contentPane.add(start);

		more = new JButton("MORE");
		more.setFont(new Font("Lucida Console", Font.PLAIN, 55));
		more.setBackground(new Color(0, 0, 0));
		more.setForeground(new Color(255, 255, 255));
		more.setBorder(new EmptyBorder(0, 0, 0, 0));
		more.setBounds(252, 300, 194, 62);
		contentPane.add(more);

		help = new JButton("HELP");
		help.setForeground(new Color(255, 255, 255));
		help.setFont(new Font("Lucida Console", Font.PLAIN, 55));
		help.setBackground(new Color(0, 0, 0));
		help.setBorder(new EmptyBorder(0, 0, 0, 0));

		help.setBounds(252,400, 194, 62);
		contentPane.add(help);

		exit = new JButton("Exit");
		exit.setForeground(new Color(255, 255, 255));
		exit.setFont(new Font("Lucida Console", Font.PLAIN, 55));
		exit.setBackground(new Color(0, 0, 0));
		exit.setBorder(new EmptyBorder(0, 0, 0, 0));

		exit.setBounds(252, 500, 194, 62);
		contentPane.add(exit);

		txtSnackGame = new JLabel("SNACK GAME");
		txtSnackGame.setHorizontalAlignment(SwingConstants.CENTER);
		txtSnackGame.setFont(new Font("Lucida Console", Font.BOLD, 80));
		txtSnackGame.setForeground(Color.RED); 
		txtSnackGame.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtSnackGame.setBounds(62, 80, 537, 62);
		contentPane.add(txtSnackGame);
		
		
		
//		
		

		
	}
	
}
