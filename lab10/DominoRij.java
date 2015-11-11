package lab10;
import java.util.*;

public class DominoRij {
	public static void main(String[] args){
		int[][] d0={{1,2},{2,0},{0,6}};
		int[][] d1={{6,1},{1,3},{4,3},{5,4},{5,5},{4,4}};
		ArrayList<int[]> a=new ArrayList<int[]>();
		ArrayList<int[]> b=new ArrayList<int[]>();
		for(int[] x:d0)
			a.add(x);
		for(int[] x:d1)
			b.add(x);
		print(a);
		print(b);
		ArrayList<int[]> c=voegSamen(a,b);
		print(c);
	}
	public static void print(ArrayList<int[]> x){
		System.out.print("[");
		for(int[] i:x)
			System.out.print(Arrays.toString(i));
		System.out.println("]");
	}
		
	public static ArrayList<int[]> voegSamen(ArrayList<int[]> a, ArrayList<int[]> b) {
		
		ArrayList<int[]> retVal = a;
		
		for (int[] steen : b) {
			
			int laatsteVanA = retVal.get(retVal.size() - 1)[1];
			int x = steen[0];
			int y = steen[1];
			
			if (laatsteVanA == x) {
				retVal.add(new int[] {x, y});
			}
			else if (laatsteVanA == steen[1]) {
				retVal.add(new int[] {y, x});
			}
			else {
				break;
			}
			
		}
		
		return a;
		
	}
	
}

