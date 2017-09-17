package groupProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public login() {
		initialize();
		content();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 429);
		frame.setForeground(new Color(157, 215, 242));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	}
	
	public void content()
	{
		titleJLabel();
		newUserButton();
		returnUserButton();
	}
	
	public void titleJLabel()
	{
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setBounds(232, 40, 107, 94);
		titleLabel.setFont(new Font("Verdana", Font.BOLD, 35));
		titleLabel.setBackground(Color.blue);
		frame.getContentPane().add(titleLabel);
	}
	
	public void newUserButton()
	{
		JButton btnNewUser = new JButton("New User");
		btnNewUser.setFont(new Font("Verdana", Font.BOLD, 15));
		btnNewUser.setBounds(59, 234, 211, 94);
		btnNewUser.setBackground(Color.blue);
		btnNewUser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//creates menu window sets it to visible and sets the location and size of the menu window
				newUser menu1 = new newUser();
				menu1.setVisible(true);
				menu1.setLocation(400, 250);
				menu1.setSize(673, 705);
			}
		});
		frame.getContentPane().add(btnNewUser);
	}
	
	public void returnUserButton()
	{
		JButton btnReturningUser = new JButton("Returning User");
		btnReturningUser.setFont(new Font("Verdana", Font.BOLD, 15));
		btnReturningUser.setBounds(303, 234, 211, 94);
		btnReturningUser.setBackground(Color.blue);
		btnReturningUser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//creates menu window sets it to visible and sets the location and size of the menu window
				signIn signInScreen = new signIn();
				signInScreen.setVisible(true);
				signInScreen.setLocation(400, 250);
				signInScreen.setSize(673, 705);
			}
		});
		frame.getContentPane().add(btnReturningUser);
	}
}
