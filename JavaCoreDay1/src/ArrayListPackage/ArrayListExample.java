package ArrayListPackage;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		int[] x=new int[5];
		ArrayList list=new ArrayList();
		list.add("Upasana");
		list.add(12.55);
		list.add(1234);
		list.add(true);
		list.add('Y');
		System.out.println(list);
		
		ArrayList<String> names=new ArrayList();
		//ArrayList<Strings> names=new ArrayList<Strings>();
		names.add("Upasana");
		names.add("Hilda");
		names.add("Arifi");
		names.add("Masum");
		names.add("Hasan");
		names.add("Kev");
		names.set(2, "AddedAt2");
		names.remove(1);
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(0));
		
	}

}
