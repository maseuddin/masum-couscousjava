package fileIO;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader r=new FileReader(("Upasana.txt"));//open
			int data=r.read();//only first character
			//loop through all the char until it reaches end of file
			while(data !=-1)
			{
				System.out.println((char)data);
				data=r.read();//read next character
			}
			//system.out.printIn(data);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
			