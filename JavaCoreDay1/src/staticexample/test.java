package staticexample;

public class test {

	public static void main(String[] args) {
	
		sample obj1=new sample(); // ---> xx01
				obj1.name="Angel";
				obj1.SSN=203423;
				
		sample obj2=new sample(); //----> xx02
				obj2.name="Angel";
				obj2.SSN=203423;
				
		System.out.println(sample.nameOfOrg);
		sample.nameOfOrg="Oracle";
		//xxxdd="Oracle"
		System.out.println(sample.nameOfOrg);
		
			}
	}

