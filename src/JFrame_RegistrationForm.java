package src;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import com.toedter.calendar.JCalendar;

public class JFrame_RegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField firstname_textField;
	private JTextField lastname_textField;
	private JTextField username_textField;
	private JTextField address_textField;
	private JPasswordField password_textField;
	private JPasswordField retype_password_textField;
	private JTextField email_textField;
	private JTextField contact_number_textField;
	private JTextField loginas_textField;
	private JTextField student_id_textField;
	private JCalendar calendar_birthdate_textField;
	private JButton register_button;
	private JButton cancel_button;

	
	public JFrame_RegistrationForm() {
		initComponents();
	}

	
private void initComponents() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 816);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel student_id_label = new JLabel("STUDENT_ID");
		student_id_label.setForeground(Color.BLUE);
		student_id_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		student_id_label.setBounds(12, 520, 170, 25);
		contentPane.add(student_id_label);
		
		calendar_birthdate_textField = new JCalendar();
		calendar_birthdate_textField.setBounds(190, 270, 200, 115);
		contentPane.add(calendar_birthdate_textField);
		
		JLabel loginas_label = new JLabel("LOGIN_AS\r\n");
		loginas_label.setForeground(Color.BLUE);
		loginas_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		loginas_label.setBounds(12, 480, 170, 25);
		contentPane.add(loginas_label);
		
		contact_number_textField = new JTextField();
		contact_number_textField.setColumns(10);
		contact_number_textField.setBounds(190, 440, 200, 30);
		contentPane.add(contact_number_textField);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBounds(190, 400, 200, 30);
		contentPane.add(email_textField);
		
		JLabel contact_number_label = new JLabel("CONTACT_NUMBER");
		contact_number_label.setForeground(Color.BLUE);
		contact_number_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		contact_number_label.setBounds(12, 440, 170, 25);
		contentPane.add(contact_number_label);
		
		JLabel email_label = new JLabel("EMAIL");
		email_label.setForeground(Color.BLUE);
		email_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		email_label.setBounds(8, 400, 170, 25);
		contentPane.add(email_label);
		
		JLabel Register_label = new JLabel("REGISTRATION FORM");
		Register_label.setForeground(new Color(0, 0, 255));
		Register_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		Register_label.setBounds(100, 13, 226, 32);
		contentPane.add(Register_label);
		
		JLabel first_name_label = new JLabel("FIRST NAME");
		first_name_label.setForeground(new Color(0, 0, 255));
		first_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		first_name_label.setBounds(12, 60, 170, 25);
		contentPane.add(first_name_label);
		
		JLabel last_name_label = new JLabel("LAST NAME\r\n");
		last_name_label.setForeground(new Color(0, 0, 255));
		last_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		last_name_label.setBounds(12, 100, 170, 25);
		contentPane.add(last_name_label);
		
		JLabel username_label = new JLabel("USERNAME\r\n");
		username_label.setForeground(Color.BLUE);
		username_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		username_label.setBounds(12, 140, 170, 25);
		contentPane.add(username_label);
		
		JLabel password_label = new JLabel("PASSWORD");
		password_label.setForeground(Color.BLUE);
		password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		password_label.setBounds(12, 180, 170, 25);
		contentPane.add(password_label);
		
		JLabel retype_password_label = new JLabel("RETYPE PASSWORD");
		retype_password_label.setForeground(Color.BLUE);
		retype_password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		retype_password_label.setBounds(12, 220, 170, 25);
		contentPane.add(retype_password_label);
		
		JLabel birthdate_label = new JLabel("BIRTHDATE");
		birthdate_label.setForeground(Color.BLUE);
		birthdate_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		birthdate_label.setBounds(12, 270, 170, 25);
		contentPane.add(birthdate_label);
		
		JLabel address_label = new JLabel("ADDRESS");
		address_label.setForeground(Color.BLUE);
		address_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		address_label.setBounds(12, 597, 170, 25);
		contentPane.add(address_label);
		
		firstname_textField = new JTextField();
		firstname_textField.setBounds(190, 60, 200, 30);
		contentPane.add(firstname_textField);
		firstname_textField.setColumns(10);
		
		lastname_textField = new JTextField();
		lastname_textField.setColumns(10);
		lastname_textField.setBounds(190, 100, 200, 30);
		contentPane.add(lastname_textField);
		
		username_textField = new JTextField();
		username_textField.setColumns(10);
		username_textField.setBounds(190, 140, 200, 30);
		contentPane.add(username_textField);
		
		address_textField = new JTextField();
		address_textField.setColumns(10);
		address_textField.setBounds(190, 570, 200, 80);
		contentPane.add(address_textField);
		
		register_button = new JButton("REGISTER\r\n");
		
		register_button.setForeground(new Color(0, 0, 255));
		register_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		register_button.setBounds(25, 696, 120, 30);
		contentPane.add(register_button);
		
		cancel_button = new JButton("CANCEL\r\n");
		cancel_button.setForeground(Color.BLUE);
		cancel_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		cancel_button.setBounds(267, 696, 120, 30);
		contentPane.add(cancel_button);
		
		loginas_textField = new JTextField();
		loginas_textField.setColumns(10);
		loginas_textField.setBounds(190, 480, 200, 30);
		contentPane.add(loginas_textField);
		
		password_textField = new JPasswordField();
		password_textField.setBounds(190, 180, 200, 30);
		contentPane.add(password_textField);
		
		retype_password_textField = new JPasswordField();
		retype_password_textField.setBounds(190, 220, 200, 30);
		contentPane.add(retype_password_textField);
		
		student_id_textField = new JTextField();
		student_id_textField.setColumns(10);
		student_id_textField.setBounds(190, 520, 200, 30);
		contentPane.add(student_id_textField);
		
		JLabel backgroung_label = new JLabel("");
		backgroung_label.setIcon(new ImageIcon("Images\\elearning2 (1).jpg"));
		//backgroung_label.setIcon(new ImageIcon("\\Images\\elearning2 (1).jpg"));
		
				backgroung_label.setBounds(0, -17, 522, 714);
				contentPane.add(backgroung_label);
	}

