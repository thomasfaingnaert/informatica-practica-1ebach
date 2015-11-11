package lab11;

public class Maximum {
	
	public static void main(String[] args) {
		int[] a0 = { 1, 2, 3, 4, 3, 2, 1 };
		int[] a1 = { 4, 3, 2, 1, 2, 3, 4 };
		int[] a2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] a3 = { 1, 1, 1, 1, 1, 1, 1 };
		int[] a4 = { 10 };
		System.out.println(max(a0));
		System.out.println(max(a1));
		System.out.println(max(a2));
		System.out.println(max(a3));
		System.out.println(max(a4));
	}
	
	public static int max(int[] a) {
		return max(a, 0);
	}
	
	public static int max(int[] a, int index) {
		if (index == a.length - 1)
			return a[index];
		else
			return Math.max(a[index], max(a, index + 1));
	}
}
