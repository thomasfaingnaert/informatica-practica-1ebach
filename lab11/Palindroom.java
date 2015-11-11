package lab11;

public class Palindroom {

	public static void main(String[] args) {
		String[] test = { "lepel", "meetsysteem", "meetapparaat", "e", "" };
		for (String i : test)
			System.out.println(i + " : " + isPalindroom(i));

	}

	public static boolean isPalindroom(String s) {
		if (s.length() <= 1)
			return true;
		else
			return (s.charAt(0) == s.charAt(s.length() - 1)) && isPalindroom(s.substring(1, s.length() - 1));
	}
}
