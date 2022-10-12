package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {

	public static void main(String[] args) {
	Employee emp=new Employee(10001, "John", 67000, "Lawyer", "John@hotmail.com");
	try {
		FileOutputStream fileOut=new FileOutputStream("employ.txt");
		//to convert object into stream of bytes
		ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
		//to write into the file
		oOut.writeObject(emp);
		
		//---------------read operation-------------
		FileInputStream fileIn=new FileInputStream("employ.txt");
		//to convert bytes to object
		ObjectInputStream oIn=new ObjectInputStream(fileIn);
		Employee empCopy=(Employee)oIn.readObject();
		System.out.println(empCopy.empId);
		System.out.println(empCopy.name);
		System.out.println(empCopy.salary);
		System.out.println(empCopy.designation);
		System.out.println(empCopy.email);
	

}catch (Exception e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
