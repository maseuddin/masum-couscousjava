package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Deleterecord {

	
	public static void main(String[] args) {	
		try {
			String url="jdbc:mysql://localhost:3306/javadb";
			String user="root";
			String password="masmas22";
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connected succesfully");
			
			String query="delete from customer where id=106";
			Statement stmt=con.createStatement();// to create SQL Statement
			stmt.executeUpdate(query);
			System.out.println("One record deleted successfully");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
	}
}
