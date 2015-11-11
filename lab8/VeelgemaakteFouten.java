package lab8;

public class VeelgemaakteFouten {

	public static void main(String[] args) {
		String opl = "B";
		String[] in = { "D", "C", "E", "B", "E" };
		System.out.println(veelgemaakteFouten(opl, in));
	}

	public static char meesteFoute(char[] antwoorden, char juisteAntw, int[] aantalAntw) {
		// Houd het tot nu toe meest foute antwoord bij
		char meestFouteAntw = '?';
		int meesteFouten = 0;
		boolean komtMeermaalsvoor = false; // Houd bij of dit aantal fouten al
											// is voorgekomen

		// Iterereer over elk antwoord
		for (int i = 0; i < aantalAntw.length; ++i) {
			// Is dit antwoord juist, dan slaan we het over.
			if (juisteAntw == antwoorden[i])
				continue;

			// Anders vergelijken we het met het tot nu toe
			// meest foute antw
			int aantalFouten = aantalAntw[i];

			// Is dit antwoord niet gekozen, dan slaan we het over.
			if (aantalFouten == 0)
				continue;

			if (aantalFouten > meesteFouten) {
				// Dit antwoord is meer gekozen, dus dit is nu het meest foute
				// antw
				meestFouteAntw = antwoorden[i];
				meesteFouten = aantalFouten;

				// Natuurlijk komt het nu niet meer meermaals voor
				komtMeermaalsvoor = false;
			} else if (aantalFouten == meesteFouten) {
				// Dit antwoord is evenveel gekozen, onthoud dat
				komtMeermaalsvoor = true;
			}

			// Anders doen we gewoon verder...
		}

		// Controleer nu of dit aantal al is voorgekomen of niet
		if (komtMeermaalsvoor)
			return '?';
		else
			return meestFouteAntw;
	}

	public static String veelgemaakteFouten(String oplossing, String[] in) {
		String resultaat = "";
		final char[] antwoorden = { 'A', 'B', 'C', 'D', 'E' };

		// Itereer over elke vraag
		for (int vraag = 0; vraag < oplossing.length(); ++vraag) {
			// Voor elke vraag, tel hoeveel keer elk antwoord is gekozen...
			int[] aantalAntw = new int[antwoorden.length];

			// ... door te itereren over alle ingediende oplossingen...
			for (int opl = 0; opl < in.length; ++opl) {

				// Tel voorkomen van elk antwoord
				for (int antw = 0; antw < antwoorden.length; ++antw) {
					if (antwoorden[antw] == in[opl].charAt(vraag))
						++aantalAntw[antw];
				}

			}

			// Wat is nu het meest gekozen foute antwoord?
			resultaat += Character.toString(meesteFoute(antwoorden, oplossing.charAt(vraag), aantalAntw));
		}

		return resultaat;
	}

}
