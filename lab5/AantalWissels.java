package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AantalWissels {
	public static int aantalWissels = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		String invoer = in.readLine();

		char laatsteKarakter = invoer.charAt(0);
		for (int i = 1; i < invoer.length(); ++i) {
			aantalWissels += (laatsteKarakter != invoer.charAt(i)) ? 1 : 0;
			laatsteKarakter = invoer.charAt(i);
		}
	}
}
