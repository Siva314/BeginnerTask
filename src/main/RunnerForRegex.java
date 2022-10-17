package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import test.RegexMethod;
import util.InputUtils;

public class RunnerForRegex {
	public static void main(String[] args) {
		RegexMethod regex=new RegexMethod();
		final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		boolean flag=true;
		do {
			logger.log(Level.INFO,"Enter the choice");
			int choice=InputUtils.getInteger(0);
			switch(choice) {
			case 0:{
				logger.log(Level.INFO,"Execution breaked..");
				flag=false;
				break;
			}
			case 1:{
			logger.log(Level.INFO,"Enter the mobile number");
			String checkString=InputUtils.getString();
			boolean mobile=regex.checkMobileNumber(checkString);
			System.out.println(mobile);
			break;
			}
			case 2:{
				logger.log(Level.INFO,"");
			}
				break;
			}
		}while(flag);
	}
}
