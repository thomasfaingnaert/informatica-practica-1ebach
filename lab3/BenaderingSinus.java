package lab3;

public class BenaderingSinus {
	public static double hoek = 1.0;
	public static double sinus = 0.0;

	public static int factorial(int x) {
		int resultaat = 1;
		for (int i = 2; i <= x; ++i)
			resultaat *= i;
		return resultaat;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 2; ++i) {
			sinus += Math.pow(-1, i) * Math.pow(hoek, 2 * i + 1) / factorial(2 * i + 1);
		}
	}
}
