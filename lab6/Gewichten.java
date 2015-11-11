package lab6;

public class Gewichten {
	public static int massaZwaar = 7;
	public static int aantalZwaar = 5;
	public static int massaLicht = 3;
	public static int aantalLicht = 5;
	public static int gewenst = 18;
	public static String resultaat = "";

	public static void main(String[] args) {
		for (int a = 0; a <= aantalZwaar; ++a) {
			for (int b = 0; b <= aantalLicht; ++b) {
				if (a * massaZwaar + b * massaLicht == gewenst)
					resultaat += String.format("(%d,%d)", a, b);
			}
		}

		if (resultaat.length() == 0)
			resultaat = "ONMOGELIJK";
	}
}
