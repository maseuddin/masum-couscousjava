package Array;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		String[] city=new String [5];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter names of cities");
		for(int i=0;i<city.length;i++)
		{
			city[i]=scn.next();
		}
		System.out.println("list of cities");
		for(int i=0;i<city.length;i++)
		{	
		System.out.println(city[i]);
		}
		
		//enhance for loop array for loop
		System.out.println("list of cities");
		for(String x:city)
		{
			System.out.println(x);
		}
		
		int[] marks=new int[5];
		marks[0]=100;
		marks[1]=100;
		marks[2]=100;
		marks[3]=100;
		marks[4]=100;
		
		System.out.println("list of marks");
		for(int x:marks)
		{
			System.out.println(x);
		}
}
}