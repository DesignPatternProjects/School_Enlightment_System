package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JFrame_ChangePassword extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField old_password_textField;
    private JLabel old_password_label;
    private JTextField new_password_textField;
    private JTextField reenter_new_password_textField;

    public JFrame_ChangePassword(String username) {
        setBounds(300, 200, 626, 361);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(51, 102, 204));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        old_password_textField = new JPasswordField();
        old_password_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
        old_password_textField.setBounds(275, 80, 250, 40);
        contentPane.add(old_password_textField);
        old_password_textField.setColumns(10);

        JButton submit_button = new JButton("Submit");
        submit_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String pstr = old_password_textField.getText();
                String pstr1 = new_password_textField.getText();
                String pstr2 = reenter_new_password_textField.getText();
                try {

                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/client","root", "");
                    PreparedStatement st = (PreparedStatement) con.prepareStatement("Update user_data set password=? where user_name=?");
                    if((pstr.equals(pstr1)) && (pstr.equals(pstr2))) {
                    	JOptionPane.showMessageDialog(submit_button, "New password should be different than old password");
                    }
                    if(!(pstr1.equals(pstr2))) {
                    	JOptionPane.showMessageDialog(submit_button, "New password and re-entered password did not match");
                    }
                    if((!(pstr.equals(pstr1))) && (pstr1.equals(pstr2))) {
                    	st.setString(1, pstr1);
                        st.setString(2, username);
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(submit_button, "Password has been successfully changed");
                    }
                  con.close();  
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }

            }
        });
        submit_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        submit_button.setBackground(new Color(240, 240, 240));
        submit_button.setBounds(215, 274, 120, 39);
        contentPane.add(submit_button);

        old_password_label = new JLabel("Enter Old Password :");
        old_password_label.setBackground(new Color(51, 102, 204));
        old_password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        old_password_label.setBounds(25, 80, 220, 40);
        contentPane.add(old_password_label);
        
        JLabel new_password_label = new JLabel("Enter New Password :");
        new_password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        new_password_label.setBackground(new Color(51, 102, 204));
        new_password_label.setBounds(25, 140, 220, 40);
        contentPane.add(new_password_label);
        
        new_password_textField = new JPasswordField();
        new_password_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
        new_password_textField.setColumns(10);
        new_password_textField.setBounds(275, 140, 250, 40);
        contentPane.add(new_password_textField);
        
        reenter_new_password_textField = new JPasswordField();
        reenter_new_password_textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
        reenter_new_password_textField.setColumns(10);
        reenter_new_password_textField.setBounds(275, 200, 250, 40);
        contentPane.add(reenter_new_password_textField);
        
        JLabel reenter_new_password_label = new JLabel("Re-Enter New Password :");
        reenter_new_password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        reenter_new_password_label.setBackground(new Color(51, 102, 204));
        reenter_new_password_label.setBounds(25, 200, 220, 40);
        contentPane.add(reenter_new_password_label);
        
        JLabel change_password_label = new JLabel("Change Password");
        change_password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        change_password_label.setBounds(200, 12, 200, 25);
        contentPane.add(change_password_label);
    }
}
