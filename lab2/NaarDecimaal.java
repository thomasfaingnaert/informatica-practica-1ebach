package lab2;

public class NaarDecimaal {
	public static int b = 1010101, g = 0;

	public static void main(String[] args) {
		// Doorloop alle bits van rechts naar links
		for (int i = 0; i <= 7; ++i) {
			// Huidige bit
			int bit = b % 10;

			// Welke waarde heeft deze bit?
			int bitWaarde = (int) Math.pow(2, i);

			// Voeg die waarde toe aan g
			g += bit * bitWaarde;

			// Gooi de laatste bit van b weg
			// door te delen door 10
			b /= 10;
		}

		// Print het resultaat
		System.out.println(g);
	}
}
