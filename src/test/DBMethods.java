package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.ResultSetMetaData;

import help.HelperException;
import util.CheckUtils;

public class DBMethods {
	
	private Connection connection() throws HelperException {
		String url="jdbc:mysql://localhost/incubationDB";
		String uName="siva";
		String password="SIVA@314";
		Connection conn = null;
		try {
			conn=DriverManager.getConnection(url, uName, password);
		} catch (SQLException e) {
			throw new HelperException("Didn't connect to the server"+e);
		} 
		return conn;
	}
	
	private String getQuery(String tableName, int number) {
		String query=null;
		switch(number) {
		case 1:{
			query= "CREATE TABLE "+tableName+" (EMPLOYEE_ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,"+"NAME VARCHAR(40),"+"MOBILE BIGINT,"+"EMAIL VARCHAR(50),"+"DEPARTMENT VARCHAR(25))";
			break;
		}
		case 2:{
			query="CREATE TABLE "+tableName+" (NAME VARCHAR(40),"+" AGE INTEGER ,"+" RELATIONSHIP VARCHAR(40) ,"+" EMPLOYEEID INTEGER ,"+" DEPENDENTID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,"
		+" FOREIGN KEY(EMPLOYEEID) REFERENCES Employee(EMPLOYEE_ID))";
			break;
		}
		}
		return query;
	}
	
	private List<Map<String,Object>> getResultUsingMap(ResultSet tempSet) throws HelperException{
		try(ResultSet resultSet=tempSet){			
			ResultSetMetaData rsmet=resultSet.getMetaData();
			int columns=rsmet.getColumnCount();
			List<Map<String,Object>> outerMap=new ArrayList<Map<String,Object>>();
			while(resultSet.next()) {
				Map<String,Object> innerMap=new HashMap<String,Object>();
				for(int i=1;i<=columns;i++) {
					innerMap.put(rsmet.getColumnLabel(i), resultSet.getObject(i));
				}				
				outerMap.add(innerMap);
			}
			return outerMap;
		} catch (SQLException e) {
			throw new HelperException("Retrieve didn't complete "+e);
		}
	}
	
	private List<PojoForDB> getDetailsUsingPojo(ResultSet tempSet) throws HelperException{
		List<PojoForDB> list=new ArrayList<PojoForDB>();
		try(ResultSet resultSet=tempSet){
		while(resultSet.next()) {
			PojoForDB pojo=new PojoForDB();
			pojo.setId(resultSet.getInt("EMPLOYEE_ID"));
			pojo.setName(resultSet.getString("NAME"));
			pojo.setMobile(resultSet.getLong("MOBILE"));
			pojo.setDepartment(resultSet.getString("DEPARTMENT"));
			pojo.setEmail(resultSet.getString("EMAIL"));
			list.add(pojo);
		}
		return list;
		} catch (SQLException e) {
			throw new HelperException(e);
		}
	}
	
	public void createTable(String tableName,int number) throws HelperException {
		String query=getQuery(tableName,number);
		try(Connection conn=connection();Statement stmt=conn.createStatement()){			
			stmt.execute(query);
		} 
		catch (SQLException e) {
			throw new HelperException(e);
		} 		
	}
	

