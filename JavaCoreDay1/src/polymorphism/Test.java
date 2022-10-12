package polymorphism;

public class Test {

	public static void main(String[] args) {
	Liquid l=new Liquid();
	milk m=new milk();
	tea t=new tea();
	coffee c=new coffee();
	mug mg=new mug();
	mg.addLiquid(l);
	mg.addLiquid(m);
	mg.addLiquid(t);
	mg.addLiquid(c);

}
}
