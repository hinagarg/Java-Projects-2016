/**
 * 
 */
package com.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * @author hgarg1
 *
 */
public class QuickStart {
	
	static Logger log = Logger.getLogger("example");
	static Logger root = Logger.getRootLogger();
	
	public static void main(String[] args){
		
		log.setAdditivity(false);
		BasicConfigurator.configure();
		
		PatternLayout layout = new PatternLayout("%d [%t] %-5p %c %x - %m%n");
		
		log.addAppender(new ConsoleAppender(layout));
		
		try{
			
			log.info("Inside Try Block");
		}
		catch(Exception e){
			log.warn("Exception Message");
		}
	}

}
