package main;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import help.HelperException;
import test.DBMethods;
import test.PojoForDB;
import util.InputUtils;

public class PojoRunnerForDB {
	public static void main(String[] args) {
		final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		DBMethods dMethod=new DBMethods();	
		PojoForDB pMethod;
		boolean flag=false;
		do {
			logger.log(Level.INFO,"Enter the chioce..");
			int choice=InputUtils.getInteger(0);
			try {
			switch(choice) {
				case 0:{
					logger.log(Level.INFO,"Breaking execution..");
					flag=true;
					break;
				}
				case 1:{
					pMethod=new PojoForDB();
					logger.log(Level.INFO,"Enter the number of details ur going to enter..");
					int size=InputUtils.getInteger(0);
					for(int i=0;i<size;i++) {
						logger.log(Level.INFO,"enter the employee name");
						String name=InputUtils.getString();
						pMethod.setName(name);
						logger.log(Level.INFO,"enter the mobile number");
						long mobile=InputUtils.getLong();
						pMethod.setMobile(mobile);
						logger.log(Level.INFO,"enter the email id");
						String email=InputUtils.getString();
						pMethod.setEmail(email);
						logger.log(Level.INFO,"enter the department");
						String department=InputUtils.getString();
						pMethod.setDepartment(department);
						dMethod.insertDetailsUsingPojo(pMethod);
					}
					break;
				}
				case 2:{
					pMethod=new PojoForDB();
					logger.log(Level.INFO,"Enter the name..");
					String name=InputUtils.getString();
					pMethod.setName(name);
					List<PojoForDB> list=dMethod.getDetailsUsingPojoWithName(pMethod);
					Iterator<PojoForDB> it=list.iterator();
					while(it.hasNext()) {
						PojoForDB pojo=it.next();
			            System.out.println(pojo.getDepartment()+"\t"+pojo.getEmail()+"\t"+pojo.getId()+"\t"+pojo.getMobile()+"\t"+pojo.getName());
			        }
					break;
				}
				case 3:{
					pMethod=new PojoForDB();
					logger.log(Level.INFO,"Enter the number of id..");
					int id=InputUtils.getInteger(0);
					pMethod.setLimit(id);
					List<PojoForDB> list=dMethod.getDetailsUsingPojo(pMethod);
					Iterator<PojoForDB> it=list.iterator();
					while(it.hasNext()) {
						PojoForDB pojo=it.next();
			            System.out.println(pojo.getDepartment()+"\t"+pojo.getEmail()+"\t"+pojo.getId()+"\t"+pojo.getMobile()+"\t"+pojo.getName());
			        }
					break;
				}
				case 4:{
					pMethod=new PojoForDB();
					logger.log(Level.INFO,"enter the id");
					int id2=InputUtils.getInteger(0);
					logger.log(Level.INFO,"Enter the order like  asc|| desc");
					String order=InputUtils.getString();
					pMethod.setId(id2);
					List<PojoForDB> list=dMethod.getDetailsUsingPojoWithOrder(pMethod,order);
					Iterator<PojoForDB> it=list.iterator();
					while(it.hasNext()) {
						PojoForDB pojo=it.next();
			            System.out.println(pojo.getDepartment()+"\t"+pojo.getEmail()+"\t"+pojo.getId()+"\t"+pojo.getMobile()+"\t"+pojo.getName());
			        }					
					break;
				}
				default :{
					System.out.println("invaild input..");
					break;
				}
			}
			}
			catch(HelperException e) {
				e.printStackTrace();
			}
		}while(!flag);
	}
}
