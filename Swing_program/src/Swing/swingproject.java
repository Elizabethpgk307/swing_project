package Swing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class swingproject {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingproject window = new swingproject();
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
	public swingproject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(139, 69, 19));
		frame.getContentPane().setForeground(new Color(255, 215, 0));
		

		JButton btnNewButton = new JButton(new ImageIcon("C:\\Users\\FACE-3\\Downloads/logo.png"));
		btnNewButton.setBounds(10, 11, 234, 185);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setForeground(new Color(139, 69, 19));
		btnHome.setFont(new Font("Jokerman", Font.BOLD, 25));
		btnHome.setBounds(10, 227, 159, 28);
		frame.getContentPane().add(btnHome);
		
		JButton btnItems = new JButton("ITEMS");
		btnItems.setForeground(new Color(139, 0, 0));
		btnItems.setFont(new Font("Jokerman", Font.BOLD, 25));
		btnItems.setBackground(new Color(255, 255, 255));
		btnItems.setBounds(162, 227, 148, 28);
		frame.getContentPane().add(btnItems);
		
		JButton btnGallary = new JButton("GALLARY");
		btnGallary.setForeground(new Color(139, 69, 19));
		btnGallary.setFont(new Font("Old English Text MT", Font.BOLD, 25));
		btnGallary.setBackground(new Color(255, 255, 255));
		btnGallary.setBounds(310, 228, 203, 28);
		frame.getContentPane().add(btnGallary);
		
		JButton btnContact = new JButton("CONTACT");
		btnContact.setForeground(new Color(139, 69, 19));
		btnContact.setFont(new Font("Jokerman", Font.BOLD, 25));
		btnContact.setBackground(new Color(255, 255, 255));
		btnContact.setBounds(506, 227, 188, 28);
		frame.getContentPane().add(btnContact);
		
		JButton btnHistory = new JButton("HISTORY");
		btnHistory.setForeground(new Color(139, 69, 19));
		btnHistory.setFont(new Font("Jokerman", Font.BOLD, 25));
		btnHistory.setBackground(new Color(255, 255, 255));
		btnHistory.setBounds(691, 227, 171, 28);
		frame.getContentPane().add(btnHistory);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(254, 11, 736, 185);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(488, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("C:\\Users\\FACE-3\\Downloads/logo.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(198, 112, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnOffers = new JButton("OFFERS");
		btnOffers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOffers.setForeground(new Color(139, 69, 19));
		btnOffers.setFont(new Font("Jokerman", Font.BOLD, 25));
		btnOffers.setBackground(Color.WHITE);
		btnOffers.setBounds(857, 227, 133, 28);
		frame.getContentPane().add(btnOffers);
		
		textField_1 = new JTextField();
		textField_1.setBounds(691, 199, 171, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setForeground(new Color(75, 0, 130));
		btnSearch.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(857, 199, 133, 28);
		frame.getContentPane().add(btnSearch);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("C:\\Users\\user\\Downloads/2.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 266, 234, 178);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(new ImageIcon("C:\\Users\\user\\Downloads/3.jpg"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(257, 266, 273, 178);
		frame.getContentPane().add(btnNewButton_3);
		frame.setForeground(UIManager.getColor("Button.foreground"));
		frame.setBounds(100, 100, 1003, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
