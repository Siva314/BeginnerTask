package inheritence;

public class ParrotMod extends BirdAbstract{
	@Override
	public void fly() {
		System.out.println("Parrot fly's..");
	}
	@Override
	public void speak() {
		System.out.println("Parrot Speaking..");
	}
}
