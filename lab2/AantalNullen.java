package lab2;

public class AantalNullen {
	public static int a = 0, b = 5, c = 10, d = 0, e = 100;
	public static int nul = 0;

	public static void main(String[] args) {
		// Ga alle variabelen af en als er een nul
		// tussenzit, tel 1 op bij var nul.
		if (a == 0)
			++nul;
		if (b == 0)
			++nul;
		if (c == 0)
			++nul;
		if (d == 0)
			++nul;
		if (e == 0)
			++nul;
	}
}
