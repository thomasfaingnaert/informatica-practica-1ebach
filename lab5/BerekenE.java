package lab5;

public class BerekenE {
	public static int aantalTermen = 20;
	public static double e = 0.0;

	public static double factorial(double number) {
		double result = 1;
		for (double i = 1; i <= number; ++i)
			result *= i;
		return result;
	}

	public static void main(String[] args) {
		for (int i = 0; i < aantalTermen; ++i) {
			e += 1 / factorial(i);
		}

		System.out.println(e);
	}
}
