package inheritence;

public class Car {
private int yearOfMake;
private String engineNumber,type;
public int getYearOfMaking() {
	return yearOfMake;
}
public String getEngineNumber() {
	return engineNumber;
}
public String getType() {
	return type;
}
public void setYearOfMake(int yearOfMake) {
	this.yearOfMake=yearOfMake;
}
public void setEngineNumber(String engineNumber) {
	this.engineNumber=engineNumber;
}
public void setType(String type) {
	this.type=type;
}
public String Maintenance() {
	return "Car under Maintenance..";
}
public Car(String inputString) {
	System.out.println(inputString);
}
}
