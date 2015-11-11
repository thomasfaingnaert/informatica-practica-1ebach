package lab9;

import java.util.*;

public class AchterwaartseSubstitutie {
	public static void main(String[] args) {
		double[][] a = { { 1, 2, 3 }, { 0, 3, 2 }, { 0, 0, 1 } };
		double[] b = { 4, 3, 4 };
		double[] x = substitueer(a, b);
		System.out.println(Arrays.toString(x));
	}

	public static double[] substitueer(double[][] a, double[] b) {
		double[] x = new double[b.length];

		for (int i = a.length - 1; i >= 0; --i) {
			double som = 0.0;
			for (int j = i + 1; j < a.length; ++j) {
				som += a[i][j] * x[j];
			}

			x[i] = 1 / a[i][i] * (b[i] - som);
		}

		return x;
	}
}
