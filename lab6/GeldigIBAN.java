package lab6;

import java.math.*;

public class GeldigIBAN {
	public static String iban = "GB82WEST12345698765432";
	public static boolean geldig = false;

	public static boolean checkIban(String iban) {
		// Wat is de landcode?
		String landcode = iban.substring(0, 2);
		int lengte = iban.length();

		// Controleer of de landcode geldig is
		if (!landcode.equals("BE") && !landcode.equals("FR") && !landcode.equals("GB"))
			return false;

		// Controleer of de lengte correspondeert met de landcode
		if (landcode.equals("BE") && lengte != 16)
			return false;
		if (landcode.equals("FR") && lengte != 27)
			return false;
		if (landcode.equals("GB") && lengte != 22)
			return false;

		// Verwijder eerste 4 karakters van IBAN en plaats ze achteraan
		iban = iban.substring(4) + iban.substring(0, 4);

		// Verander letters: A wordt 10, B wordt 11, enz.
		for (char c = 'A'; c <= 'Z'; ++c) {
			String oud = Character.toString(c);
			String nieuw = Integer.toString(c - 'A' + 10);
			iban = iban.replace(oud, nieuw);
		}

		// Bepaal rest bij deling door 97
		BigInteger i = new BigInteger(iban);

		// Rest moet 1 zijn
		return (i.mod(new BigInteger("97")).equals(new BigInteger("1")));
	}

	public static void main(String[] args) {
		geldig = checkIban(iban);
	}
}
