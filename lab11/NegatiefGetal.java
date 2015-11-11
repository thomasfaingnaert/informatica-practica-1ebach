package lab11;

public class NegatiefGetal {

	public static void main(String[] args) {
		int[] a0 = { 1, 2, 3, -4, 5, 6 };
		int[] a1 = { -1, 2, 3, 4, 5, 6 };
		int[] a2 = { -1, 2, 3, 4, 5, 6 };
		int[] a3 = { 1, 2, 3, 4, 5, -6 };
		int[] a4 = { 1, 2, 3, 4, 5, 6 };
		int[] a5 = {};
		System.out.println(negatief(a0, 0));
		System.out.println(negatief(a1, 0));
		System.out.println(negatief(a2, 1));
		System.out.println(negatief(a3, 0));
		System.out.println(negatief(a4, 0));
		System.out.println(negatief(a5, 0));
	}
	
	public static int negatief(int[] a, int index) {
		if (a.length == 0)
			return 0;
		
		if (index >= a.length)
			return 0;
		
		if (a[index] < 0)
			return a[index];
		else
			return negatief(a, index + 1);
	}
}
