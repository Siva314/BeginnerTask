package test;


public class SampleCheck {
	private String name;
	public SampleCheck(String name)  {
		this.name=name;		
	}
	@Override
	public String toString() {
		return getClass().getName()+" "+name;
	}
}
