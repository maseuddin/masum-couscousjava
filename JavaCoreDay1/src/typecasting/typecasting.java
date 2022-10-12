package typecasting;

public class typecasting {

	public static void main(String[] args) {
	int x;//32 bit of data
	long y=2352345L;//64bit of data
	x=(int)y;
	System.out.println(x);
	
	float m=234.66f;
	int n=(int)m;
	System.out.println(n);
	
	//String name="Upasana"
	//char nn=(char)name;
	//
	//char k='Y'
	//String l=(String)k;
	
	char[] h= {'U' , 'P', 'S'};
	
	String temp=h.toString();
	System.out.println(temp);
			
			char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
    String helloString = new String(helloArray); 
    System.out.println(helloString);
	

    {

}
	}
}
