package lab8;

public class VervolledigRij {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5 };
		System.out.println(volgendeElement(a));

		int[] b = { 0, 1, 4, 9, 16 };
		System.out.println(volgendeElement(b));

		int[] c = { 1, 2, 4, 7 };
		System.out.println(volgendeElement(c));
	}

	public static double l(int j, int k, int N) {
		double res = 1;

		for (int i = 0; i < N; ++i) {
			if (i == j)
				continue;

			res *= (double) (k - i) / (double) (j - i);
		}

		return res;
	}

	public static double L(int k, int[] x, int N) {
		int res = 0;

		for (int j = 0; j < N; ++j) {
			res += x[j] * l(j, k, N);
		}

		return res;
	}

	public static int volgendeElement(int[] x) {
		return (int) L(x.length, x, x.length);
	}
}
