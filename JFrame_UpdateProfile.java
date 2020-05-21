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

public class JFrame_UpdateProfile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	private String username;
  
    public JFrame_UpdateProfile(String username) {
        this.username=username;
    	initComponents();
    }

    public String getUsername() {
		return username;
	}
    

	/**
	 * Create the frame.
	 */
	public void initComponents() {
		setForeground(new Color(176, 224, 230));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(35, 30, 89, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(35, 65, 89, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login As");
		lblNewLabel_2.setToolTipText("\r\nEnter TEACHER or STUDENT only.");
		lblNewLabel_2.setBounds(35, 100, 89, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setBounds(35, 135, 89, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Last Name");
		lblNewLabel_4.setBounds(35, 170, 89, 26);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(35, 205, 89, 26);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contact Number");
		lblNewLabel_6.setBounds(35, 240, 89, 26);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Birthdate");
		lblNewLabel_7.setBounds(35, 275, 89, 26);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setBounds(35, 310, 89, 26);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(153, 30, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 65, 117, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 100, 117, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 135, 117, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 170, 117, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(153, 205, 117, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(153, 240, 117, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(153, 275, 117, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(153, 310, 117, 20);
		contentPane.add(textField_8);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				try {  
			       // Class.forName("com.mysql.jdbc.Driver");  
			        // establish connection  
			        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
					PreparedStatement pst = (PreparedStatement) con.prepareStatement("UPDATE USER_DATA SET USER_NAME=?,PASSWORD=?, LOGIN_AS=?, FIRST_NAME=?, LAST_NAME=?, EMAIL=?, CONTACT_NUMBER=?, BIRTHDATE=?, ADDRESS=? where user_name=?");

					pst.setString(1, textField.getText());
					pst.setString(2, textField_1.getText());
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					pst.setString(5, textField_4.getText());
					pst.setString(6, textField_5.getText());
					pst.setString(7, textField_6.getText());
					pst.setString(8, textField_7.getText());
					pst.setString(9, textField_8.getText());
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
		btnNewButton.setBounds(460, 97, 128, 42);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {  
			        Class.forName("com.mysql.jdbc.Driver");  
			        // establish connection  
			        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
					PreparedStatement pst = (PreparedStatement) con.prepareStatement("DELETE FROM USER_DATA WHERE USER_NAME=?");

					pst.setString(1, username);
			
					int rs=pst.executeUpdate();
					if(rs == 1) {
					JOptionPane.showMessageDialog(null, "Profile is deleted..."); 
					}
					con.close();  
			        //Refresh(); //Calling Referesh() method  
			    } catch (SQLException | ClassNotFoundException se) {  
			        JOptionPane.showMessageDialog(null, se);  
			    } 
			}
		});
		btnDelete.setToolTipText("\r\nAction can not be undone.");
		btnDelete.setBounds(460, 207, 128, 42);
		contentPane.add(btnDelete);
		
		 try {  
		        //Class.forName("com.mysql.jdbc.Driver");  
		        // establish connection  
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
		        PreparedStatement pst = (PreparedStatement) con.prepareStatement("Select USER_NAME, PASSWORD, LOGIN_AS, FIRST_NAME, LAST_NAME, EMAIL, CONTACT_NUMBER, BIRTHDATE, ADDRESS from user_data where user_name=?");

				pst.setString(1, username);  
				
				ResultSet rs=pst.executeQuery();
				
				if(rs.next()) { 
			        String ID = rs.getString("USER_NAME");
			        textField.setText(ID);
			        String PS = rs.getString("PASSWORD");
			        textField_1.setText(PS);
			        String LA = rs.getString("LOGIN_AS");
			        textField_2.setText(LA);
			        String FN = rs.getString("FIRST_NAME");
			        textField_3.setText(FN);
			        String LN = rs.getString("LAST_NAME");
			        textField_4.setText(LN);
			        String EM = rs.getString("EMAIL");
			        textField_5.setText(EM);
			        String CN = rs.getString("CONTACT_NUMBER");
			        textField_6.setText(CN);
			        String BD = rs.getString("BIRTHDATE");
			        textField_7.setText(BD);
			        String AD = rs.getString("ADDRESS");
			        textField_8.setText(AD);
			        
			       
			     
				}
				
				con.close();
		    } catch (SQLException e) {  
		        JOptionPane.showMessageDialog(null, e);  
		    }  
	}
}