public void registerData() {
	register_button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String firstname_input=firstname_textField.getText();
			String lastname_input=lastname_textField.getText();
			String username_input=username_textField.getText();
			String password_input=String.valueOf(password_textField.getPassword());
			String retype_password_input=String.valueOf(retype_password_textField.getPassword());
			String birthdate_input=null;
			String loginas_input=loginas_textField.getText();
			String email_input=email_textField.getText();
			String contact_number_input=contact_number_textField.getText();
			String address_input=address_textField.getText();
			String student_id_input=student_id_textField.getText();
			if(firstname_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the username");
			}if(firstname_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the username");
			}
			
			if(username_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the username");
			}
			if(password_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the password");
			}
			if(!retype_password_input.equals(password_input)) {
				JOptionPane.showMessageDialog(null, "Re-Enter the password");
			}
			if(calendar_birthdate_textField!=null) {
				SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
			birthdate_input=dateformat.format(calendar_birthdate_textField.getDate());
			}
			
			if(email_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter email id");
			}
			if(contact_number_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the contact details");
			}
			if(address_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the username");
			}
			if(student_id_input.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the username");
			}
			
			PreparedStatement st = null;
			//PreparedStatement st1 = null;
			//ResultSet rs=null;
			
			try {
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
				
				//String select_query="SELECT count(*) FROM user_data where user_name='"+ username_input+"'";
				//st1=con.prepareStatement(select_query);
				//rs=st1.executeQuery();
				
				String insert_query="INSERT INTO user_data VALUES(?,?,?,?,?,?,?,?,?,?)";
				
				st=con.prepareStatement(insert_query);
				st.setString(4, firstname_input);
				st.setString(6, lastname_input);
				st.setString(1, username_input);
				st.setString(2, password_input);
				st.setString(9, birthdate_input);
				st.setString(3, loginas_input);
				st.setString(7, email_input);
				st.setString(8, contact_number_input);
				st.setString(5, address_input);
				st.setString(10, student_id_input);
				
				//if(rs.next() && rs.equals(username_input))
				//{
					//JOptionPane.showMessageDialog(register_button, "Username already exists");
					//} else
				 if(password_input.equals(retype_password_input))
	                {
	                     //Executing query
	                    st.executeUpdate();
	                    JOptionPane.showMessageDialog(register_button,"Data Registered Successfully");
	                   
	                
	                }
	                else
	                {
	                    JOptionPane.showMessageDialog(register_button,"password did not match");
	                }
				 con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
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
