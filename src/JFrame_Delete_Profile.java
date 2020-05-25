package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class JFrame_Delete_Profile extends JFrame {

	private JPanel contentPane;
	private String username;
	private JButton btnYes;
	
public JFrame_Delete_Profile(String username) {
		setTitle("Profile Deletion");
		this.username=username;
	 	initComponents();
		}
public String getUsername() {
			return username;
		}
	
public void initComponents() {
			
		
		setBounds(100, 100, 380, 211);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnYes = new JButton("YES");
		btnYes.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnYes.setToolTipText("\r\nAction can not be undone.");
		btnYes.setBounds(84, 79, 100, 25);
		contentPane.add(btnYes);
		
		JLabel lblNewLabel = new JLabel("Are you sure?");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel.setBounds(127, 30, 152, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNo.setToolTipText("\r\nAction can not be undone.");
		btnNo.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnNo.setBounds(209, 79, 100, 25);
		contentPane.add(btnNo);
	}


public void deleteData() {
	
	btnYes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {  
		      
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
				PreparedStatement pst = (PreparedStatement) con.prepareStatement("DELETE FROM USER_DATA WHERE USER_NAME=?");

				pst.setString(1, username);
		
				int rs=pst.executeUpdate();
				if(rs == 1) {
				JOptionPane.showMessageDialog(null, "Profile is deleted."); 
				}
				con.close();  
		        
		    } catch (SQLException se) {  
		        JOptionPane.showMessageDialog(null,se);  
		    } 
		}
	});
	
}
}