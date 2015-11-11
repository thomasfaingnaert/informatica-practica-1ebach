package lab6;

public class HexNaarDecimaal {
	public static String hex = "3BFD";
	public static long waarde = 0;

	public static int getHexVal(char c) {
		if (('0' <= c) && (c <= '9'))
			return c - '0';
		else if (('a' <= c) && (c <= 'f'))
			return c - 'a' + 10;
		else if (('A' <= c) && (c <= 'F'))
			return c - 'A' + 10;
		else
			return 0;
	}

	public static void main(String[] args) {

		for (int i = 0; i < hex.length(); ++i) {
			waarde *= 16;
			char c = hex.charAt(i);
			waarde += getHexVal(c);
		}

		System.out.println(waarde);
	}
}