	public void insertTable(String name,long mobile,String email,String department) throws HelperException {		
			String query="insert into Employee (name,mobile,email,department) values (?,?,?,?)";
			
			try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setString(1, name);
			statement.setLong(2, mobile);
			statement.setString(3, email);
			statement.setString(4, department);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new HelperException("Dind't insert the data.."+e);
		}
	}
	
	public List<Map<String,Object>> getDetails(String name) throws HelperException {
		String query="select * from Employee where name = ?";
		ResultSet resultSet=null;
		try (Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setString(1, name);
			resultSet=statement.executeQuery();
			return getResultUsingMap(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		}
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}	
	
	public void updateTableValue(String columnName,String value,int id) throws HelperException {
		String query="update Employee set "+columnName+"=? where EMPLOYEE_ID=?";
		try (Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setString(1, value);
			statement.setInt(2, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new HelperException(e);
		}
	}
	public void updateTableValue(String columnName,long value,int id) throws HelperException {
		String query="update Employee set "+columnName+"=? where EMPLOYEE_ID=?";
		try (Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setLong(1, value);
			statement.setInt(2, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new HelperException(e);
		}
	}
	
	public List<Map<String,Object>> getFirstNDetails(int lastId) throws HelperException {
		String query="select * from Employee limit ?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)) {
			statement.setInt(1, lastId);
			resultSet=statement.executeQuery();
			return getResultUsingMap(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		}
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public List<Map<String,Object>> getFirstNDetailsWithOrder(int lastId,String order) throws HelperException {
		String query="select * from Employee order by name "+order+" limit ?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)) {
			statement.setInt(1, lastId);
			resultSet=statement.executeQuery();
			return getResultUsingMap(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		}
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public void deleteRecordInTable(int id) throws HelperException {
		String query="delete from Employee where employee_id=?";
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new HelperException(e);
		}
	}
	
	public void insertDetailsUsingPojo(PojoForDB pojo) throws HelperException {
		CheckUtils.nullCheck(pojo);
		insertTable(pojo.getName(), pojo.getMobile(), pojo.getEmail(), pojo.getDepartment());
	}
	
	public List<PojoForDB> getDetailsUsingPojo(PojoForDB pojoDB) throws HelperException{
		CheckUtils.nullCheck(pojoDB);
		String query="Select * from Employee limit ?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setInt(1, pojoDB.getLimit());
			resultSet=statement.executeQuery();
			return getDetailsUsingPojo(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		}
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public List<PojoForDB> getDetailsUsingPojoWithOrder(PojoForDB pojoDB,String order) throws HelperException{
		CheckUtils.nullCheck(pojoDB);
		CheckUtils.nullCheck(order);
		String query="Select * from Employee order by name "+order+" limit ?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setInt(1, pojoDB.getId());
			resultSet=statement.executeQuery();
			return getDetailsUsingPojo(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		}
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public List<PojoForDB> getDetailsUsingPojoWithName(PojoForDB pojoDB) throws HelperException{
		CheckUtils.nullCheck(pojoDB);
		String query="Select * from Employee where NAME=?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setString(1, pojoDB.getName());
			resultSet=statement.executeQuery();
			return getDetailsUsingPojo(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		}
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public void insertInDependentTable(String name,int age,String relation,int employeeId) throws HelperException {
		String query="INSERT INTO PersonalDetails (NAME,AGE,RELATIONSHIP,EMPLOYEEID) VALUES(?,?,?,?)";
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setString(1, name);
			statement.setInt(2, age);
			statement.setString(3, relation);
			statement.setInt(4, employeeId);
			statement.execute();
		} catch (SQLException e) {
			throw new HelperException(e);
		}
	}
	
	public void insertInDependentTableUsingPojo(PojoForDB pojo) throws HelperException {
		String query="INSERT INTO PersonalDetails (NAME,AGE,RELATIONSHIP,EMPLOYEEID) VALUES(?,?,?,?)";
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setString(1, pojo.getRelationName());
			statement.setInt(2, pojo.getAge());
			statement.setString(3, pojo.getRelationShip());
			statement.setInt(4, pojo.getId());
			statement.execute();
		} catch (SQLException e) {
			throw new HelperException(e);
		}
	}
	
	public List<Map<String,Object>> getDetailsInDependentTable(int employeeId) throws HelperException{
		String query="SELECT Employee.EMPLOYEE_ID,Employee.NAME,PersonalDetails.NAME,PersonalDetails.Age,PersonalDetails.RELATIONSHIP FROM Employee INNER JOIN PersonalDetails ON Employee.EMPLOYEE_ID=PersonalDetails.EMPLOYEEID WHERE Employee.EMPLOYEE_ID=?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setInt(1, employeeId);
			resultSet = statement.executeQuery();
			return getResultUsingMap(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		} 
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public List<PojoForDB> getDetailsInDependentTableUsingPojo(PojoForDB pojoDB) throws HelperException{
		String query="SELECT Employee.EMPLOYEE_ID,Employee.NAME,PersonalDetails.NAME,PersonalDetails.Age,PersonalDetails.RELATIONSHIP FROM Employee INNER JOIN PersonalDetails ON Employee.EMPLOYEE_ID=PersonalDetails.EMPLOYEEID WHERE Employee.EMPLOYEE_ID=?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setInt(1, pojoDB.getId());
			resultSet = statement.executeQuery();
			return getDetailsUsingPojo(resultSet);
		} catch (SQLException e) {
			throw new HelperException(e);
		} 
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
	
	private StringBuilder getSubQuery(ResultSet tempSet) throws HelperException {
		try(ResultSet resultSet=tempSet){
			List<Integer> list=new ArrayList<Integer>();
			while(resultSet.next()) {
				int temp=resultSet.getInt(1);
				list.add(temp);
			}
			StringBuilder builder=getBuilder(list);
			return builder;
		} catch (SQLException e) {
			throw new HelperException(e);
		}
	}
	private StringBuilder getBuilder(List<Integer> list) {
		StringBuilder builder=new StringBuilder();
		int size=list.size();
		builder.append(list.get(0));
		if(size>1) {
			for(int i=1;i<size;i++) {
				builder.append(",");
				builder.append(list.get(i));
			}
		}
		return builder;
	}
	
	public List<Map<String,Object>> getNDetailsUsingLimit(int limit,String order) throws HelperException{
		String query="SELECT EMPLOYEE_ID FROM Employee order by name "+order+" LIMIT ?";
		ResultSet resultSet=null;
		try(Connection conn=connection();PreparedStatement statement=conn.prepareStatement(query)){
			statement.setInt(1, limit);
			resultSet=statement.executeQuery();
			StringBuilder builder=getSubQuery(resultSet);
			String query2="SELECT Employee.EMPLOYEE_ID,Employee.NAME,PersonalDetails.NAME,PersonalDetails.RELATIONSHIP,"
					+ "PersonalDetails.AGE FROM Employee INNER JOIN PersonalDetails ON Employee.EMPLOYEE_ID=PersonalDetails.EMPLOYEEID "
					+ "WHERE Employee.EMPLOYEE_ID IN ("+builder+")";
			try(PreparedStatement statement2=conn.prepareStatement(query2)){
				resultSet=null;
				resultSet=statement2.executeQuery();
				return getResultUsingMap(resultSet);
			}
		} catch (SQLException e) {
			throw new HelperException(e);
		}
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}
}

//subquery method need to split