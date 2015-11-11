package lab8;

public class TelDNA {

	public static void main(String[] args) {
		print(telDNA("ACTGACTG"));
		print(telDNA("AAAAAAAA"));
		print(telDNA("ACCATTGGGG"));
		print(telDNA(""));
	}

	public static void print(int[] a) {
		for (int i : a)
			System.out.print(i + " ");
		System.out.println("");
	}

	public static int[] telDNA(String dna) {
		char[] karakters = { 'A', 'C', 'T', 'G' };
		int[] resultaat = new int[karakters.length];

		for (int i = 0; i < dna.length(); ++i) {
			char c = dna.charAt(i);

			for (int j = 0; j < karakters.length; ++j) {
				if (c == karakters[j])
					++resultaat[j];
			}
		}

		return resultaat;
	}
}
