package classobject;

import java.awt.print.Book;
import java.util.Scanner;

public class testclasses {

	public static void main(String[] args) {
		book book1=new book();// creates an object and allocates a memory
		//book1 -->0000x
		book1.title="Tell me your dreams";
		book1.author="Sidney Sheldon";
		book1.price=15.50f;
		book1.publisher="XYZ publishing";
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.price);
		System.out.println(book1.publisher);
		book1.print();
		
		book book2=new book();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter title");
		book2.title=scn.nextLine();
		System.out.println("Enter author");
		book2.author=scn.nextLine();
		System.out.println("Enter publisher");
		book2.publisher=scn.nextLine();
		System.out.println("Enter price");
		book2.price=scn.nextFloat();
				
		System.out.println(book2.title);
		System.out.println(book2.author);
		System.out.println(book2.publisher);
		System.out.println(book2.price);
		book2.print();
	}

}
