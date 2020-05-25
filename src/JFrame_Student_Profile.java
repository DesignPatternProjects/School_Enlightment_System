package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame_Student_Profile extends JFrame {
	//private JPanel contentPane;	
	private String username;
	private JTextField first_name_textField;
	private JTextField last_name_textField;
	private JTextField student_id_textField;
	private JTextField contact_number_textField;
	private JTextField birthdate_textField;
	private JTextField adddress_textField;
	private JTextField email_textField;
	
public JFrame_Student_Profile(String username) {
	getContentPane().setBackground(new Color(51, 102, 204));
		
        this.username=username;
       	initComponents();
    }
public String getUsername() {
			return username;
		}
	
   private void initComponents() {
		    	
		setTitle("User Profile");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images\\list_64px.png"));
		getContentPane().setLayout(null);
        setBounds(100, 100, 560, 618);
        
        JLabel fisrt_name_label = new JLabel("First Name");
        fisrt_name_label.setForeground(new Color(0, 0, 0));
        fisrt_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        fisrt_name_label.setBounds(35, 60, 100, 24);
        getContentPane().add(fisrt_name_label);
        
        first_name_textField = new JTextField();
        first_name_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        first_name_textField.setBounds(190, 60, 200, 27);
        getContentPane().add(first_name_textField);
        first_name_textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Profile");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        lblNewLabel.setBounds(165, 10, 100, 25);
        getContentPane().add(lblNewLabel);
        
        JLabel last_name_label = new JLabel("Last Name");
        last_name_label.setForeground(new Color(0, 0, 0));
        last_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        last_name_label.setBounds(35, 110, 100, 24);
        getContentPane().add(last_name_label);
        
        JLabel studentid_label = new JLabel("Student_id");
        studentid_label.setForeground(new Color(0, 0, 0));
        studentid_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        studentid_label.setBounds(35, 160, 100, 24);
        getContentPane().add(studentid_label);
        
        JLabel contact_number_label = new JLabel("Contact Number");
        contact_number_label.setForeground(new Color(0, 0, 0));
        contact_number_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        contact_number_label.setBounds(35, 210, 130, 24);
        getContentPane().add(contact_number_label);
        
        JLabel birthdate_label = new JLabel("Birthdate");
        birthdate_label.setForeground(new Color(0, 0, 0));
        birthdate_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        birthdate_label.setBounds(35, 260, 130, 24);
        getContentPane().add(birthdate_label);
        
        JLabel email_label = new JLabel("Email");
        email_label.setForeground(new Color(0, 0, 0));
        email_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        email_label.setBounds(35, 310, 130, 24);
        getContentPane().add(email_label);
        
        last_name_textField = new JTextField();
        last_name_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        last_name_textField.setColumns(10);
        last_name_textField.setBounds(190, 110, 200, 27);
        getContentPane().add(last_name_textField);
        
        student_id_textField = new JTextField();
        student_id_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        student_id_textField.setColumns(10);
        student_id_textField.setBounds(190, 160, 200, 27);
        getContentPane().add(student_id_textField);
        
        contact_number_textField = new JTextField();
        contact_number_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        contact_number_textField.setColumns(10);
        contact_number_textField.setBounds(190, 210, 200, 27);
        getContentPane().add(contact_number_textField);
        
        birthdate_textField = new JTextField();
        birthdate_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        birthdate_textField.setColumns(10);
        birthdate_textField.setBounds(190, 260, 200, 27);
        getContentPane().add(birthdate_textField);
        
        adddress_textField = new JTextField();
        adddress_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        adddress_textField.setColumns(10);
        adddress_textField.setBounds(190, 370, 200, 100);
        getContentPane().add(adddress_textField);
        
        email_textField = new JTextField();
        email_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        email_textField.setColumns(10);
        email_textField.setBounds(190, 310, 200, 27);
        getContentPane().add(email_textField);
        
        JLabel adddress_label = new JLabel("Address");
        adddress_label.setForeground(new Color(0, 0, 0));
        adddress_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        adddress_label.setBounds(35, 370, 130, 24);
        getContentPane().add(adddress_label);
        
        JButton btnNewButton = new JButton("Close");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBounds(35, 508, 97, 30);
        getContentPane().add(btnNewButton);
        
        JButton btnUpdateProfile = new JButton("Update Profile");
        btnUpdateProfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFrame_UpdateProfile update_profile=new JFrame_UpdateProfile(username);
        		update_profile.writeData();
        		update_profile.updateData();
        		update_profile.setVisible(true);
        	}
        });
        btnUpdateProfile.setForeground(Color.BLACK);
        btnUpdateProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnUpdateProfile.setBounds(212, 508, 178, 30);
        getContentPane().add(btnUpdateProfile);
        
    }

  
	
public void showData(String username) {
		    String name=username;
		    try {
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
			PreparedStatement ps = conn.prepareStatement("select * from user_data where user_name=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	first_name_textField.setText(rs.getString(4));
            	last_name_textField.setText(rs.getString(6));
            	email_textField.setText(rs.getString(7));
            	student_id_textField.setText(rs.getString(10));
            	contact_number_textField.setText(rs.getString(8));
            	birthdate_textField.setText(rs.getString(9));
            	adddress_textField.setText(rs.getString(5));
            	
          		      }
		    }
		catch(Exception e) {
			
		}
}
}