package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {
	public static void main(String[] args) {
		
	try {
		String url="jdbc:mysql://localhost:3306/javadb";
		String user="root";
		String password="masm3s22";
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connected succesfully");
		
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println("Something went wrong");
	}
}
}