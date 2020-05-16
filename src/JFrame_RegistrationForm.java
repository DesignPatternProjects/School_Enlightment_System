import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
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

public class JFrame_RegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField firstname_textField;
	private JTextField lastname_textField;
	private JTextField username_textField;
	private JTextField birthdate_textField;
	private JTextField address_textField;
	private JPasswordField password_textField;
	private JPasswordField retype_password_textField;
	private JTextField email_textField;
	private JTextField contact_number_textField;
	private JTextField loginas_textField;

	/**
	 * Launch the application.
	 * Create the frame.
	 */
	public JFrame_RegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel loginas_label = new JLabel("LOGIN_AS\r\n");
		loginas_label.setForeground(Color.BLUE);
		loginas_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		loginas_label.setBounds(12, 480, 170, 25);
		contentPane.add(loginas_label);
		
		contact_number_textField = new JTextField();
		contact_number_textField.setColumns(10);
		contact_number_textField.setBounds(190, 430, 170, 30);
		contentPane.add(contact_number_textField);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBounds(190, 380, 170, 30);
		contentPane.add(email_textField);
		
		JLabel contact_number_label = new JLabel("CONTACT_NUMBER");
		contact_number_label.setForeground(Color.BLUE);
		contact_number_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		contact_number_label.setBounds(12, 430, 170, 25);
		contentPane.add(contact_number_label);
		
		JLabel email_label = new JLabel("EMAIL");
		email_label.setForeground(Color.BLUE);
		email_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		email_label.setBounds(12, 380, 170, 25);
		contentPane.add(email_label);
		
		JLabel Register_label = new JLabel("REGISTRATION FORM");
		Register_label.setForeground(new Color(0, 0, 255));
		Register_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		Register_label.setBounds(12, 13, 226, 32);
		contentPane.add(Register_label);
		
		JLabel first_name_label = new JLabel("FIRST NAME");
		first_name_label.setForeground(new Color(0, 0, 255));
		first_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		first_name_label.setBounds(12, 80, 170, 25);
		contentPane.add(first_name_label);
		
		JLabel last_name_label = new JLabel("LAST NAME\r\n");
		last_name_label.setForeground(new Color(0, 0, 255));
		last_name_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		last_name_label.setBounds(12, 130, 170, 25);
		contentPane.add(last_name_label);
		
		JLabel username_label = new JLabel("USERNAME\r\n");
		username_label.setForeground(Color.BLUE);
		username_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		username_label.setBounds(12, 180, 170, 25);
		contentPane.add(username_label);
		
		JLabel password_label = new JLabel("PASSWORD");
		password_label.setForeground(Color.BLUE);
		password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		password_label.setBounds(12, 230, 170, 25);
		contentPane.add(password_label);
		
		JLabel retype_password_label = new JLabel("RETYPE PASSWORD");
		retype_password_label.setForeground(Color.BLUE);
		retype_password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		retype_password_label.setBounds(12, 280, 170, 25);
		contentPane.add(retype_password_label);
		
		JLabel birthdate_label = new JLabel("BIRTHDATE");
		birthdate_label.setForeground(Color.BLUE);
		birthdate_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		birthdate_label.setBounds(12, 330, 170, 25);
		contentPane.add(birthdate_label);
		
		JLabel address_label = new JLabel("ADDRESS");
		address_label.setForeground(Color.BLUE);
		address_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		address_label.setBounds(12, 574, 170, 25);
		contentPane.add(address_label);
		
		firstname_textField = new JTextField();
		firstname_textField.setBounds(190, 80, 170, 30);
		contentPane.add(firstname_textField);
		firstname_textField.setColumns(10);
		
		lastname_textField = new JTextField();
		lastname_textField.setColumns(10);
		lastname_textField.setBounds(190, 130, 170, 30);
		contentPane.add(lastname_textField);
		
		username_textField = new JTextField();
		username_textField.setColumns(10);
		username_textField.setBounds(190, 180, 170, 30);
		contentPane.add(username_textField);
		
		birthdate_textField = new JTextField();
		birthdate_textField.setColumns(10);
		birthdate_textField.setBounds(190, 330, 170, 30);
		contentPane.add(birthdate_textField);
		
		address_textField = new JTextField();
		address_textField.setColumns(10);
		address_textField.setBounds(190, 538, 170, 80);
		contentPane.add(address_textField);
		
		JButton register_button = new JButton("REGISTER\r\n");
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname_input=firstname_textField.getText();
				String lastname_input=lastname_textField.getText();
				String username_input=username_textField.getText();
				String password_input=String.valueOf(password_textField.getPassword());
				String retype_password_input=String.valueOf(retype_password_textField.getPassword());
				String birthdate_input=birthdate_textField.getText();
				String loginas_input=loginas_textField.getText();
				String email_input=email_textField.getText();
				String contact_number_input=contact_number_textField.getText();
				String address_input=address_textField.getText();
				
				
				if(username_input.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the username");
				}
				else if(password_input.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the password");
				}
				else if(!retype_password_input.equals(password_input)) {
					JOptionPane.showMessageDialog(null, "Re-Enter the password");
				}
				//else if(birthdate_textField!=null) {
					//SimpleDateFormat dateformat=new SimpleDateFormat("MM/DD/YYYY");
				//	birthdate_input=dateformat.format(birthdate_textField);
				//}
				else if(email_input.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter email id");
				}
				else if(contact_number_input.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the contact details");
				}
				PreparedStatement st = null;
				
				
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
					String query="INSERT INTO user_data VALUES(?,?,?,?,?,?,?,?,?)";
					st=con.prepareStatement(query);
					st.setString(4, firstname_input);
					st.setString(6, lastname_input);
					st.setString(1, username_input);
					st.setString(2, password_input);
					st.setString(9, birthdate_input);
					st.setString(3, loginas_input);
					st.setString(7, email_input);
					st.setString(8, contact_number_input);
					st.setString(5, address_input);
					//ResultSet rs=st.executeQuery();
					if(password_input.equalsIgnoreCase(retype_password_input))
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
		register_button.setForeground(new Color(0, 0, 255));
		register_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		register_button.setBounds(44, 671, 120, 30);
		contentPane.add(register_button);
		
		JButton cancel_button = new JButton("CANCEL\r\n");
		cancel_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cancel_button.setForeground(Color.BLUE);
		cancel_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		cancel_button.setBounds(222, 671, 120, 30);
		contentPane.add(cancel_button);
		
		loginas_textField = new JTextField();
		loginas_textField.setColumns(10);
		loginas_textField.setBounds(190, 480, 170, 30);
		contentPane.add(loginas_textField);
		
		JLabel backgroung_label = new JLabel("");
		backgroung_label.setIcon(new ImageIcon("C:\\Users\\pooja\\workspace_rapidx\\School_Enlightment_System\\Images\\elearning2 (1).jpg"));
		backgroung_label.setBounds(0, 0, 522, 714);
		contentPane.add(backgroung_label);
		
		password_textField = new JPasswordField();
		password_textField.setBounds(190, 230, 170, 30);
		contentPane.add(password_textField);
		
		retype_password_textField = new JPasswordField();
		retype_password_textField.setBounds(190, 280, 170, 30);
		contentPane.add(retype_password_textField);
	}
}
