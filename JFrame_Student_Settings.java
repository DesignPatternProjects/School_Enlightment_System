package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JMenuItem;
import java.awt.Component;

public class JFrame_Student_Settings extends JFrame {

	private JPanel contentPane;
	private String username;

	

public JFrame_Student_Settings(String username) {
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
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 511, 322);
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenuItem mntmNewMenuItem = new JMenuItem("Password_Change");
	mntmNewMenuItem.setAlignmentX(Component.LEFT_ALIGNMENT);
	mntmNewMenuItem.setPreferredSize(new Dimension(230, 24));
	menuBar.add(mntmNewMenuItem);
	
	JMenuItem mntmNewMenuItem_1 = new JMenuItem("Help");
	menuBar.add(mntmNewMenuItem_1);
	
	JMenuItem mntmNewMenuItem_2 = new JMenuItem("About");
	menuBar.add(mntmNewMenuItem_2);
	
	JMenuItem mntmNewMenuItem_3 = new JMenuItem("Notifications");
	menuBar.add(mntmNewMenuItem_3);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	
	JButton btnNewButton = new JButton("Change Password");
	btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
	btnNewButton.setForeground(new Color(0, 0, 255));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ChangePassword pwd=new ChangePassword(username);
			pwd.setVisible(true);
		}
	});
	btnNewButton.setBounds(46, 38, 170, 35);
	contentPane.add(btnNewButton);
	
	
}
}
