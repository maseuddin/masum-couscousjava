package encapsulation;

public class Testmobile {
	public static void main(String[] args) {
		Mobile x= new Mobile();
		x.setBrand("Apple");
		System.out.println(x.getBrand());
		x.setRam(8);
		System.out.println(x.getRAM());
	}
}
