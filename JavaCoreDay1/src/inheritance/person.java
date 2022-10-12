package inheritance;

public abstract class person {
	String name;
	int age;
	public person() {}
	public person(String name, int age)	
	{
		this.name=name;
		this.age=age;
		System.out.println();
		System.out.println("person constructor");
		
	//public void doSomething() {
	//System.out.println("people do something to make their living");

	}
	public abstract void doSomething();//no body
	//normal/instance method with body
	public void talk()
	{
		System.out.println("people talk to each other to express their feelings");
}
}