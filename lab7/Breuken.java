package lab7;

public class Breuken {
	public static int ggd(int a, int b) {
		while ((a != 0) && (b != 0)) {
			if (a < b)
				b = b % a;
			else if (a > b)
				a = a % b;
			else
				return a;
		}
		return (a == 0) ? b : a;
	}

	public static String som(int teller1, int noemer1, int teller2, int noemer2) {
		int tellerres = teller1 * noemer2 + teller2 * noemer1;
		int noemerres = noemer1 * noemer2;
		int ggd = ggd(tellerres, noemerres);
		tellerres /= ggd;
		noemerres /= ggd;
		return (tellerres + "/" + noemerres);
	}

	public static void main(String[] args) {
		System.out.println(som(2, 5, 6, 7));
		System.out.println(som(1, 6, 2, 9));
	}

}