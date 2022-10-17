package main;
import inheritence.*;
import java.util.Scanner;
public class RunnerForInheritence {
	static Scanner sc=new Scanner(System.in);
	public static String getString() {
		String inputString=sc.next();
		return inputString;
	} 
	public static int getInteger(int Integer) {
		boolean flag=true;
		while(flag) {
			if(sc.hasNextInt()) {
				Integer=sc.nextInt();
				flag=false;
			}
			else {
				sc.next();
				System.out.println("Enter the integer only..");
			}
		}
		return Integer;
	}
	public static String acceptCarObject(Car object) {
		if(object instanceof Swift) {
			return "Hatch";
		}
		else if(object instanceof XUV) {
			return "SUV";
		}
		else if(object instanceof SCross) {
			return "Sedan";
		}
		else {
			return "Invaild object..";
		}
	}
	public static String checkSwiftObjects(Swift object) {
		if(object instanceof Swift) {
			return "This object is Belongs to Swift class..";
		}
		else {
			return "This object does not belongs to Swift class";
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the chioce form 2 to 10\n 1 for exit ");
		int choice=getInteger(0);
		boolean flag=true;
		do {
		switch(choice) {
		case 1:{
			System.out.println("Execution Stopped..");
			flag=false;
			break;
		}
		case 2:{
			Swift swift=new Swift();
			System.out.println("number of seats..");
			swift.setSeats(getInteger(0));
			System.out.println("number of airbags");
			swift.setAirbags(getInteger(0));
			System.out.println("Enter the Color");
			swift.setColor(getString());
			System.out.println("enter the model");
			swift.setModel(getString());
			System.out.println("Swift car has "+swift.getSeats()+" seats "+swift.getAirbags()+" Airbags "+ swift.getColor()+" colour "+swift.getModel()+" modelname");
			break;
		}
		case 3:{
			SCross scross=new SCross();
			System.out.println("Year of making..");
			scross.setYearOfMake(getInteger(0));
			System.out.println("number of seats..");
			scross.setSeats(getInteger(0));
			System.out.println("number of airbags");
			scross.setAirbags(getInteger(0));
			System.out.println("Enter the Color");
			scross.setColor(getString());
			System.out.println("enter the engine number..");
			scross.setEngineNumber(getString());
			System.out.println("enter the type (example: sedan, hatchback&suv)");
			scross.setType(getString());
			System.out.println("enter the model");
			scross.setModel(getString());
			System.out.println("year of making is "+scross.getYearOfMaking()+" engine number is "+scross.getEngineNumber()+" car types is "+scross.getType());
			System.out.println("Swift car has "+scross.getSeats()+" seats "+scross.getAirbags()+" Airbags "+ scross.getColor()+" colour "+scross.getModel()+" modelname");
			break;
		}
		case 4:{
			//Swift swift=new Swift();
			XUV swift=new XUV();
			//SCross swift=new SCross();
			String result=acceptCarObject(swift);
			System.out.println(result);
			break;
		}
		case 5:{
			//Car swift=new Swift();
			Swift swift=new Swift();
			//XUV swift=new XUV();
			//SCross swift=new SCross();
			String result=checkSwiftObjects(swift);
			System.out.println(result);
			break;
		}
		case 6:{
			//SCross scross=new SCross();
			//Car scross=new SCross();
			//Car scross=new Car();
			//Swift scross=new Swift();
			XUV scross=new XUV();
			String result=scross.Maintenance();
			System.out.println(result);
			break;
		}
		case 7:{
			XUV xuv=new XUV();
			break;
		}
		case 8:{
			//BirdAbstract birdClass=new BirdAbstract();
			ParrotMod parrot=new ParrotMod();
			parrot.fly();
			parrot.speak();
			break;
		}
		case 9:{
			Duck duck=new Duck();
			duck.fly();
			duck.speak();
			break;
		}
		default:{
			System.out.println("Invaild input..");
			break;
		}
		}
		}while(flag);
	}
}
