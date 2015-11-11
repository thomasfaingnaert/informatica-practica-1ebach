package lab7;

public class DubbelComplement {
	public static void main(String[] args) {
		for (int i = -16; i <= 15; i++) {
			System.out.println(i + ":" + binair(i, 6) + " - " + decimaal(binair(i, 6)));
		}
	}

	public static int charNaarBit(char c) {
		return (c == '1') ? 1 : 0;
	}

	public static int decimaal(String bitpatroon) {
		int aantalBits = bitpatroon.length();
		int decimaal = -charNaarBit(bitpatroon.charAt(0)) * (int) (Math.pow(2, aantalBits - 1));
		int macht = 1; // maakt for loop efficiënter

		// Doorloop bits van rechts naar links (minst significant naar meest
		// significant)
		for (int i = aantalBits - 1; i >= 1; --i) {
			decimaal += charNaarBit(bitpatroon.charAt(i)) * macht;
			macht *= 2;
		}

		return decimaal;
	}

	public static String binair(int getal, int aantalBits) {
		// Positief
		if (getal >= 0)
			return binairPositief(getal, aantalBits);

		// Negatief

		// Bereken bitpatroon van -g
		String patroon = binairPositief(-getal, aantalBits);

		// Inverteer resultaat
		patroon = inverteer(patroon);

		// Tel 1 op
		patroon = plusEen(patroon);

		// Return resultaat
		return patroon;
	}

	public static String binairPositief(int getal, int aantalBits) {
		String retVal = "";

		while (getal != 0) {
			// Voeg telkens de minst significante bit vooraan toe aan retVal
			retVal = ((getal % 2 == 0) ? "0" : "1") + retVal;

			// Gooi de laatste bit weg
			getal /= 2;
		}

		// Voeg nullen toe vooraan zodat we een lengte `aantalBits' bekomen
		while (retVal.length() != aantalBits) {
			retVal = "0" + retVal;
		}

		return retVal;
	}

	public static String inverteer(String bitpatroon) {
		String res = "";

		for (int i = 0; i < bitpatroon.length(); ++i) {
			res += (bitpatroon.charAt(i) == '0') ? '1' : '0';
		}

		return res;
	}

	public static String plusEen(String bitpatroon) {
		String retVal = "";

		int carry = 1;

		for (int i = bitpatroon.length() - 1; i >= 0; --i) {
			int som = carry + charNaarBit(bitpatroon.charAt(i));
			String nieuweBit = Integer.toString(som % 2);
			carry = som / 2;
			retVal = nieuweBit + retVal;
		}

		return retVal;
	}
}
