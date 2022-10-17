package test;

public class PojoForDB {
	private String name,email,department,relationship,relationName;
	private long mobile;
	private int id,limit,age;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDepartment() {
		return department;
	}
	public long getMobile() {
		return mobile;
	}
	public int getLimit() {
		return limit;
	}
	public String getRelationShip() {
		return relationship;
	}
	public String getRelationName() {
		return relationName;
	}
	public int getAge() {
		return age;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setMobile(long mobile) {
		this.mobile=mobile;
	}
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public void setRelationName(String relationName) {
		this.relationName=relationName;
	}
	public void setRelationShip(String relationShip) {
		this.relationship=relationShip;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
