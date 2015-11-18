package lab12;

public class Gesorteerd {
	public static void main(String[] args) {
		int[] a0 = { 2, 4, 6, 7, 10, 11 };
		int[] a1 = { 8, 4, -4, -10 };
		int[] a2 = { 1, 1, 1, 1, 1 };
		int[] a3 = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		int[] a4 = { 1 };
		int[] a5 = {};
		System.out.println(isGesorteerd(a0));
		System.out.println(isGesorteerd(a1));
		System.out.println(isGesorteerd(a2));
		System.out.println(isGesorteerd(a3));
		System.out.println(isGesorteerd(a4));
		System.out.println(isGesorteerd(a5));
	}

	public static int isGesorteerd(int[] a) {
		// Lengte 0 => +1
		if (a.length == 0)
			return 1;

		// Veronderstel om te beginnen dat a zowel (strik monotoon) dalend als
		// stijgend is.
		boolean isDalend = true, isStijgend = true;

		// In principe kan je elk van de drie voorwaarden (constant, dalend,
		// stijgend)
		// apart nagaan in 3 for-loops. Deze methode met 1 for is echter
		// efficiënter
		// (maar misschien minder duidelijk).
		for (int i = 1; i < a.length; ++i) {
			// Vergelijk 2 opeenvolgende elementen
			if (a[i - 1] <= a[i]) {
				// a kan niet meer strikt dalend zijn
				isDalend = false;
			} else {
				// a kan niet meer stijgend zijn
				isStijgend = false;
			}
		}

		// Geef returnwaarde
		if (isStijgend)
			return 1;
		if (isDalend)
			return -1;

		// Alle andere gevallen
		return 0;
	}
}
