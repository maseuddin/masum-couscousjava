package exceptions;

public class Shopping {
//handling the exception // take the responsibility of fixing
	public void addToCart()
	{
		try {
		String[] cart=new String[5];
		cart[5]="Mobile";
		}catch(Exception e) {}
		}
	//declaring the exception //I will pass the ownership to calling environment
	public void makePayment() throws Exception
	{
		int x=0;
		int y=0;
		int z=x/y;
	}
}
