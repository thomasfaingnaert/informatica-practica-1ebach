package lab5;

public class Pariteit {
	public static String bitpatroon = "110011";
	public static String resultaat = "";

	public static int countOccurencesOf(String str, String substr) {
		return str.length() - str.replace(substr, "").length();
	}

	public static void main(String[] args) {
		// Tel het aantal 1'en
		int aantalEnen = countOccurencesOf(bitpatroon, "1");

		// Aantal enen even: aanvullen met 0
		if (aantalEnen % 2 == 0)
			resultaat = bitpatroon + "0";
		// Aantal enen oneven: aanvullen met 1
		else
			resultaat = bitpatroon + "1";
	}
}
