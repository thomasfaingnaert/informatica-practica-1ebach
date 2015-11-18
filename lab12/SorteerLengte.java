package lab12;

import java.util.Arrays;

public class SorteerLengte {
	public static void main(String[] args) {
		String[] s0 = { "AA", "A", "AAA", "AAAA", "", "AAAAA" };
		sorteerLengte(s0);
		System.out.println(Arrays.toString(s0));
		String[] s1 = { "CC", "AA", "DD", "EE", "BB", "AA" };
		sorteerLengte(s1);
		System.out.println(Arrays.toString(s1));
		String[] s2 = { "AAA", "A", "BB", "AA", "AAA", "B", "AA", "BBB", "AAAA" };
		sorteerLengte(s2);
		System.out.println(Arrays.toString(s2));
	}

	// Hulpmethode die a vergelijkt met b.
	// Returnt true asa a < b
	public static boolean compareStr(String a, String b) {
		// Lengte verschilt: vergelijk lengtes
		if (a.length() != b.length())
			return (a.length() < b.length());

		// Lengtes gelijk: gebruik String.compareTo()
		return a.compareTo(b) > 0;
	}

	// SELECTION SORT: Zoek kleinste element en verplaats het naar voor [O(n^2)]
	public static void sorteerLengte(String[] array) {
		// Beschouw de subarray van array vanaf element i tot einde
		for (int i = 0; i < array.length; ++i) {
			// Zoek minimum
			int minIndex = i;
			for (int j = i + 1; j < array.length; ++j) {
				if (compareStr(array[j], array[minIndex])) {
					minIndex = j;
				}
			}

			// Verwissel minimum met i-de element
			final String tmp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tmp;
		}
	}
}
