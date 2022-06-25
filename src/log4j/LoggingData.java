package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggingData 
{
	private static org.apache.log4j.Logger myLogger = Logger.getLogger(LoggingData.class);

	public static void main (String[] args) 
	{
		 BasicConfigurator.configure();
		
		 myLogger.setLevel(Level.INFO);
         myLogger.info("1....iam inside first method");
         myLogger.warn("i am inside warning method");
         myLogger.error("3...i am inside excption method");
         myLogger.fatal("i am inside fatal method");
         
         BasicConfigurator.configure();
         
         System.out.println("***********");
         
         opencity();
         
	}

	 static void opencity()
	 {
		 myLogger.info("2...iam inside first method");
		 
         display();
	 }
	
    static void display()
    {
    	myLogger.error("4...iam inside excption method");
    }
}
