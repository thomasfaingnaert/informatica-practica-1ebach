package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartHoofdletters {
	public static int n = 3; // minstens 0
	public static boolean start = false;

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.print("Geef een tekst: ");
		String tekst = in.readLine();

		if (n >= tekst.length()) {
			start = false;
		} else {
			String substr = tekst.substring(0, n);
			start = substr.equals(substr.toUpperCase());
		}
	}
}
