package lab9;

import java.util.Arrays;

public class SomEnProduct {

	public static void main(String[] args) {
		double[][] a = { { 1.0, 2.0 }, { 2.0, 1.0 } };
		double[][] b = { { 3.0, 2.0 }, { 4.0, 1.0 } };
		print(a);
		print(b);
		print(som(a, b));
		print(product(a, b));
	}

	public static void print(double[][] a) {
		System.out.print("[");
		for (double[] r : a)
			System.out.print(Arrays.toString(r));
		System.out.println("]");
	}

	public static boolean isRechthoekig(double[][] matrix) {
		if (matrix.length == 0)
			return false;

		final int numCols = matrix[0].length;
		for (double[] col : matrix) {
			if (col.length != numCols)
				return false;
		}

		return true;
	}

	public static double[][] som(double[][] a, double[][] b) {
		if (!isRechthoekig(a) || !isRechthoekig(b))
			return new double[0][0];
		if ((a.length != b.length) || (a[0].length != b[0].length))
			return new double[0][0];

		double[][] retVal = new double[a.length][a[0].length];

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[0].length; ++j) {
				retVal[i][j] = a[i][j] + b[i][j];
			}
		}

		return retVal;
	}

	public static double[][] product(double[][] a, double[][] b) {
		if (!isRechthoekig(a) || !isRechthoekig(b))
			return new double[0][0];
		if (a[0].length != b.length)
			return new double[0][0];

		double[][] retVal = new double[a.length][b[0].length];

		for (int row = 0; row < a.length; ++row) {
			for (int col = 0; col < b[0].length; ++col) {
				double som = 0.0;

				for (int el = 0; el < b.length; ++el) {
					som += a[row][el] * b[el][col];
				}

				retVal[row][col] = som;
			}
		}

		return retVal;
	}

}
