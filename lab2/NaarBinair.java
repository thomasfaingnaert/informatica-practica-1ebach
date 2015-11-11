package lab2;

public class NaarBinair {
	public static int g = 127, b = 0;

	public static void main(String[] args) {
		// Doorloop alle 8 bits van links naar rechts
		for (int i = 7; i >= 0; --i) {
			// Bereken bit
			int waardePlaats = (int) Math.pow(2, i);
			int bit = g / waardePlaats;

			// Zet bit achteraan in b
			b = b * 10 + bit;

			// Trek waardePlaats af van g als
			// g groter is dan die waardePlaats
			g %= waardePlaats;
		}

		// Print resultaat
		System.out.println(b);
	}
}
