package lab10;

import java.util.*;

public class UniekeWoorden {
	public static void main(String[] args){
		System.out.println(uniekeWoorden(new String[]{"Unieke","woorden","uit","woorden","de","rij","in","de","lijst"}));
	}
	
	public static ArrayList<String> uniekeWoorden(String[] woorden) {
		ArrayList<String> retVal = new ArrayList<String>();
		
		// Itereer over alle items
		for (int i = 0; i < woorden.length; ++i) {
			String woord = woorden[i];
			
			// Controleer of woord al voorkomt
			boolean komtVoor = false;
			for (int j = 0; j < i; ++j) {
				if (woorden[i] == woorden[j]) {
					komtVoor = true;
					break;
				}
			}
			
			// Als het nog niet voorkomt, voeg het toe
			if (!komtVoor)
				retVal.add(woord);
		}
		
		// Return het resultaat
		return retVal;
	}
}

