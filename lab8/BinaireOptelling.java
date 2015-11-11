package lab8;

import java.util.*;

public class BinaireOptelling {
	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 0, 0, 1 }, b = { 1, 0, 1, 0, 1, 1 };
		System.out.println(Arrays.toString(a) + " + " + Arrays.toString(b) + " = " + Arrays.toString(som(a, b)));

	}

	public static int[] som(int[] a, int[] b) {
		// Min en max grootte van a en b
		int maxGrootte = Math.max(a.length, b.length);

		// Kopieer a en b in arrays die even groot zijn
		int[] patroon1 = new int[maxGrootte];
		int[] patroon2 = new int[maxGrootte];

		System.arraycopy(a, 0, patroon1, 0, a.length);
		System.arraycopy(b, 0, patroon2, 0, b.length);

		// Houdt ons resultaat bij, bit voor bit
		int[] resultaat = new int[maxGrootte];

		// Tel bits van a en b paarsgewijs op
		int carry = 0;
		for (int i = 0; i < maxGrootte; ++i) {
			int som = patroon1[i] + patroon2[i] + carry;
			resultaat[i] = som % 2;
			carry = som / 2;
		}

		// Voeg de carry toe
		int[] resultaatMetCarry = new int[maxGrootte + 1];
		System.arraycopy(resultaat, 0, resultaatMetCarry, 0, resultaat.length);
		resultaatMetCarry[resultaatMetCarry.length - 1] = carry;

		// Nu moeten we enkel nog de laatste nullen verwijderen
		int index = resultaatMetCarry.length - 1;
		while ((resultaatMetCarry[index] == 0) && (index != 0))
			--index;

		// Index bevat nu de index van de laatste van nul verschillende bit
		int[] resultaatCropped = new int[index + 1];
		System.arraycopy(resultaatMetCarry, 0, resultaatCropped, 0, resultaatCropped.length);
		return resultaatCropped;
	}
}
