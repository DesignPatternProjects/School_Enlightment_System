package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class JFrame_Student_Courses extends JFrame {

	private JPanel contentPane;
	private String username;
	

public JFrame_Student_Courses(String username) {
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
	
		setBounds(100, 100, 647, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Core Courses -");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 13, 130, 25);
		contentPane.add(lblNewLabel);
		
		JPanel maths_jpanel = new JPanel();
		maths_jpanel.setBounds(100, 60, 100, 100);
		contentPane.add(maths_jpanel);
		
		JPanel english_jpanel = new JPanel();
		english_jpanel.setBounds(250, 60, 100, 100);
		contentPane.add(english_jpanel);
		
		JPanel science_jpanel = new JPanel();
		science_jpanel.setBounds(400, 60, 100, 100);
		contentPane.add(science_jpanel);
		
		JLabel electives_jlabel = new JLabel("Electives -");
		electives_jlabel.setForeground(Color.BLUE);
		electives_jlabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		electives_jlabel.setBounds(12, 200, 130, 25);
		contentPane.add(electives_jlabel);
		
		JPanel electives_jpanel_1 = new JPanel();
		electives_jpanel_1.setBounds(100, 250, 100, 100);
		contentPane.add(electives_jpanel_1);
		
		JPanel electives_jpanel2 = new JPanel();
		electives_jpanel2.setBounds(250, 250, 100, 100);
		contentPane.add(electives_jpanel2);
		
		JPanel electives_jpanel_3 = new JPanel();
		electives_jpanel_3.setBounds(400, 250, 100, 100);
		contentPane.add(electives_jpanel_3);
		
		
	}
}
