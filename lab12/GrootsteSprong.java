package lab12;

import java.util.ArrayList;

public class GrootsteSprong {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = vulIn(new int[] { 12, 9, 19, 30, 7, 20, 10, 8, 20 });
		ArrayList<Integer> l2 = vulIn(new int[] { 12 });
		ArrayList<Integer> l3 = vulIn(new int[] { 12, 22 });
		ArrayList<Integer> l4 = vulIn(new int[] { 3, 4, 5, -9, -8, -8, -7 });
		System.out.println(grootsteSprong(l1));
		System.out.println(grootsteSprong(l2));
		System.out.println(grootsteSprong(l3));
		System.out.println(grootsteSprong(l4));
	}

	public static ArrayList<Integer> vulIn(int[] a) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i : a)
			l.add(i);
		return l;
	}

	public static int grootsteSprong(ArrayList<Integer> l) {
		// Grootste sprong tot nu toe
		int maxSprong = 0;

		// Itereer over alle koppels
		for (int i = 1; i < l.size(); ++i) {
			int x = l.get(i - 1).intValue();
			int y = l.get(i).intValue();
			int sprong = Math.abs(x - y);

			maxSprong = (sprong > maxSprong) ? sprong : maxSprong;
		}

		// Return resultaat
		return maxSprong;
	}
}
