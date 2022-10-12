package inheritance;

public class manager extends Employee{
	String dept;
	public manager () {}
	public manager (String name, int age, int empId, String dept)
	{
	//super() calls the constructor of super class
	
	super(name,age,empId);
	this.dept=dept;
		
		System.out.println("manager constructor");{	
		}
		}
		public void doSomething() {
			System.out.println("managers manage their respective dept");
	}
}
