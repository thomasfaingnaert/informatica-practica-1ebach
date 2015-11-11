package lab8;

import java.util.*;

public class TelWoorden {

	public static void main(String[] args) {

		String[] w = { "en", "de", "het", "we" };
		System.out.println(Arrays.toString(telWoorden(" en. enen de en, hhet", new String[] { "en" })));

	}

	public static int telVoorkomen(String str, String substr) {
		// You just gotta love one-liners like this...
		return (str.length() - str.replace(substr, "").length()) / substr.length();
	}

	public static int[] telWoorden(String zin, String[] woorden) {
		int[] resultaat = new int[woorden.length];

		for (int i = 0; i < woorden.length; ++i) {
			String w = woorden[i];

			// Tel mogelijke manieren waarin woord kan voorkomen
			int mog1 = telVoorkomen(zin, " " + w + " ");
			int mog2 = telVoorkomen(zin, " " + w + ".");
			int mog3 = telVoorkomen(zin, " " + w + ",");

			resultaat[i] = mog1 + mog2 + mog3;
		}

		return resultaat;
	}

}
