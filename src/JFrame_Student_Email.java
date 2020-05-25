package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.mail.MessagingException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class JFrame_Student_Email extends JFrame {

		private JPanel contentPane;
		private String username;
		private JButton send_button;
		private JTextField to_textField;
		private JTextField subject_textField;
		private JTextArea message_textArea;
		private static String emailMsgTxt = "";
		private static String emailSubjectTxt = "";
		private static String emailFromAddress = "";
		// Add List of Email address to who email needs to be sent to
		private static String[] emailList = new String[10];

		

	public JFrame_Student_Email(String username) {
		setTitle("Email_Conversation");
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

		/**
		 * Create the frame.
		 */
		
			setBounds(100, 100, 545, 457);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(51, 102, 204));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel to_label = new JLabel("To\r\n");
			to_label.setHorizontalAlignment(SwingConstants.TRAILING);
			to_label.setVerticalTextPosition(SwingConstants.BOTTOM);
			to_label.setBackground(new Color(51, 102, 204));
			to_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			to_label.setBounds(12, 30, 90, 25);
			contentPane.add(to_label);
			
			JLabel subject_label = new JLabel("Subject");
			subject_label.setHorizontalAlignment(SwingConstants.TRAILING);
			subject_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			subject_label.setBackground(new Color(51, 102, 204));
			subject_label.setBounds(12, 80, 90, 25);
			contentPane.add(subject_label);
			
			JLabel message_label = new JLabel("Message");
			message_label.setHorizontalAlignment(SwingConstants.TRAILING);
			message_label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			message_label.setBackground(new Color(51, 102, 204));
			message_label.setBounds(12, 136, 90, 25);
			contentPane.add(message_label);
			
			to_textField = new JTextField();
			to_textField.setBounds(120, 30, 320, 27);
			contentPane.add(to_textField);
			to_textField.setColumns(10);
			
			subject_textField = new JTextField();
			subject_textField.setColumns(10);
			subject_textField.setBounds(120, 80, 320, 27);
			contentPane.add(subject_textField);
			
			send_button = new JButton("Send");
			//send_button.addActionListener(new ActionListener() {
				//public void actionPerformed(ActionEvent e) {
				//}
			//});
			send_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			send_button.setBounds(194, 367, 97, 30);
			contentPane.add(send_button);
			
			message_textArea = new JTextArea();
			message_textArea.setBounds(120, 130, 320, 200);
			contentPane.add(message_textArea);
			
			
		//}
	//public void sendEmail() {
	/*	send_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				emailMsgTxt = message_textArea.getText();
		        emailSubjectTxt = subject_textField.getText();
		        emailFromAddress = EmailSendingAuthentication.SMTP_AUTH_USER;

		        // Add List of Email address to who email needs to be sent to
		        StringBuffer sb = new StringBuffer(to_textField.getText());
		        StringTokenizer st = new StringTokenizer(to_textField.getText());
		        int i = 0;
		        while (st.hasMoreTokens()) {
		            emailList[i] = st.nextToken(",");
		            System.err.println(emailList[i]);
		            i++;
		        }
		        String emailReceipeint[] = new String[i];
		        for (int j = 0; j < i; j++) {
		            emailReceipeint[j] = emailList[j];
		            System.out.println("Actually emails are " + j);
		        }


		        EmailSendingAuthentication smtpMailSender = new EmailSendingAuthentication();
		        try {
		            smtpMailSender.postMail(emailReceipeint, emailSubjectTxt, emailMsgTxt, emailFromAddress);
		        } catch (MessagingException ex) {
		           		        	ex.printStackTrace();
		        }
		        System.out.println("Sucessfully Sent mail to All Users");
				
			}
		});*/
        
	}
	}
