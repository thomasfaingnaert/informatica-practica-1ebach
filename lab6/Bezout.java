package lab6;

import java.io.*;

public class Bezout {
	public static int a = 35, b = 35;
	public static int s = 0, t = 0, ggd = 0;

	public static void main(String[] args) throws IOException {

		// Test of beide positief zijn
		if (a > 0 && b > 0) {

			// Rijen
			int r0 = a, r1 = b, r2;
			int q1;
			int s0 = 1, s1 = 0, s2;
			int t0 = 0, t1 = 1, t2;

			while (r1 != 0) {
				// Bereken volgende termen van de rij
				q1 = r0 / r1;
				r2 = r0 % r1;

				s2 = s0 - q1 * s1;
				t2 = t0 - q1 * t1;

				// Ga naar de volgende twee elementen
				r0 = r1;
				r1 = r2;

				t0 = t1;
				t1 = t2;

				s0 = s1;
				s1 = s2;
			}

			// Uitvoer
			s = s0;
			t = t0;
			ggd = r0;
		} else {
			ggd = -1;
			s = t = 0;
		}

		System.out.format("GGD: %d, Bezout: %d, %d", ggd, s, t);

	}

}
