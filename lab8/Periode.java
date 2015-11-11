package lab8;

public class Periode {
	public static void main(String[] args) {
		System.out.println(periode(new int[] { 1, 2, 3, 4, 1, 2, 3, 4 }));
		System.out.println(periode(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 }));
		System.out.println(periode(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
		System.out.println(periode(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		System.out.println(periode(new int[] { 9, 1, 7, 7, 9, 11, 9, 7, 13 }));
	}

	public static int periode(int[] rij) {
		// Ga alle periodes af in stijgende lijn
		for (int mogelijkePeriode = 1; mogelijkePeriode < rij.length; ++mogelijkePeriode) {
			// Is dit wel een periode?
			boolean isPeriode = true; // Begin met de veronderstellen van wel

			// Itereer over elk element van die periode
			for (int i = 0; i < mogelijkePeriode; ++i) {
				// Controleer dat overeenkomstige elementen gelijk zijn
				for (int j = i + mogelijkePeriode; j < rij.length; j += mogelijkePeriode) {
					if (rij[j] != rij[i]) {
						isPeriode = false;
						break;
					}
				}
			}

			// Als dit mogelijke periode is, return dit als resultaat
			if (isPeriode)
				return mogelijkePeriode;
		}

		// Geen periode, dus return lengte rij
		return rij.length;
	}

}
