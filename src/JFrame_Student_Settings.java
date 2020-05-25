package src;
import javax.swing.JFileChooser;
import java.io.File;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrame_Student_Settings extends JFrame {

	private JPanel contentPane;
	private String username;
	private static JTextArea jTextArea;
	

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
	
	JMenu menu_password_settings = new JMenu("Password Settings");
	menuBar.add(menu_password_settings);
	
	JMenuItem menu_item_changepassword = new JMenuItem("Change Password");
	menu_item_changepassword.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mousePressed(MouseEvent e) {
			JFrame_ChangePassword pwd=new JFrame_ChangePassword(username);
			pwd.setVisible(true);
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			setColor(menu_item_changepassword);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			resetColor(menu_item_changepassword);
		}
	});
	menu_password_settings.add(menu_item_changepassword);
	
	JMenu menu_profile_settings = new JMenu("Profile Settings");
	menuBar.add(menu_profile_settings);
	
	JMenuItem menu_item_delete_profile = new JMenuItem("Delete Profile");
	menu_profile_settings.add(menu_item_delete_profile);
	menu_item_delete_profile.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mousePressed(MouseEvent e) {
			JFrame_Delete_Profile delete_frame = new JFrame_Delete_Profile(username);
			delete_frame.deleteData();
			delete_frame.setVisible(true);
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			setColor(menu_item_changepassword);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			resetColor(menu_item_changepassword);
		}
	});
	
	JMenu menu_help = new JMenu("Help");
	
	//jTextArea=new JTextArea();
	/*menu_help.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(java.awt.event.MouseEvent evt) {
			JFrame_FileOpener my_file_object = new JFrame_FileOpener();
			
			//frame.setSize(1000, 1000);
			//FileOpenerClass my_file_object=new FileOpenerClass();
			try {
				my_file_object.pick_me();
				my_file_object.setVisible(true);

			}
			catch(Exception e) {
				e.printStackTrace();				
			}
			jTextArea.setText(my_file_object.sb.toString()); 
			
		}
	});*/
	menuBar.add(menu_help);
	
	JMenu menu_conact_us = new JMenu("Contact Us");
	menuBar.add(menu_conact_us);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
}
	
	public void setColor(JMenuItem menuitem) {
		menuitem.setBackground(new java.awt.Color(197,197,197));
	}
	public void resetColor(JMenuItem menuitem) {
		menuitem.setBackground(new java.awt.Color(240,240,240));
	}
	

}
