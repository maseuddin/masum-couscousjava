package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertrecord {

	public static void main(String[] args) {	
		try {
			String url="jdbc:mysql://localhost:3306/javadb";
			String user="root";
			String password="masmas22";
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connected succesfully");
			
			String query="insert into customer values(106,'Edith',9999,'ed@gmail.com')";
			Statement stmt=con.createStatement();// to create SQL Statement
			stmt.executeUpdate(query);
			System.out.println("One record inserted successfully");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
	}
	

}
