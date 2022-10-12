package methodoverloading;

public class sample {
	//method-overloading when we have more than one method with same name
	//but they differ in
	//no of argument
	//data of argument
	//order of argument
	public void sum(int x, int y) {}
	public void sum(float x, float y) {}
	public void sum(int x, float y) {}
	public void sum(float x, int y) {}
	public void sum(double x, double y, double z) {}
	public void sum(int x, int y, int z) {}
}
