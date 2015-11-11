package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lettertype {
	public static String resultaat;

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.print("Invoer: ");
		String invoer = in.readLine();

		boolean enkelHoofdLetters = invoer.equals(invoer.toUpperCase());
		boolean enkelKleineLetters = invoer.equals(invoer.toLowerCase());

		resultaat = enkelHoofdLetters ? "Enkel hoofdletters"
				: enkelKleineLetters ? "Enkel kleine letters" : "Gemengd lettertype";
	}
}
