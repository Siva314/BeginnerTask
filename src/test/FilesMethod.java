package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;


import help.HelperException;
import util.CheckUtils;

public class FilesMethod {
	
	public File createFileStream(String fileName) throws HelperException, FileNotFoundException {
		CheckUtils.nullCheck(fileName);
		return new File(fileName);
		 
	}
	public Properties getProperties() {
		return new Properties();
	}
	public void writeInFile(File file,String... inputString) throws HelperException {
		CheckUtils.nullCheck(inputString);		
		try(FileWriter fileWriter=new FileWriter(file,true)){
			for(int i=0;i<inputString.length;i++) {
				fileWriter.write(inputString[i]);
			}
		}
		catch(IOException e) {
			throw new HelperException("IOException occured.."+e);
		}
		
	}
	public void readFile(String fileName)throws HelperException {
		 String fileString;
         try( BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
         while ((fileString = reader.readLine()) != null) {
             System.out.println(fileString);
         }
         }
         catch(FileNotFoundException  exception) {
        	 throw new HelperException("File not found in the given path");
         }
         catch(IOException exception){
 			throw new HelperException("IOException occured.."+exception);
 		}
	}
	
	public void setValuesInPorperties(Properties porperties,String key,String value) {
		porperties.setProperty(key, value);
	}
	
	public void storeInFile(Properties porperties,String fileName) throws FileNotFoundException,IOException, HelperException {
		CheckUtils.nullCheck(fileName);		
		try(OutputStream outStream=new FileOutputStream(new File(fileName))) {
		porperties.store(outStream, "comments");
		}
		catch(FileNotFoundException  exception) {
       	 throw new HelperException("File not found in the given path");
        }
        catch(IOException exception){
			throw new HelperException("IOException occured.."+exception);
		}
	}
	
	public boolean makeDirectory(String filePath) throws FileNotFoundException, HelperException {
		CheckUtils.nullCheck(filePath);
		File file=new File(filePath);
    	return file.mkdir();
	}
}
