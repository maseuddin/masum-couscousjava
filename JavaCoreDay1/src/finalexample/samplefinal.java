package finalexample;

public class samplefinal {

	final int x=100; //intiallise at the time of delclaration
	final int y;
	static final int big=555;
	
	public samplefinal() {// in the constructor
		this.y=333;
}
	public samplefinal(int temp) {
	this.y=temp;
	}
	public samplefinal(int a,int b) {
	b++;
	this.y=a;
}

}
