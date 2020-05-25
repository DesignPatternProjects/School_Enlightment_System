package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JFrame_Library_ViewIssuedBooks extends JFrame {

	private JPanel contentPane;
	private JTable view_issuedbooks_jtable;
	private JPanel tablePanel;
	private String username;

	public JFrame_Library_ViewIssuedBooks(String username) {
		this.username=username;
	   	initComponents();
	}


public void initComponents() {

	/**
	 * Create the frame.
	 */
	
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		}

public void showData() {
	String data[][]=null;
	String column[]=null;
	try{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
		PreparedStatement ps=con.prepareStatement("select * from issuebooks",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=ps.executeQuery();
		
		ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
		int cols=rsmd.getColumnCount();
		column=new String[cols];
		for(int i=1;i<=cols;i++){
			column[i-1]=rsmd.getColumnName(i);
		}
		
		rs.last();
		int rows=rs.getRow();
		rs.beforeFirst();

		data=new String[rows][cols];
		int count=0;
		while(rs.next()){
			for(int i=1;i<=cols;i++){
				data[count][i-1]=rs.getString(i);
			}
			count++;
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	
	view_issuedbooks_jtable = new JTable(data,column);
	JScrollPane sp=new JScrollPane(view_issuedbooks_jtable);
	
	contentPane.add(sp, BorderLayout.CENTER);

}
}
