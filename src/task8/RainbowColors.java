package task8;

public enum RainbowColors {
	VOILET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
	final int value;
	private RainbowColors(int number) {
		this.value=number;
	}
	public int getValue() {
		return value;
	}
}
