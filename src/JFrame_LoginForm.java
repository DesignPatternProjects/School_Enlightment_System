package src;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;

public class JFrame_LoginForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7362423879142414799L;
	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField username_textField;
	private JLabel Loginas_label;
	private JComboBox<String> LoginAs_comboBox;
	private JLabel lblNewLabel;
	private JPasswordField password_textField;
	private JButton Register_button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_LoginForm frame = new JFrame_LoginForm();
					frame.setVisible(true); 
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame_LoginForm() {
		setType(Type.POPUP);
		setTitle("LOGIN_WINDOW\r\n");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Cancel_button = new JButton("CANCEL");
		Cancel_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		Register_button = new JButton("REGISTER HERE");
		Register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame_RegistrationForm register_frame = new JFrame_RegistrationForm();
				register_frame.registerData();
				register_frame.setVisible(true);
				
			}
		});
		
		password_textField = new JPasswordField();
		password_textField.setBounds(314, 130, 115, 32);
		contentPane.add(password_textField);
		Register_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		Register_button.setForeground(new Color(0, 0, 255));
		Register_button.setBounds(210, 331, 170, 33);
		contentPane.add(Register_button);
		Cancel_button.setActionCommand("");
		Cancel_button.setToolTipText("");
		Cancel_button.setForeground(new Color(0, 0, 255));
		Cancel_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		Cancel_button.setBounds(314, 263, 115, 33);
		contentPane.add(Cancel_button);
		
		JLabel Username_label = new JLabel("USERNAME");
		Username_label.setForeground(new Color(0, 0, 255));
		//Username_label.setIcon(new ImageIcon("C:\\Users\\pooja\\workspace_rapidx\\MultiUserLogin\\Images\\username_logo2.png"));
		
		/*ImageIcon image=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("username_logo2.png")));
		Image img1=image.getImage();
		Image img2=img1.getScaledInstance(Username_label.getWidth(), Username_label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon i=new ImageIcon(img2);
		Username_label.setIcon(i);*/
		
		Username_label.setBounds(159, 65, 115, 32);
		Username_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		contentPane.add(Username_label);
		
		JLabel Passwword_label = new JLabel("PASSWORD");
		Passwword_label.setBackground(new Color(255, 255, 255));
		Passwword_label.setForeground(new Color(0, 0, 255));
		Passwword_label.setBounds(159, 130, 115, 32);
		Passwword_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		contentPane.add(Passwword_label);
		
		username_textField = new JTextField();
		username_textField.setBounds(314, 65, 115, 32);
		contentPane.add(username_textField);
		username_textField.setColumns(10);
		
		JButton Login_Button = new JButton("LOGIN");
		Login_Button.setForeground(new Color(0, 0, 255));
		Login_Button.setDefaultCapable(true);
		Login_Button.setBounds(159, 263, 115, 32);
		Login_Button.setActionCommand("");
		Login_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username_input=username_textField.getText();
				@SuppressWarnings("deprecation")
				String password_input=password_textField.getText();
				String role_input=LoginAs_comboBox.getSelectedItem().toString();
				if(username_input.equals("") || password_input.equals("") || role_input.equals("SELECT")) {
					JOptionPane.showMessageDialog(rootPane, "Some Fields are empty", "Error", 1);
				}
				else {
				try {
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
					PreparedStatement pst = (PreparedStatement) con.prepareStatement("Select USER_NAME, password, LOGIN_AS from user_data where user_name=? and password=? and login_as=?");

					pst.setString(1, username_input);
					pst.setString(2, password_input);
					pst.setString(3, role_input);
					
					
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						String username=rs.getString("user_name");
						String login_role=rs.getString("login_as");
						JOptionPane.showMessageDialog(Login_Button, "Login Successfull..");
						if(role_input.equalsIgnoreCase("TEACHER") && login_role.equalsIgnoreCase("teacher")) {
							JFrame_TeacherDashboard teacher= new JFrame_TeacherDashboard(username);
							//teacher.run();
							teacher.setVisible(true);
							setVisible(false);
						}
						if(role_input.equalsIgnoreCase("STUDENT") && login_role.equalsIgnoreCase("student")){
							JFrame_StudentDashboard student=new JFrame_StudentDashboard(username);
							//student.run();
							student.setVisible(true);
							setVisible(false);
						}
					}
					else {
						JOptionPane.showMessageDialog(Login_Button, "Login Failed");
					}
					con.close();
					
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
				
				}
			}
		});
		Login_Button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		contentPane.add(Login_Button);
		
		Loginas_label = new JLabel("LOGIN_AS");
		Loginas_label.setForeground(new Color(0, 0, 255));
		Loginas_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		Loginas_label.setBounds(159, 195, 110, 32);
		contentPane.add(Loginas_label);
		
		LoginAs_comboBox = new JComboBox<String>();
		LoginAs_comboBox.setForeground(new Color(0, 0, 255));
		LoginAs_comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		LoginAs_comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "TEACHER", "STUDENT"}));
		LoginAs_comboBox.setSelectedIndex(0);
		LoginAs_comboBox.setBounds(314, 195, 115, 32);
		contentPane.add(LoginAs_comboBox);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("Images\\notebook-336634_640_opacity60.jpg"));
		lblNewLabel.setBounds(-2, -4, 567, 441);
		contentPane.add(lblNewLabel);
	}
}
