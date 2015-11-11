package lab5;

public class DNAconsensus {
	public static String DNA1 = "ACTGACTGAACT";
	public static String DNA2 = "ACTGCATGAACTTT";
	public static String resultaat = "";

	public static void main(String[] args) {
		int minimumLengte = Math.min(DNA1.length(), DNA2.length());
		int verschilLengte = Math.abs(DNA1.length() - DNA2.length());

		for (int i = 0; i < minimumLengte; ++i) {
			char dna1 = DNA1.charAt(i);
			char dna2 = DNA2.charAt(i);

			resultaat += (dna1 == dna2) ? dna1 : '?';
		}

		for (int i = 0; i < verschilLengte; ++i)
			resultaat += '?';
	}
}