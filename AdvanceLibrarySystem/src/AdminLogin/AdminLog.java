package AdminLogin;

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

public class AdminLog {

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
					AdminLog window = new AdminLog();
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
	public AdminLog() {
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
		lblUser.setBounds(77, 70, 97, 14);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(77, 112, 76, 14);
		frame.getContentPane().add(lblPass);
		
		textUser = new JTextField();
		textUser.setBounds(184, 67, 113, 20);
		frame.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 109, 113, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("deprecation")
				String getpassword = passwordField.getText();
				String getusername = textUser.getText();
				String AdminUsername[] = {"Admin_01","Admin_02", "Admin_03"};
				String AdminPass[] = {"AdminOne","AdminTwo", "AdminThree"};
				
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
		btnLogin.setBounds(164, 157, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
