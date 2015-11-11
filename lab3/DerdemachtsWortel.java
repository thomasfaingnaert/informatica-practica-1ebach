package lab3;

public class DerdemachtsWortel {
	public static double x = -27.0;
	public static double w = 0.0;

	public static void main(String[] args) {
		if (x >= 0.0)
			w = Math.pow(x, 1.0 / 3.0);
		else
			w = -Math.pow(-x, 1.0 / 3.0);
	}
}
