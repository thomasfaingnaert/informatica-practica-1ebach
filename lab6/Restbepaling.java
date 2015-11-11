package lab6;

public class Restbepaling {

	public static String getal = "0246040610900021842";
	public static int deeltal = 37;
	public static int rest = 0;

	public static void main(String[] args) {

		// Vul nullen vooraan aan zodanig dat de lengte een vijfvoud is
		while ((getal.length() % 5) != 0)
			getal = "0" + getal;

		final long aantalGroepen = getal.length() / 5;

		for (int i = 0; i < aantalGroepen; ++i) {
			int startIndex = 5 * i;
			long groep = Long.parseLong(getal.substring(startIndex, startIndex + 5));

			long eersteTerm = groep % deeltal;
			long tweedeTerm = (int) (Math.pow(100000 % deeltal, aantalGroepen - i - 1));

			rest += (eersteTerm * tweedeTerm) % deeltal;
		}

		rest %= deeltal;

		System.out.println(rest);
	}
}
