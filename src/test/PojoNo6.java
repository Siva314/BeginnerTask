package test;

public class PojoNo6 {
	public PojoNo6() {
		
	}
	private String name;
	private int id;
	public PojoNo6(String name,int id) {
		setName(name);
		setId(id);
	}
	public void setName(String name) {
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
	@Override
	public String toString() {
		return getClass().getName()+"  Name "+getString()+" Id "+getId();
	}
}
