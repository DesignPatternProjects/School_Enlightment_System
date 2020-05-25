package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;

public class JFrame_Library_ViewBooks extends JFrame {
	private JPanel contentPane;
	private JTable view_books_jtable;
	private String username;
	
	//private JPanel tablePanel;
	

public JFrame_Library_ViewBooks(String username) {
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

/*public void showData() {
	JFrame_Library_ViewBooks f=new JFrame_Library_ViewBooks();
	String sql="select * from books"; //select all books 
    Connection connection;
	try {
				
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
			Statement stmt = connection.createStatement();
			stmt.executeUpdate("USE client");
            ResultSet rs=stmt.executeQuery(sql);
            String[] columnNames = {"BOOK_ID", "BOOK_NAME","GENRE","AUTHOR"};
            String id="", name="",genre="",author="";
            while(rs.next()) {
            	id=rs.getString("BOOK_ID");
            	name=rs.getString("BOOK_NAME");
            	genre=rs.getString("GENRE");
            	author=rs.getString("AUTHOR");
            	Object[][]data = {{id,name,genre,author}}; 
            	view_books_jtable = new JTable(data,columnNames);
            	view_books_jtable.setBounds(12, 27, 390, 200);
        		contentPane.add(view_books_jtable);
            	view_books_jtable.setModel(DbUtils.resultSetToTableModel(rs)); 
                JScrollPane scrollPane = new JScrollPane(view_books_jtable);
                

                f.add(scrollPane); //add scrollpane
                f.setTitle("Show window");
        		f.setVisible(true);
        		f.setLocationRelativeTo(null);
                f.setSize(800, 400); //set size for frame
            }
        		
            
            
            
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
             JOptionPane.showMessageDialog(null, e1);
        } 
}*/

public void showData()
{
	String data[][]=null;
	String column[]=null;
	try{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
		PreparedStatement ps=con.prepareStatement("select * from books",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=ps.executeQuery();
		
		ResultSetMetaData rsmd=rs.getMetaData();
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
	
	view_books_jtable = new JTable(data,column);
	JScrollPane sp=new JScrollPane(view_books_jtable);
	
	contentPane.add(sp, BorderLayout.CENTER);
}

}
