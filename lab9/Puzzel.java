package lab9;

public class Puzzel {
	public static void main(String[] args) {
		int[][] h = { { 1, 1, -1, -1 }, { 1, -1, -1, 1 }, { -1, -1, 1, 1 }, { 1, -1, 1, 1 } };
		int[][] t = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		print(losOp(h, t));
	}

	static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("");
			for (int j = 0; j < a[0].length; j++)
				System.out.print(a[i][j] + "\t");
		}
		System.out.println("");
	}

	public static int score(int[][] a, int[][] b) {
		int score = 0;

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				score += (a[i][j] != b[i][j]) ? 1 : 0;
			}
		}

		return score;
	}

	public static void matrixcopy(int[][] src, int[][] dest) {
		for (int i = 0; i < src.length; ++i)
			System.arraycopy(src[i], 0, dest[i], 0, src[i].length);
	}

	public static int volgende(int[][] a, int[][] b) {
		int besteScore = score(a, b);
		int[][] besteRes = a;

		// Rijbewerkingen
		for (int i = 0; i < a.length; ++i) {
			int[][] bewerkteA = new int[a.length][a[0].length];
			matrixcopy(a, bewerkteA);

			for (int j = 0; j < a[i].length; ++j)
				bewerkteA[i][j] *= -1;

			int nieuweScore = score(bewerkteA, b);

			if (nieuweScore < besteScore) {
				besteScore = nieuweScore;
				besteRes = bewerkteA;
			}
		}

		// Kolombewerkingen
		for (int j = 0; j < a[0].length; ++j) {
			int[][] bewerkteA = new int[a.length][a[0].length];
			matrixcopy(a, bewerkteA);

			for (int i = 0; i < a.length; ++i)
				bewerkteA[i][j] *= -1;

			int nieuweScore = score(bewerkteA, b);

			if (nieuweScore < besteScore) {
				besteScore = nieuweScore;
				besteRes = bewerkteA;
			}
		}

		// Geef resultaat weer
		matrixcopy(besteRes, a);
		return besteScore;
	}

	public static int[][] losOp(int[][] a, int[][] b) {
		int oudeScore;
		int nieuweScore = score(a, b);
		
		do {
			oudeScore = nieuweScore;
			nieuweScore = volgende(a, b);
		} while (oudeScore != nieuweScore);
		
		return a;
	}
}
