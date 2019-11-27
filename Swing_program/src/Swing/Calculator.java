package Swing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
double num1;
double num2;
double result;
String ans;
String op;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 372, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton.getText();
				textField.setText(number);
			}
		});
		btnNewButton.setBounds(34, 90, 49, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_1.setBounds(34, 124, 49, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_2.setBounds(115, 90, 49, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3.setBounds(196, 90, 49, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_4.setBounds(115, 124, 49, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_5.setBounds(196, 124, 49, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_6.setBounds(34, 158, 49, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_7.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_7.setBounds(115, 158, 49, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_8.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_8.getText();
				textField.setText(number);
			}
		});
		btnNewButton_8.setBounds(196, 158, 49, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_9.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_9.getText();
				textField.setText(number);
			}
		});
		btnNewButton_9.setBounds(34, 192, 52, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_10.getText();
				textField.setText(number);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_10.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_10.setBounds(115, 192, 49, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
			}
		});
		btnNewButton_11.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_11.setBounds(196, 192, 49, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_12.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_12.setBounds(272, 88, 73, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		btnNewButton_13.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_13.setBounds(272, 122, 73, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		btnNewButton_14.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_14.setBounds(272, 158, 73, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		btnNewButton_15.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_15.setBounds(272, 190, 73, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("C");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnNewButton_16.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_16.setBounds(34, 226, 49, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("B");
		btnNewButton_17.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_17.setBounds(115, 228, 50, 23);
		frame.getContentPane().add(btnNewButton_17);;
		
		JButton btnNewButton_18 = new JButton("00");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_18.getText();
				textField.setText(number);
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_18.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_18.setBounds(196, 228, 49, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("%");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_19.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_19.setBounds(272, 228, 73, 23);
		frame.getContentPane().add(btnNewButton_19);
	}

}
