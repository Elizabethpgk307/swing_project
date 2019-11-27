package Swing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class Sample {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login page");
		frame.getContentPane().setBackground(new Color(255, 250, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tunga", Font.BOLD, 12));
		txtUsername.setBackground(Color.WHITE);
		txtUsername.setForeground(Color.BLACK);
		txtUsername.setText("Username");
		txtUsername.setBounds(129, 44, 119, 19);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBounds(23, 43, 81, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(23, 93, 81, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnDfdx = new JButton("Sign In");
		btnDfdx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDfdx.setBounds(115, 147, 89, 27);
		frame.getContentPane().add(btnDfdx);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(226, 147, 89, 27);
		frame.getContentPane().add(btnSignUp);
		
		JCheckBox chckbxRemember = new JCheckBox("remember");
		chckbxRemember.setBackground(new Color(255, 250, 240));
		chckbxRemember.setBounds(124, 117, 97, 23);
		frame.getContentPane().add(chckbxRemember);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("password");
		pwdPassword.setBounds(126, 93, 122, 19);
		frame.getContentPane().add(pwdPassword);
	}
}
