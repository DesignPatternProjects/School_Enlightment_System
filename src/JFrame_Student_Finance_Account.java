package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrame_Student_Finance_Account extends JFrame {

		private JPanel contentPane;
		private String username;
		

	public JFrame_Student_Finance_Account(String username) {
		setTitle("Settings");
		this.username=username;
	   	initComponents();
		}
	public String getUsername() {
			return username;
		}
	/*public void run() {
		try {
				JFrame_StudentDashboard frame = new JFrame_StudentDashboard(username);
					//frame.setVisible(true);
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		}
	*/
	public void initComponents() {

		/**
		 * Create the frame.
		 */
		
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Finance Window");
			lblNewLabel.setBounds(127, 69, 150, 25);
			contentPane.add(lblNewLabel);
			
			
		}
	}
