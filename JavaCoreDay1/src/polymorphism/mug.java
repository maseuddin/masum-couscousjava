package polymorphism;

public class mug {
	public void addLiquid(Liquid x)
	{
		if(x instanceof milk)
			System.out.println("swirling milk");
		else if(x instanceof tea)
			System.out.println("swirling tea");
		else if(x instanceof coffee)
			System.out.println("swirling coffee");
		else
			System.out.println("swirling some liquid");
}
}