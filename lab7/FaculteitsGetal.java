package lab7;

public class FaculteitsGetal {

	public static boolean isFaculteitsGetal(long n) {

		long faculteit = 1;

		for (long i = 1; faculteit < n; ++i) {
			faculteit *= i;
		}

		return (faculteit == n);

	}

	public static void main(String[] args) {

		System.out.println(isFaculteitsGetal(1));
		System.out.println(isFaculteitsGetal(120));
		System.out.println(isFaculteitsGetal(110));

	}
}
