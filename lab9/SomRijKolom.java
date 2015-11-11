package lab9;

import java.util.*;

public class SomRijKolom {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 3, 4, 5 }, { 4, 3, 2 }, { 1, 5, 4 } };
		int[][] b = { { 1, 2, 3, 4 }, { 3, 4, 5, 0 }, { 4, 3, 2, 1 }, { 1, 5, 4, 0 } };
		print(somRijKolom(a));
		print(somRijKolom(b));
	}

	public static void print(int[][] a) {
		ArrayList<String> l = new ArrayList<String>();
		for (int i = 0; i < a.length; i++)
			l.add(Arrays.toString(a[i]));
		System.out.println(l);
	}

	public static int[][] somRijKolom(int[][] matrix) {
		int[][] retVal = new int[matrix.length + 1][matrix[0].length + 1];

		// Kopieer matrix
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				int el = matrix[i][j];

				retVal[i][j] = el;
				retVal[i][matrix[0].length] += el;
				retVal[matrix.length][j] += el;
				retVal[matrix.length][matrix[0].length] += el;
			}
		}

		return retVal;
	}
}
