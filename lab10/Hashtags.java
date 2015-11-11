package lab10;
import java.util.*;

public class Hashtags {

	public static void main(String[] args){
		System.out.println(hashtags("p#yhyy. a.n .#xgv #evt.a.  ,t#htd,"));
	}

	public static ArrayList<String> hashtags(String s) {
		
		ArrayList<String> retVal = new ArrayList<String>();
		int i = 0;
		
		while (i < s.length()) {
			// Zoek de eerste hashtag vanaf positie i
			int hashtag = s.indexOf('#', i);
			
			// Is er een gevonden?
			if (hashtag == -1)
				break;
			
			// Zoek de positie van het eerste punt of de eerste komma
			int eerstePuntKomma = hashtag + 1;
			for (; eerstePuntKomma < s.length(); ++eerstePuntKomma) {
				char c = s.charAt(eerstePuntKomma);
				if (c == '.' || c == ',' || c == ' ')
					break;
			}
			
			// Druk hashtag af
			if (eerstePuntKomma != s.length()) {
				String hash = s.substring(hashtag + 1, eerstePuntKomma);
				retVal.add(hash);
				i = eerstePuntKomma + 1;
			} else {
				String hash = s.substring(hashtag + 1);
				retVal.add(hash);
				i = s.length();
			}
		}
		
		return retVal;
		
	}

}

