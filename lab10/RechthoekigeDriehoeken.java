package lab10;
import java.util.*;

public class RechthoekigeDriehoeken {

	public static void main(String[] args){
		System.out.println(zijden(11,24));
		System.out.println(zijden(20,30));
		System.out.println(zijden(161,360));
	}
	
	public static ArrayList<String> zijden(int maxLengte, int omtrek) {
		final double EPSILON = 1e-80;
		ArrayList<String> retVal = new ArrayList<String>();
		
		for (int a = 1; a < maxLengte; ++a) {
			for (int b = a; b < maxLengte; ++b) {
				double derdeZijde = Math.sqrt(a * a + b * b);
				int c = (int)Math.floor(derdeZijde);
				
				// Is de zijde geheel?
				double delta = Math.abs(derdeZijde - c);
				if (delta >= EPSILON)
					continue;
				
				
				// Voldoet het aan de omtrek?
				if (a + b + c != omtrek)
					continue;
				
				// Voeg paar toe
				retVal.add("[" + a + ":" + b + ":" + c + "]");
			}
		}
		
		return retVal;
	}

}

