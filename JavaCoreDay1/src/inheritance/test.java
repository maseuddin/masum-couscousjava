package inheritance;

public class test {
	public static void main(String[] args) {
	
		//Person p=new Person()
		
		//Employee e=new Employee();
		person p1=new Employee();
		person p2=new Employee();
		person p3=new Employee();
		
		manager m=new manager("Upasana",32,1001,"training");
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empId);
		System.out.println(m.dept);
		m.doSomething();
		
		Employee emp=new Employee();
		emp.display();
		manager man=new manager();
		man.display();
		Employee e1=(Employee)man;
		e1.display();
		
		Employee emp1=new Employee();
		person p=(person)emp1;
		p.doSomething();
		
}

}
	
