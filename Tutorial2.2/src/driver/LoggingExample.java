package driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample {

	private static final Logger logger = LogManager.getLogger(LoggingExample.class);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logger.info("Test info message");
		logger.debug("Test debug message");
		logger.error("Test warning message");
		logger.fatal("Test fatal message");
		logger.trace("Test trace message");
	}

}
