package constructor;

public class testperson {

	public static void main(String[] args) {
	person p1=new person();
	p1.name="Upasana";
	p1.age=32;
	p1.address="Bengaluru";
	p1.phone=12345;
	
	person p2=new person("Hilda", 25,"UK",345678);
	person p3=new person("Arifi", 24,"USA",444444);
	person p4=new person("kevin",36, null, 0);
	p4.address="london";
	p4.phone=345354;
	
	}
}
