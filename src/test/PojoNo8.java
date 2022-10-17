package test;

public class PojoNo8 {
	public PojoNo8() {
	}
	private String name;
	private int id;
	public PojoNo8(String name,int id) {
		setString(name);
		setId(id);
	}
	
	public void setString(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getString() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return getClass().getName()+"  Name "+getString()+" Id "+getId();
	}
}
