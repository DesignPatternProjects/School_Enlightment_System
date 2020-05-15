import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class JFrame_Student extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_Student frame = new JFrame_Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame_Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Student_label = new JLabel("STUDENT");
		Student_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Student_label.setBounds(156, 99, 90, 23);
		contentPane.add(Student_label);
	}

	public JFrame_Student(String username_input) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Student_label = new JLabel("STUDENT");
		Student_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Student_label.setBounds(156, 99, 300, 23);
		contentPane.add(Student_label);
		Student_label.setText("Welcome to the learning hub " +username_input);
	}
	
	
}
