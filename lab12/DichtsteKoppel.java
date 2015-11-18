package lab12;

public class DichtsteKoppel {
	public static void main(String[] args) {
		int[] a1 = { 10, 13, 19, 5, 21, 0 };
		print(dichtsteKoppel(a1));
		int[] a2 = { 10, 13, 19, 13, 21, 0 };
		print(dichtsteKoppel(a2));
		int[] a3 = { 10, 13, 19, 15, 21, 0 };
		print(dichtsteKoppel(a3));
		int[] a4 = { 1, 1, 2, 2, 3, 3, 1 };
		print(dichtsteKoppel(a4));
		int[] a5 = { 11, 13, 19, 15, 21, 0 };
		print(dichtsteKoppel(a5));
	}

	public static void print(int[] a) {
		System.out.println("(" + a[0] + "," + a[1] + ")");
	}

	public static int[] dichtsteKoppel(int[] a) {
		// Neem om te beginnen het eerste koppel, i.e. index 0 en index 1
		int index1 = 0, index2 = 1;
		int minDelta = Math.abs(a[index1] - a[index2]);

		// Itereer over elk koppel
		for (int i = 0; i < a.length; ++i) {
			for (int j = i + 1; j < a.length; ++j) {
				// Bereken afstand van huidig koppel
				final int deltaCur = Math.abs(a[i] - a[j]);

				// Pas minimum aan indien nodig
				if (deltaCur < minDelta) {
					index1 = i;
					index2 = j;
					minDelta = Math.abs(a[index1] - a[index2]);
				}
			}
		}

		// Return resultaat
		return new int[] { a[index1], a[index2] };
	}
}
