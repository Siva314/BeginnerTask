package main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import help.HelperException;
import test.DBMethods;
import test.PojoForDB;
import util.InputUtils;

public class RunnerForDB {
	public static void main(String[] args) {
		final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		DBMethods db=new DBMethods();
		boolean flag=false;
		do {
			logger.log(Level.INFO,"enter the choice..");
			int choice=InputUtils.getInteger(0);
		try {
			switch(choice) {
			case 0:{
				logger.log(Level.INFO,"Execution breaked....");
				flag=true;
				break;
			}
			case 1:{
			db.createTable("Employee",1);
			break;
			}
			case 2:{
			logger.log(Level.INFO,"Enter the number of details your going to enter...");
			int number=InputUtils.getInteger(0);
			for(int i=0;i<number;i++) {
				logger.log(Level.INFO,"enter the employee name");
				String name=InputUtils.getString();
				logger.log(Level.INFO,"enter the mobile number");
				long mobile=InputUtils.getLong();
				logger.log(Level.INFO,"enter the email id");
				String email=InputUtils.getString();
				logger.log(Level.INFO,"enter the department");
				String department=InputUtils.getString();
				db.insertTable(name, mobile, email, department);
			}
			break;
			}
			case 3:{
				logger.log(Level.INFO,"enter the input..");
				String input=InputUtils.getString();
				List<Map<String,Object>> list=db.getDetails(input);
				Iterator<Map<String,Object>> it=list.iterator();
				while(it.hasNext()) {
		            System.out.print(it.next()+" \n");
		        }
			break;
			}
			case 4:{
				logger.log(Level.INFO,"enter the employee id..");
				int id=InputUtils.getInteger(0);
				String columnInput;
				boolean test=true;
				do {
				logger.log(Level.INFO,"enter the column name..\n1.NAME\n2.DEPARTMENT\n3.MOBILE \n4.EMAIL..");
				int inputChoice=InputUtils.getInteger(0);
				if(inputChoice<5) {
					columnInput=(inputChoice==1)?"NAME":(inputChoice==2)?"DEPARTMENT":(inputChoice==3)?"MOBILE":(inputChoice==4)?"EMAIL":"INVAILD";
					if(columnInput.equals("MOBILE")) {
						logger.log(Level.INFO,"enter the value to change..");
						long inputValue=InputUtils.getLong();
						db.updateTableValue(columnInput, inputValue, id);
						test=false;
					}
					else {
						logger.log(Level.INFO,"enter the value..");
						String inputValue=InputUtils.getString();
						db.updateTableValue(columnInput, inputValue, id);
						test=false;
					}
				}
				else {
					logger.log(Level.INFO,"enter the valid input..");
				}
					
				}while(test);
				break;
			}
			case 5:{
				logger.log(Level.INFO,"enter the id");
				int id=InputUtils.getInteger(0);
				List<Map<String,Object>> list=db.getFirstNDetails(id);
				Iterator<Map<String,Object>> it=list.iterator();
				while(it.hasNext()) {
		            System.out.print(it.next()+" \n");
		        }
				break;
			}
			case 6:{
				logger.log(Level.INFO,"enter the id");
				int id=InputUtils.getInteger(0);
				logger.log(Level.INFO,"Enter the order like  asc|| desc");
				String order=InputUtils.getString();
				List<Map<String,Object>> list=db.getFirstNDetailsWithOrder(id,order);
				Iterator<Map<String,Object>> it=list.iterator();
				while(it.hasNext()) {
		            System.out.print(it.next()+" \n");
		        }
				break;
			}
			case 7:{
				logger.log(Level.INFO,"enter the id");
				int id=InputUtils.getInteger(0);
				db.deleteRecordInTable(id);
				logger.log(Level.INFO,"enter the id");
				int id2=InputUtils.getInteger(0);
				List<Map<String,Object>> list=db.getFirstNDetails(id2);
				Iterator<Map<String,Object>> it=list.iterator();
				while(it.hasNext()) {
		            System.out.print(it.next()+" \n");
		        }
				break;
			}
			case 9:{
				logger.log(Level.INFO,"enter the table name");
				String tName=InputUtils.getString();
				db.createTable(tName,2);
				break;
			}
			case 10:{
				PojoForDB pojo=new PojoForDB();
				logger.log(Level.INFO,"Enter the number of details your going to enter...");
				int number=InputUtils.getInteger(0);
				for(int i=0;i<number;i++) {
					logger.log(Level.INFO,"enter the relation name");
					String name=InputUtils.getString();
					pojo.setRelationName(name);;
					logger.log(Level.INFO,"enter the mobile number");
					int Age=InputUtils.getInteger(0);
					pojo.setAge(Age);
					logger.log(Level.INFO,"enter the relationship");
					String relation=InputUtils.getString();
					pojo.setRelationShip(relation);;
					logger.log(Level.INFO,"enter the id");
					int id=InputUtils.getInteger(0);
					pojo.setId(id);
					db.insertInDependentTableUsingPojo(pojo);
				}
				break;
			}
			case 11:{
				PojoForDB pojo=new PojoForDB();
				logger.log(Level.INFO,"enter the employee id");
				int id=InputUtils.getInteger(0);
				pojo.setId(id);
				List<PojoForDB> list=db.getDetailsInDependentTableUsingPojo(pojo);
				Iterator<PojoForDB> it=list.iterator();
				while(it.hasNext()) {
		            System.out.print(it.next()+" \n");
		        }
				break;
			}
			case 12:{
				List<Map<String,Object>> list=db.getNDetailsUsingLimit(3,"asc");
				Iterator<Map<String,Object>> it=list.iterator();
				while(it.hasNext()) {
		            System.out.print(it.next()+" \n");
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
