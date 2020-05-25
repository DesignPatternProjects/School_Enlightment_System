package src;

import java.sql.*;
public class Library_IssueBook_State {
	
public static boolean checkBook(String book_id){
	boolean status=false;
	try{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
		PreparedStatement ps=con.prepareStatement("select * from books where book_id=?");
		ps.setString(1,book_id);
	    ResultSet rs=ps.executeQuery();
		status=rs.next();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}

public static int save(String book_id,int student_id,String student_name,String email){
	int status=0;
	try{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
		
		status=updatebook(book_id);//updating quantity and issue
		
		if(status>0){
		PreparedStatement ps=con.prepareStatement("insert into issuebooks(book_id,student_id,student_name,email) values(?,?,?,?)");
		ps.setString(1,book_id);
		ps.setInt(2,student_id);
		ps.setString(3,student_name);
		ps.setString(4,email);
		status=ps.executeUpdate(); 
		}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int updatebook(String book_id){
	int status=0;
	int quantity=0,issued=0;
	try{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
		
		PreparedStatement ps=con.prepareStatement("select quantity,issued from books where book_id=?");
		ps.setString(1,book_id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			quantity=rs.getInt("quantity");
			issued=rs.getInt("issued");
		}
		
		if(quantity>0){
		PreparedStatement ps2=con.prepareStatement("update books set quantity=?,issued=? where book_id=?");
		ps2.setInt(1,quantity-1);
		ps2.setInt(2,issued+1);
		ps2.setString(3,book_id);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
