package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JFrame_UpdateProfile extends JFrame {

	private JPanel contentPane;
	private JTextField username_textField;
	private JPasswordField password_textField;
	private JTextField loginas_textField;
	private JTextField first_name_textField;
	private JTextField last_name_textField;
	private JTextField email_textField;
	private JTextField contact_number_textField;
	private JTextField birthdate_textField;
	private JTextField address_textField;
	private JButton update_button;
	private JButton cancel_button;
	private String username;
  
    public JFrame_UpdateProfile(String username) {
        this.username=username;
    	initComponents();
    }

    public String getUsername() {
		return username;
	}
   
public void initComponents() {
		setForeground(new Color(176, 224, 230));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 595);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel username_label = new JLabel("User Name");
		username_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		username_label.setBounds(35, 50, 100, 25);
		contentPane.add(username_label);
		
		JLabel password_label = new JLabel("Password");
		password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		password_label.setBounds(35, 90, 100, 26);
		contentPane.add(password_label);
		
		JLabel loginas_label = new JLabel("Login As");
		loginas_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		loginas_label.setToolTipText("\r\nEnter TEACHER or STUDENT only.");
		loginas_label.setBounds(35, 130, 89, 26);
		contentPane.add(loginas_label);
		
		JLabel first_name_label = new JLabel("First Name");
		first_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		first_name_label.setBounds(35, 170, 100, 25);
		contentPane.add(first_name_label);
		
		JLabel last_name_label = new JLabel("Last Name");
		last_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		last_name_label.setBounds(35, 210, 100, 25);
		contentPane.add(last_name_label);
		
		JLabel email_label = new JLabel("Email");
		email_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		email_label.setBounds(35, 250, 100, 25);
		contentPane.add(email_label);
		
		JLabel contact_number_label = new JLabel("Contact Number");
		contact_number_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		contact_number_label.setBounds(35, 290, 130, 25);
		contentPane.add(contact_number_label);
		
		JLabel birthdate_label = new JLabel("Birthdate");
		birthdate_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		birthdate_label.setBounds(35, 330, 100, 25);
		contentPane.add(birthdate_label);
		
		JLabel address_label = new JLabel("Address");
		address_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		address_label.setBounds(35, 370, 100, 25);
		contentPane.add(address_label);
		
		username_textField = new JTextField();
		username_textField.setBounds(175, 50, 200, 25);
		contentPane.add(username_textField);
		username_textField.setColumns(10);
		
		password_textField = new JPasswordField();
		password_textField.setColumns(10);
		password_textField.setBounds(175, 90, 200, 25);
		contentPane.add(password_textField);
		
		loginas_textField = new JTextField();
		loginas_textField.setColumns(10);
		loginas_textField.setBounds(175, 130, 200, 25);
		contentPane.add(loginas_textField);
		
		first_name_textField = new JTextField();
		first_name_textField.setColumns(10);
		first_name_textField.setBounds(175, 170, 200, 25);
		contentPane.add(first_name_textField);
		
		last_name_textField = new JTextField();
		last_name_textField.setColumns(10);
		last_name_textField.setBounds(175, 210, 200, 25);
		contentPane.add(last_name_textField);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBounds(175, 250, 200, 25);
		contentPane.add(email_textField);
		
		contact_number_textField = new JTextField();
		contact_number_textField.setColumns(10);
		contact_number_textField.setBounds(175, 290, 200, 25);
		contentPane.add(contact_number_textField);
		
		birthdate_textField = new JTextField();
		birthdate_textField.setColumns(10);
		birthdate_textField.setBounds(175, 330, 200, 25);
		contentPane.add(birthdate_textField);
		
		address_textField = new JTextField();
		address_textField.setColumns(10);
		address_textField.setBounds(175, 370, 200, 100);
		contentPane.add(address_textField);
		
		update_button = new JButton("Update");
		update_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		update_button.setBounds(35, 505, 120, 30);
		contentPane.add(update_button);
		
		
		JLabel update_profile_label = new JLabel("Profile Updation");
		update_profile_label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		update_profile_label.setBounds(137, 7, 160, 30);
		contentPane.add(update_profile_label);
		
		cancel_button = new JButton("Cancel");
		cancel_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		cancel_button.setBounds(255, 505, 120, 30);
		contentPane.add(cancel_button);
}	
public void writeData() {
	try {  
		        //Class.forName("com.mysql.jdbc.Driver");  
		        // establish connection  
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
		        PreparedStatement pst = (PreparedStatement) con.prepareStatement("Select USER_NAME, PASSWORD, LOGIN_AS, FIRST_NAME, LAST_NAME, EMAIL, CONTACT_NUMBER, BIRTHDATE, ADDRESS from user_data where user_name=?");

				pst.setString(1, username);
				ResultSet rs=pst.executeQuery();
				if(rs.next()) { 
			        String ID = rs.getString("USER_NAME");
			        username_textField.setText(ID);
			        String PS = rs.getString("PASSWORD");
			        password_textField.setText(PS);
			        String LA = rs.getString("LOGIN_AS");
			        loginas_textField.setText(LA);
			        String FN = rs.getString("FIRST_NAME");
			        first_name_textField.setText(FN);
			        String LN = rs.getString("LAST_NAME");
			        last_name_textField.setText(LN);
			        String EM = rs.getString("EMAIL");
			        email_textField.setText(EM);
			        String CN = rs.getString("CONTACT_NUMBER");
			        contact_number_textField.setText(CN);
			        String BD = rs.getString("BIRTHDATE");
			        birthdate_textField.setText(BD);
			        String AD = rs.getString("ADDRESS");
			        address_textField.setText(AD);
			        
			       
			     
				}
				
				con.close();
		    } catch (SQLException e) {  
		        JOptionPane.showMessageDialog(null, e);  
		    }  
	}
public void updateData() {
	update_button.addActionListener(new ActionListener() {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent arg0) {
			try {  
		       // Class.forName("com.mysql.jdbc.Driver");  
		        // establish connection  
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
				PreparedStatement pst = (PreparedStatement) con.prepareStatement("UPDATE USER_DATA SET USER_NAME=?,PASSWORD=?, LOGIN_AS=?, FIRST_NAME=?, LAST_NAME=?, EMAIL=?, CONTACT_NUMBER=?, BIRTHDATE=?, ADDRESS=? where user_name=?");

				pst.setString(1, username_textField.getText());
				pst.setString(2, password_textField.getText());
				pst.setString(3, loginas_textField.getText());
				pst.setString(4, first_name_textField.getText());
				pst.setString(5, last_name_textField.getText());
				pst.setString(6, email_textField.getText());
				pst.setString(7, contact_number_textField.getText());
				pst.setString(8, birthdate_textField.getText());
				pst.setString(9, address_textField.getText());
				pst.setString(10, username);
				
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record is updated..."); 
		        con.close();  
		        initComponents();
		        //Refresh(); //Calling Referesh() method  
		    } catch (SQLException se) {  
		        JOptionPane.showMessageDialog(null, se);  
		    }  
		}
	});
	
	cancel_button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	});
	
	
}
}
