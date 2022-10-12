package staticexample;

public class test1 {
public static void main(String[] args) {
	mysample obj1=new mysample();//++101
	obj1.x=10;
	System.out.println(obj1.x);
	obj1.x++;
	System.out.println(obj1.x);
	System.out.println(mysample.staticx++);//++102
	System.out.println(mysample.staticx++);//++103
	
	mysample obj2=new mysample();//++104
	obj2.x=20;
	System.out.println(obj2.x);
	obj2.x++;
	System.out.println(obj2.x);
	System.out.println(mysample.staticx++);//++105
	
	mysample obj3=new mysample();//++106
	
	}
}
