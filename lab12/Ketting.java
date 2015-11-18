package lab12;

public class Ketting {
	public static void main(String[] args) {
		System.out.println(breuk("helloworld"));
		System.out.println(breuk("abcde"));
		System.out.println(breuk("edcba"));
		System.out.println(breuk("bbabbab"));
		System.out.println(breuk("z"));
	}

	public static boolean isZwakker(String s, int i, int j) {
		String a = s.substring(i) + s.substring(0, i);
		String b = s.substring(j) + s.substring(0, j);
		return a.compareTo(b) < 0;
	}

	public static int breuk(String s) {
		// Houd index bij van zwakste schakel
		int zwaksteIndex = 0;

		// Itereer over alle schakels om te zwakste te vinden
		for (int i = 1; i < s.length(); ++i) {
			if (isZwakker(s, i, zwaksteIndex))
				zwaksteIndex = i;
		}

		// Return resultaat
		return zwaksteIndex;
	}
}
