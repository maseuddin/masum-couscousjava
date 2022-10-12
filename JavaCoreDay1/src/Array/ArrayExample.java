package Array;

public class ArrayExample {
	public static void main(String[] args) {
	//Declare
	//instantiate
	//initialise 
		
		String[] student;//Declare
		student=new String[5];//instantiate
		student[0]="hilda";//initialise
		student[0]="hasan";
		student[0]="kev";
		student[0]="arifi";
		student[0]="edith";
		
		String[] city=new String[5];
		
		String[] fruits= {"Banana", "apple", "grapes", "guava", "pinepple", "avocado"};
		System.out.println("students-------");
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		System.out.println("Fruits---------");
		for(int i=0;i<fruits.length;i++)
		{
		System.out.println("zipcode---------");
		int[] zipcode= {2345, 3434, 4343, 3453, 3454, 3452, 2345};
		for(int i1=0;i1<zipcode.length;i1++)
		{
			System.out.println(zipcode[i1]);
		}
}
}
}
