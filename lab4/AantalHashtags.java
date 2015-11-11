package lab4;

import java.io.*;

public class AantalHashtags {
	public static int aantalHashtags = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.print("Invoer: ");
		String invoer = in.readLine();

		int laatstePositie = invoer.indexOf('#');
		aantalHashtags += (laatstePositie > 0) ? 1 : 0;

		laatstePositie = invoer.indexOf('#', laatstePositie + 1);
		aantalHashtags += (laatstePositie > 0) ? 1 : 0;
	}
}
