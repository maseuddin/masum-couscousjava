package userdefinedExp;

public class ElectionDay {

	public static void main(String[] args) {
	Election obj=new Election();
		try {
			obj.checkEligibity(12);
			}catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
	CheckCC obj1=new CheckCC();
			try {
				obj1.check("1212423434545364563456");
			} catch (CreditCardException e) {
				//TODO Auto generated catch block
				System.out.println(e.getMessage());
			}
	}

}
