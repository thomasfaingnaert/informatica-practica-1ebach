package lab11;

import java.util.ArrayList;

public class Hakken {
	
	public static void main(String[] args) {
		String s = "abcdefghijklm";
		ArrayList<String> l = new ArrayList<String>();
		hakken(s, 3, l);
		System.out.println(l);
		l.clear();
		hakken(s, 1, l);
		System.out.println(l);
		l.clear();
		hakken(s, 5, l);
		System.out.println(l);
		l.clear();
		hakken(s, 4, l);
		System.out.println(l);
	}
	
	public static void hakken(String s, int n, ArrayList<String> l) {
		if (n >= s.length())
			l.add(s);
		else {
			l.add(s.substring(0, n));
			hakken(s.substring(n), n, l);
		}
	}
}
