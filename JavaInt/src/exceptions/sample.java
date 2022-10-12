package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sample {

	public static void main(String[] args) {
	try {
		int x =10;
		int y = 2;
		int z = x / y;// logical issue
		int[] nums=new int[5];
		nums[4] = 200;
		Connection con=DriverManager.getConnection("", "", "");
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		System.out.println("something went wrong");
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		System.out.println("we can not place elements out of array's boundary");
	}catch ( SQLException e)
	{
		System.out.println(e.getMessage());
		System.out.println("could not connect to the database");
	}finally {
		System.out.println("i will get execute always");
}
}
}
