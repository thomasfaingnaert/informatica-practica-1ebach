package lab7;

public class VerbodenKarakters {

	public static int verbodenKarakters(String s, String verboden) {
		// Doorloop alle verboden karakters
		int resultaat = 0;

		for (int i = 0; i < s.length(); ++i) {
			char karakter = s.charAt(i);
			boolean isVerboden = false;
			for (int j = 0; j < verboden.length(); ++j) {
				if (verboden.charAt(j) == karakter) {
					isVerboden = true;
					break;
				}
			}
			if (isVerboden)
				++resultaat;
		}

		return resultaat;
	}

	public static void main(String[] args) {
		System.out.println(verbodenKarakters("ABCDEABCDE", ""));
		System.out.println(verbodenKarakters("ABCDEABCDE", "AB"));
		System.out.println(verbodenKarakters("ABCDEABCDE", "ABAB"));
		System.out.println(verbodenKarakters("ABCDEABCDE", "ABAC"));
	}

}