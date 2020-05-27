package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;

public class JFrame_Student_Courses extends JFrame {

	private JPanel contentPane;
	private String username;
	private javax.swing.JPanel maths_jpanel, science_jpanel,history_jpanel;
	private String subjects;

public JFrame_Student_Courses(String username) {
	setTitle("Courses");
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
private void initComponents() {

	/**
	 * Create the frame.
	 */
	
	
		setBounds(100, 100, 647, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Core Courses -");
		lblNewLabel.setBackground(new Color(51, 102, 204));
		lblNewLabel.setForeground(new Color(51, 102, 204));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 13, 130, 25);
		contentPane.add(lblNewLabel);
		
		maths_jpanel = new JPanel();
		maths_jpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel1MouseClicked(evt);
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel1MouseEntered(evt);
			}
			

			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel1MouseExited(evt);
			}
		});
		maths_jpanel.setBackground(new Color(51, 102, 204));
		maths_jpanel.setBounds(100, 60, 100, 100);
		contentPane.add(maths_jpanel);
		maths_jpanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Maths");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(22, 0, 56, 22);
		maths_jpanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("Images\\icons8-math-96.png"));
		lblNewLabel_2.setBounds(2, 29, 87, 60);
		maths_jpanel.add(lblNewLabel_2);
		
		science_jpanel = new JPanel();
		science_jpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel2MouseClicked(evt);
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel2MouseEntered(evt);
			}
			

			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel2MouseExited(evt);
			}
		});
		science_jpanel.setBackground(new Color(51, 102, 204));
		science_jpanel.setBounds(250, 60, 100, 100);
		contentPane.add(science_jpanel);
		science_jpanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Science");
		lblNewLabel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_3.setBounds(21, 0, 57, 22);
		science_jpanel.add(lblNewLabel_3);
		
		history_jpanel = new JPanel();
		history_jpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel3MouseClicked(evt);
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel3MouseEntered(evt);
			}
			

			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel3MouseExited(evt);
			}
		});
		history_jpanel.setBackground(new Color(51, 102, 204));
		history_jpanel.setBounds(400, 60, 100, 100);
		contentPane.add(history_jpanel);
		history_jpanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("History");
		lblNewLabel_4.setBounds(21, 0, 57, 22);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		history_jpanel.add(lblNewLabel_4);
		
		JLabel electives_jlabel = new JLabel("Electives -");
		electives_jlabel.setForeground(new Color(51, 102, 204));
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

public void setColor(JPanel panel)
{
    panel.setBackground(new java.awt.Color(197, 197, 197));
}

public void resetColor(JPanel panel)
{
    panel.setBackground(new java.awt.Color(240,240,240));
}


private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {
	// TODO Auto-generated method stub
	setColor(maths_jpanel);
	
}
private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {
	// TODO Auto-generated method stub
	resetColor(maths_jpanel);
	
}	
private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {
	JFrame_Student_Courses_SubCourses courses = new JFrame_Student_Courses_SubCourses(username);
	courses.setVisible(true);
			
}
private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {
	// TODO Auto-generated method stub
	setColor(science_jpanel);
	
}
private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {
	// TODO Auto-generated method stub
	resetColor(science_jpanel);
	
}	
private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {
	JFrame_Student_Courses_SubCourses courses = new JFrame_Student_Courses_SubCourses(username);
	courses.setVisible(true);
			
}
private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {
	// TODO Auto-generated method stub
	setColor(history_jpanel);
	
}
private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {
	// TODO Auto-generated method stub
	resetColor(history_jpanel);
	
}	
private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {
	JFrame_Student_Courses_SubCourses courses = new JFrame_Student_Courses_SubCourses(username);
	courses.setVisible(true);
			
}
}
