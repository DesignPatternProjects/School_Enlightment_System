import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class JFrame_Teacher extends JFrame {

	private JPanel contentPane;
			public void run() {
				try {
					JFrame_Teacher frame = new JFrame_Teacher();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	/**
	 * Create the frame.
	 */
	public JFrame_Teacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel teacher_label = new JLabel("TEACHER");
		teacher_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		teacher_label.setBounds(169, 117, 90, 23);
		contentPane.add(teacher_label);
	}
	
	public JFrame_Teacher(String username_input) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel teacher_label = new JLabel("TEACHER");
		teacher_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		teacher_label.setBounds(169, 117, 300, 23);
		contentPane.add(teacher_label);
		teacher_label.setText("Welcome to the learning hub Prof." + username_input);
		
	}

}
