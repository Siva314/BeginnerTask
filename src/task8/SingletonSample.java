package task8;

public class SingletonSample {
	private SingletonSample() {
		
	}
	private static SingletonSample sample=new SingletonSample();
	private int age;
	private String name;
	public static SingletonSample getInstance() {
		return sample;
	}
	public void setName(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void printMethod() {
		System.out.println(name+" "+age);
	}
}
