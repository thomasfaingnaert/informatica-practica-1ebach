package lab3;

public class VerliesPrecisie {

	public static void main(String[] args) {
		final double[] xWaarden = { 1e+15, 1e+16, 1e-37, 1e-38, 1e-39 };
		final String[] xStrings = { "1e+15", "1e+16", "1e-37", "1e-38", "1e-39" };

		System.out.println("Verwacht: 0.0 en 1.0.");

		for (int i = 0; i < xWaarden.length; ++i) {
			final double x = xWaarden[i];
			final double uitdr1 = x * (1 / x) - 1;
			final double uitdr2 = (x + 1) - x;

			System.out.format("%s: %f en %f.\n", xStrings[i], uitdr1, uitdr2);
		}
	}

}
