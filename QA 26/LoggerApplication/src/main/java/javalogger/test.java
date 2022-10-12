package javalogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

	public static void main1(String[] args) {
		LogException logObj=new LogException();
		Logger log=Logger.getLogger("");
		try {
			logObj.divByZero();
		}catch(Exception e)
		{
			log.log(Level.WARNING, "Edith Div by zero");
		}
		try {
			logObj.arrayBound();
		}catch(Exception e)
		{
			log.log(Level.INFO, "Array Index out of bounds");
		}
		try {
				logObj.fileNotFound();;
			}catch(Exception e)
			{
				log.log(Level.SEVERE, "file not found");
}
		}
	}