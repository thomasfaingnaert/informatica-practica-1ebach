package lab11;

public class Catalan {

	public static void main(String[] args) {
		System.out.println(catalan(1));
		System.out.println(catalan(5));
		System.out.println(catalan(25));
		System.out.println(catalan(-1));
	}

	public static long catalan(int i) {
		if (i < 0)
			return -1;
		else if (i == 0)
			return 1;
		else
			return (4 * i - 2) * catalan(i - 1) / (i + 1);
	}
}
