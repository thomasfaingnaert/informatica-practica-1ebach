package lab12;

import java.util.Arrays;

public class DistributionSort {
	public static void main(String[] args) {
		int[] a0 = { 5, 4, 3, 2, 1, 0 };
		distributionSort(a0, 6);
		System.out.println(Arrays.toString(a0));
		int[] a1 = { 1, 5, 4, 3, 2, 5, 4, 4, 3, 3, 2 };
		distributionSort(a1, 10);
		System.out.println(Arrays.toString(a1));
	}

	public static void distributionSort(int[] a, int n) {
		// Rij tellers
		int[] t = new int[n];

		// Vul rij tellers op
		for (int i = 0; i < a.length; ++i)
			++t[a[i]];

		// Reconstrueer a
		int aIndex = 0;
		for (int i = 0; i < t.length; ++i)
			for (int j = 0; j < t[i]; ++j)
				a[aIndex++] = i;
	}
}
