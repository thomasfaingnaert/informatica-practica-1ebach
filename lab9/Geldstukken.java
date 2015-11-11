package lab9;
import java.util.*;

public class Geldstukken {
	public static void main(String[] args) {
		boolean[][] r={	{false,false,true,true,false},
						{true,false,false,false,false},
						{true,true,false,false,false},
						{false,false,false,false,false},
						{false,true,false,true,true},
						{false,true,false,true,true}};
		System.out.println(Arrays.toString(schat(r,2,2)));
		System.out.println(Arrays.toString(schat(r,1,2)));
		System.out.println(Arrays.toString(schat(r,2,1)));
	}
	
	public static int aantalMunten(boolean[][] veld, int m, int n, int x, int y) {
		int aantal = 0;
		
		for (int i = x; i < x + m; ++i) {
			for (int j = y; j < y + n; ++j) {
				if (veld[i][j])
					++aantal;
			}
		}
		
		return aantal;
	}
	
	public static int[] schat(boolean[][] veld, int m, int n) {
		int maxAantal = -1;
		int maxX = -1;
		int maxY = -1;
		
		for (int i = 0; i < veld.length - m + 1; ++i) {
			for (int j = 0; j < veld[0].length - n + 1; ++j) {
				int aantal = aantalMunten(veld, m, n, i, j);
				
				if (aantal > maxAantal) {
					maxAantal = aantal;
					maxX = i;
					maxY = j;
				}
			}
		}
		
		return new int[] {maxX, maxY};
	}
		
}
