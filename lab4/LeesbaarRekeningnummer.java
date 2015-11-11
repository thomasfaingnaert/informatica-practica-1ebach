package lab4;

import java.io.*;

public class LeesbaarRekeningnummer {
	public static String leesbaarNummer;

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.print("Rekeningnummer: ");
		String rekeningNummer = in.readLine();

		String beterNummer = rekeningNummer.substring(0, 4) + " " + rekeningNummer.substring(4, 8) + " "
				+ rekeningNummer.substring(8, 12) + " " + rekeningNummer.substring(12, 16);
		leesbaarNummer = (rekeningNummer.startsWith("BE") ? beterNummer : "ONGELDIG");
	}
}
