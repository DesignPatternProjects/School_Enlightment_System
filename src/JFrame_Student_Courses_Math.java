package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class JFrame_Student_Courses_Math extends JFrame {


	private JPanel contentPane;
	private String username;
	private final JFileChooser openFileChooser;
	private BufferedImage originalBI;
	private JLabel messageLabel;
	


	public JFrame_Student_Courses_Math(String username) {
	openFileChooser = new JFileChooser();
	setTitle("Maths");
	this.username=username;
   	initComponents();
   	
   	
   	openFileChooser.setCurrentDirectory(new File("C:\\Users\\pooja\\workspace_rapidx\\School_Enlightment_System\\resources"));
   	openFileChooser.setFileFilter(new FileNameExtensionFilter("pdf file","pdf"));
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
	
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welocme to math class ");
		lblNewLabel.setBounds(12, 13, 150, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel(username);
		lblNewLabel1.setBounds(149, 13, 100, 25);
		contentPane.add(lblNewLabel1);
		
		JButton btnNewButton = new JButton("Open file...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnvalue=openFileChooser.showOpenDialog(btnNewButton);
				if(returnvalue==JFileChooser.APPROVE_OPTION) {
					try {
						originalBI = ImageIO.read(openFileChooser.getSelectedFile()); 
						messageLabel.setText("Pdf successfully loaded");
						
					}
					catch(Exception e1) {
						messageLabel.setText("Pdf failed to load");
					}
				}
				else {
					messageLabel.setText("No File Choosen");
				}
				
			}
		});
		btnNewButton.setBounds(12, 55, 100, 25);
		contentPane.add(btnNewButton);
		
		messageLabel = new JLabel("New label");
		messageLabel.setBounds(124, 55, 250, 25);
		contentPane.add(messageLabel);
		
		
	}

/*private void open_file_menuItemMouseClicked(java.awt.event.ActionEvent evt) {
	// TODO Auto-generated method stub
	try {
		Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler" + "resources\\learn_coins_penny.pdf");
	}
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
	
}*/


}

