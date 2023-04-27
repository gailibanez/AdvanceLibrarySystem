package Admin_Lib;

import java.awt.EventQueue;

import javax.swing.JFrame;

import AdminLogin.AdminLog;
import Welcome.Welc;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLib {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLib window = new AdminLib();
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
	public AdminLib() {
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
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				AdminLog Al = new AdminLog();
				AdminLog.main(null);
				Al.main(null);
			}
		});
		btnAdminLogin.setBounds(152, 63, 117, 40);
		frame.getContentPane().add(btnAdminLogin);
		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setBounds(152, 131, 117, 42);
		frame.getContentPane().add(btnLibrarianLogin);
	}
}
