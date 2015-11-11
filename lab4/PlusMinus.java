package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusMinus {
	public static boolean isPlusMin;

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.print("Invoer: ");
		String invoer = in.readLine();

		isPlusMin = (invoer.indexOf("-+") < 0);
	}
}
