package Test;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);//accept the input
	 System.out.println("Please enter your name");
	 String name=scn.next();
	 System.out.println("Please enter the year of birth");
	 int year=scn.nextInt();
	 System.out.println("hello "+name+ " Welcome to the world of java u were born in "+year);
	 System.out.println("Please enter your first name");
		String fName=scn.next();
		System.out.println("Please enter your last name");
		String lName=scn.next();
		System.out.println("Hello "+fName+" "+lName);
	}

	
}
