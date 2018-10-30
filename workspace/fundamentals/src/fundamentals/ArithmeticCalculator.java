package fundamentals;

public class ArithmeticCalculator {

	private int x;
	private int y;

	public ArithmeticCalculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int add() {
		return x + y;
	}

	public static int add (int x, int y){
		return x + y;
	}

	public static int subtract (int x, int y){
		return x - y;
	}

	public static int multiply (int x, int y){
		return x * y;
	}

	public static int divide (int x, int y){
		if (x == 0){
			throw new IllegalArgumentException("Division by zero!");
		}
		return x / y;
	}
}
