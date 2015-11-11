package lab3;

public class KubischeVergelijking {
	public static double a = 1.0, b = 2.0, c = 3.0, d = 4.0;
	public static double w = 0.0;

	public static double cubeRt(double x) {
		if (x >= 0)
			return Math.pow(x, 1.0 / 3.0);
		else
			return -Math.pow(-x, 1.0 / 3.0);
	}

	public static void main(String[] args) {
		// Algoritme van Cardano (niet-algemeen geval)
		double p = (3 * a * c - b * b) / (3 * a * a);
		double q = (2 * Math.pow(b, 3) - 9 * a * b * c + 27 * a * a * d) / (27 * Math.pow(a, 3));

		double uCubed = -q / 2 + Math.sqrt(q * q / 4 + p * p * p / 27);
		double vCubed = -q / 2 - Math.sqrt(q * q / 4 + p * p * p / 27);

		double t = cubeRt(uCubed) + cubeRt(vCubed);
		w = t - b / (3 * a);
		System.out.println(w);
	}
}
