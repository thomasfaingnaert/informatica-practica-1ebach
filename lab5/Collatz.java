package lab5;

public class Collatz {
	public static long start = 63728127L;
	public static int stopTijd = 0;

	public static void main(String[] args) {
		long getal = start;
		while (getal != 1) {
			if (getal % 2 == 0)
				getal /= 2;
			else
				getal = 3 * getal + 1;

			++stopTijd;
		}

		System.out.println(stopTijd);
	}
}
