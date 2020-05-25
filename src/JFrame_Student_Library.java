package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class JFrame_Student_Library extends JFrame {


		private JPanel contentPane;
		private String username;
		private javax.swing.JPanel view_book_panel;
		private JTable table;

	public JFrame_Student_Library(String username) {
		setTitle("Library\r\n");
		this.username=username;
		
		table = new JTable();
		getContentPane().add(table, BorderLayout.SOUTH);
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
		
			setBounds(100, 100, 705, 512);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(51, 102, 204));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("My Library Account");
			lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
			lblNewLabel.setBounds(0, 0, 227, 37);
			contentPane.add(lblNewLabel);
			
			JPanel view_book_panel = new JPanel();
			view_book_panel.setBackground(new Color(240, 240, 240));
			view_book_panel.setBounds(15, 65, 144, 130);
			contentPane.add(view_book_panel);
			view_book_panel.setLayout(null);
			
			view_book_panel.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					setColor(view_book_panel);
				}
				public void mouseExited(MouseEvent e) {
					resetColor(view_book_panel);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					JFrame_Library_ViewBooks view_book=new JFrame_Library_ViewBooks(username);
					view_book.setTitle("View Books");
					view_book.showData();					
		            view_book.setVisible(true);
		            view_book.setSize(600, 600);
					
					}
			});
			
			
			JLabel view_books_label_img = new JLabel("");
			view_books_label_img.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				}
			});
			view_books_label_img.setIcon(new ImageIcon("Images\\icons8-book-shelf-viewbooks-96.png"));
			view_books_label_img.setBounds(19, 8, 107, 74);
			view_book_panel.add(view_books_label_img);
			
			JButton view_books_button = new JButton("View Books");
			view_books_button.setForeground(new Color(0, 0, 0));
			view_books_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			view_books_button.setBackground(new Color(51, 102, 204));
			view_books_button.setBounds(8, 92, 124, 31);
			view_book_panel.add(view_books_button);
			view_books_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			
			
			JPanel issue_books_panel = new JPanel();
			issue_books_panel.setLayout(null);
			issue_books_panel.setBounds(160, 235, 144, 130);
			contentPane.add(issue_books_panel);
			
			issue_books_panel.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					setColor(issue_books_panel);
				}
				public void mouseExited(MouseEvent e) {
					resetColor(issue_books_panel);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					JFrame_Library_IssueBook issue_book=new JFrame_Library_IssueBook(username);
					issue_book.setTitle("Books Issued");
					issue_book.showData();
					issue_book.setVisible(true);
				}
			});
						
			JLabel issue_books_label_img = new JLabel("");
			issue_books_label_img.setIcon(new ImageIcon("Images\\icons8-add-book-96.png"));
			issue_books_label_img.setBounds(19, 5, 113, 83);
			issue_books_panel.add(issue_books_label_img);
			
			JButton issue_books_button = new JButton("Issue Books");
			issue_books_button.setForeground(new Color(0, 0, 0));
			issue_books_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			issue_books_button.setBackground(new Color(51, 102, 204));
			issue_books_button.setBounds(8, 92, 124, 31);
			issue_books_panel.add(issue_books_button);
			
			JPanel view_issuedbooks_panel = new JPanel();
			view_issuedbooks_panel.setLayout(null);
			view_issuedbooks_panel.setBounds(305, 65, 150, 130);
			contentPane.add(view_issuedbooks_panel);
			
			view_issuedbooks_panel.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					setColor(view_issuedbooks_panel);
				}
				public void mouseExited(MouseEvent e) {
					resetColor(view_issuedbooks_panel);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					JFrame_Library_ViewIssuedBooks booksissued=new JFrame_Library_ViewIssuedBooks(username);
					booksissued.setTitle("Issued Books");
					booksissued.showData();
					booksissued.setVisible(true);
				}
			});
			
			
			JLabel view_issuedbooks_label_img = new JLabel("");
			view_issuedbooks_label_img.setIcon(new ImageIcon("Images\\icons8-content-issuedbooks-96.png"));
			view_issuedbooks_label_img.setBounds(19, 8, 96, 68);
			view_issuedbooks_panel.add(view_issuedbooks_label_img);
			
			JButton view_issuedbooks_button = new JButton("View IssuedBooks");
			view_issuedbooks_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			view_issuedbooks_button.setForeground(new Color(0, 0, 0));
			view_issuedbooks_button.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
			view_issuedbooks_button.setBackground(new Color(51, 102, 204));
			view_issuedbooks_button.setBounds(4, 92, 143, 33);
			view_issuedbooks_panel.add(view_issuedbooks_button);
			
			JPanel return_books_panel = new JPanel();
			return_books_panel.setLayout(null);
			return_books_panel.setBounds(450, 235, 150, 130);
			contentPane.add(return_books_panel);
			
			return_books_panel.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					setColor(return_books_panel);
				}
				public void mouseExited(MouseEvent e) {
					resetColor(return_books_panel);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					JFrame_Library_ReturnBook books_return=new JFrame_Library_ReturnBook(username);
					books_return.setTitle("Returned Books");
					books_return.showData();
					books_return.setVisible(true);
				}
			});
			
			
			JLabel return_books_label_img = new JLabel("");
			return_books_label_img.setIcon(new ImageIcon("Images\\icons8-return-book-96.png"));
			return_books_label_img.setBounds(19, 8, 107, 74);
			return_books_panel.add(return_books_label_img);
			
			JButton return_books_button = new JButton("Return Books");
			return_books_button.setForeground(new Color(0, 0, 0));
			return_books_button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			return_books_button.setBackground(new Color(51, 102, 204));
			return_books_button.setBounds(7, 92, 134, 31);
			return_books_panel.add(return_books_button);
			}
	private void view_book_panel_mouseEntered(MouseEvent evt) {
		setColor(view_book_panel);
		
	}
	public void setColor(JPanel panel) {
		panel.setBackground(new java.awt.Color(197,197,197));
	}
	public void resetColor(JPanel panel) {
		panel.setBackground(new java.awt.Color(240,240,240));
	}
		
		
	}

