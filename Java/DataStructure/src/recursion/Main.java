package recursion;

public class Main {

	public static void main(String[] args) {

		walk(5);
		System.out.println(factorial(7));
		System.out.println(power(2, 8));

	}

	private static void walk(int i) {
		if (i < 1)
			return;
		System.out.println("You take a step!");
		walk(i - 1);
	}

	private static int factorial(int num) {
		if (num <= 1)
			return 1;
		return num * factorial(num - 1);
	}

	private static int power(int base, int power) {
		if (power < 1)
			return 1;
		return base * power(base, power - 1);
	}

}
