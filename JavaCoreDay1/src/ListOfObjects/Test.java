package ListOfObjects;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Product prod=new Product("Bluetooth",50,10,"Boat");
		System.out.println(prod.toString());
		Product prod2=new Product("TV",1000,5,"Apple");
		System.out.println(prod.toString());
		Product prod3=new Product("Bluetooth",50,10,"Sony");
		System.out.println(prod.toString());
		Product prod4=new Product("Bluetooth",50,10,"Digitech");
		System.out.println(prod.toString());
		ArrayList<Product> list=new ArrayList();
		list.add(prod);
		list.add(prod2);
		list.add(prod3);
		list.add(prod4);
		list.add(new Product("Lipstick",20,100,"Mac"));
		System.out.println(list);

}
}