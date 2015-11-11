package lab7;

public class MachtZoeken {
	public static void main(String[] args) {
		System.out.println(zoekMacht(16777216L));
		System.out.println(zoekMacht(7620480));
		System.out.println(zoekMacht(9223372036854775807L));
	}

	// Efficienter dan algoritme met eenvoudige for-loop: O(log n)
	public static long macht(long n, int m) {
		if (m == 0)
			return 1;
		if (m == 1)
			return n;
		if (m % 2 == 0)
			return macht(n * n, m / 2); // EVEN: n^m = (n^2)^(m/2)
		else
			return n * macht(n * n, m / 2); // ONEVEN: n^m = n * (n^2)^(m/2)
	}

	public static long fac(int n) {
		long resultaat = 1;

		for (int i = 2; i <= n; ++i) {
			resultaat *= i;
		}

		return resultaat;
	}

	public static int zoekMacht(long getal) {
		int grondtal = 2;
		long faculteit = fac(grondtal);

		// Als getal een macht is van een faculteitsgetal, dan moet dat
		// faculteitsgetal uiteraard een deler zijn van het gegeven getal.
		while (getal % faculteit == 0) {

			long resultaat = 0;
			int exponent = 1;

			// Zoek een macht door ze allemaal af te gaan
			do {
				resultaat = macht(faculteit, exponent);

				// Hebben we de gevraagde macht gevonden?
				if (resultaat == getal)
					return exponent;

				++exponent;
			} while (resultaat < getal);

			// Volgende faculteit
			++grondtal;
			faculteit = fac(grondtal);
		}

		// Geen resultaat
		return -1;
	}
}
