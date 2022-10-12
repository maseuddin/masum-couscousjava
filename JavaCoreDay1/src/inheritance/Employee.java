package inheritance;

public class Employee extends person{
	int empId;
	public Employee() {}
	public Employee(String name, int age, int empId)
	{
	//super() calls the constructor of super class
	//public person()
	
	super(name,age);
	this.empId=empId;
		
	System.out.println("Employee constructor");}
	
	public void doSomething() {
		System.out.println("employees work to earn their salary");
}
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
