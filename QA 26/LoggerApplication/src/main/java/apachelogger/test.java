package apachelogger;

import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class test {
	public static void main(String[] args) {
		Logger LOGGER=LogManager.getLogger();
		LOGGER.info("This is informational log");
		LOGGER.warn("This is warning");
		LOGGER.fatal("This is fatal, must be solved");
		try {
			int z=10/0;
			FileReader fr=new FileReader("upasana.txt");
		}catch(Exception e)
		{
			LOGGER.error(e.getMessage());
			LOGGER.catching(e);
			LOGGER.debug(e.getMessage());
		}
	}
}