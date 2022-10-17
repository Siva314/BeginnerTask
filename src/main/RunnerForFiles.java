package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import help.HelperException;
import task8.DateAndTime;
import task8.RainbowColors;
import task8.SingletonSample;
import test.FilesMethod;
import test.SampleCheck;
import test.PojoNo6;
import util.InputUtils;

public class RunnerForFiles {
	public static void readPropertiesInFile(Properties porperties,String fileName)throws FileNotFoundException,IOException {
		InputStream inStream=new FileInputStream(fileName);
		porperties.load(inStream);
		porperties.list(System.out);
		inStream.close();
	}
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		FilesMethod methods=new FilesMethod();
    	DateAndTime date=new DateAndTime();
		boolean flag = true;
        do {
        	logger.log(Level.INFO,"----------------------------------------------------\nEnter the Choice from 0 to 10\n0 for Exit");
            int Choice = InputUtils.getInteger(0);
            try {
                switch (Choice) {
                    case 0: {
                    	logger.log(Level.INFO,"Thank you..");
                        flag = false;
                        break;
                    }
                    case 1:{
                    	logger.log(Level.INFO, "Enter the File name..");
                    	String fileName=InputUtils.getString();
                    	File file=methods.createFileStream(fileName);
                    	logger.log(Level.INFO,"Enter the number strings ");
                    	int length=InputUtils.getInteger(0);
                    	String[] inputContent=new String[length];
                    	for(int i=0;i<length;i++) {
                    	logger.log(Level.INFO,"Enter the contents name..");
                    	inputContent[i]=InputUtils.getString();
                    	}
                    	methods.writeInFile(file,inputContent);
                    	methods.readFile(fileName);
                    	break;
                    }
                    case 2:{
                    	Properties properties=methods.getProperties();
                    	String[] key= {"name","Id","case","files","Number"};
                    	String[] value= {"siva","11","2","task","Ex2"};
                    	for(int i=0;i<key.length;i++){
                    	methods.setValuesInPorperties(properties,key[i],value[i]);  
                    	}    
                    	logger.log(Level.INFO,"Enter the File name..");
                    	String fileName=InputUtils.getString();
                    	methods.storeInFile(properties, fileName);
                    	break;
                    }
                    case 3:{
                    	Properties properties=methods.getProperties();
                    	logger.log(Level.INFO,"Enter the File name..");
                    	String fileName=InputUtils.getString();
                    	readPropertiesInFile(properties, fileName);
                    	break;
                    }
                    case 4:{
                    	logger.log(Level.INFO,"enter the filePath..");
                    	String filePath=InputUtils.getString();
                    	boolean checkPoint=methods.makeDirectory(filePath);
                    	logger.log(Level.INFO,"enter the filename with .txt..");
                    	String fileName=InputUtils.getString();
                    	if(checkPoint) {
                    	String fileNewPath=filePath+"/"+fileName;
                    	File newFile=methods.createFileStream(fileNewPath);
                    	logger.log(Level.INFO,"Enter the number strings ");
                    	int length=InputUtils.getInteger(0);
                    	String[] inputContent1= new String[length];
                    	for(int i=0;i<length;i++) {
                    	logger.log(Level.INFO,"Enter the contents name..");
                    	inputContent1[i]=InputUtils.getString();
                    	}
                    	methods.writeInFile(newFile, inputContent1);
                    	Properties properties=new Properties();
                    	String[] key= {"name","Id","case","files","Number"};
                    	String[] value= {"siva","11","2","task","Ex2"};
                    	for(int i=0;i<key.length;i++){
                    	methods.setValuesInPorperties(properties,key[i],value[i]);  
                    	}    
                    	logger.log(Level.INFO,"Enter the File name..");
                    	String fileName1=InputUtils.getString();
                    	methods.storeInFile(properties, fileName1);
                    	readPropertiesInFile(properties, fileName1); 
                    	}
                    	else {
                    		logger.log(Level.INFO,"Can't make directory...");
                    	}
                    	break;
                    }
                    case 5:{
                    	SampleCheck sample=new SampleCheck("siva");
                    	logger.log(Level.INFO,""+sample);
                    	break;
                    }
                    case 6:{
                    	PojoNo6 number6=new PojoNo6("siva",11);
                    	logger.log(Level.INFO,""+number6);
                    	break;
                    }
                    case 7:{
                    	PojoNo6 number7=new PojoNo6();
                    	number7.setName("zoho");
                    	number7.setId(12);
                    	logger.log(Level.INFO,""+number7.getString());
                    	logger.log(Level.INFO,""+number7.getId());
                    	break;
                    }
                    case 9:{
                    	for(RainbowColors color:RainbowColors.values()) {
                    		logger.log(Level.INFO,"Color is "+color+" color code is "+color.getValue());
                    		logger.log(Level.INFO,"Index value is "+color.ordinal());
                    	}
                    	break;
                    }
                    case 10:{
                    	SingletonSample sampleSingle=SingletonSample.getInstance();
                    	SingletonSample sampleSingle1=SingletonSample.getInstance();
                    	sampleSingle.setName("siva",22);
                    	sampleSingle.printMethod();
                    	sampleSingle1.printMethod();
                    	break;
                    }
                    case 11:{
                    	logger.log(Level.INFO,"enter the time format like(dd-MMM-yyyy  HH:mm:SS)..");
                    	String format=InputUtils.getString();
                    	String time=date.getLocalDate(format);
                    	logger.log(Level.INFO,time);
                    	break;
                    }
                    case 12:{
                    	Long milliSecond=date.getMilliSecond();
                    	logger.log(Level.INFO,""+milliSecond);
                    	break;
                    }
                    case 13:{
                    	logger.log(Level.INFO,"enter the time format like(dd-MMM-yyyy)");
                    	String format=InputUtils.getString();
                    	String time=date.getTimeWithTimeZone("Europe/London",format);
                    	String time1=date.getTimeWithTimeZone("America/New_York",format);
                    	logger.log(Level.INFO,time);
                    	logger.log(Level.INFO,time1);
                    	break;
                    }
                    case 14:{
//                    	Long mili=date.getMilliSecond();
                    	logger.log(Level.INFO,"enter the time zone..");
                    	String format=InputUtils.getString();
                    	logger.log(Level.INFO,"enter the value");
                    	long mili=InputUtils.getLong();
//                    	Date date3=new Date();
//                    	long mili=date3.getTime();
                    	DayOfWeek date2=date.getDateOfDay(mili,format);
                    	logger.log(Level.INFO,""+date2);
                    	Month month=date.getMonth(mili,format);
                    	logger.log(Level.INFO,""+month);
                    	int year=date.getYear(mili,format);
                    	logger.log(Level.INFO,""+year);
                    	break;
                    }
                }
            }
            catch(HelperException e) {
            	e.printStackTrace();
            }
            } while (flag);
	}
}
