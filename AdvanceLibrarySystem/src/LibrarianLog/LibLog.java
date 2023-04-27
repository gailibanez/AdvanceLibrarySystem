package LibrarianLog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Welcome.Welc;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibLog {

	private JFrame frame;
	private JTextField textUser;
	private JPasswordField passwordField;
	protected int i;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibLog window = new LibLog();
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
	public LibLog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setBounds(78, 58, 73, 14);
		frame.getContentPane().add(lblUser);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(78, 97, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textUser = new JTextField();
		textUser.setBounds(181, 55, 120, 20);
		frame.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 94, 120, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("deprecation")
				String getpassword = passwordField.getText();
				String getusername = textUser.getText();
				String AdminUsername[] = {"Librarian_01","Librarian_02", "Librarian_03"};
				String AdminPass[] = {"LibrarianOne","LibrarianTwo", "LibrarianThree"};
				
				for (int i=0; i <AdminUsername.length; i++);
				{
				if (getusername.equals(AdminUsername[i]) && getpassword.equals(AdminPass[i])) {
					JOptionPane.showMessageDialog (null, "Login Successful", "Login", JOptionPane.INFORMATION_MESSAGE);
					passwordField.setText(null);
					textUser.setText(null);
					
				Welc w = new Welc();
				Welc welc = new Welc();
				welc.main(null);
				w.main(null);
					
				} else {
						JOptionPane.showMessageDialog(null, "Invalid username or password", "Login error", JOptionPane.ERROR_MESSAGE);
						passwordField.setText(null);
						textUser.setText(null);
				}
			}
			}
		});
		btnNewButton.setBounds(168, 151, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
