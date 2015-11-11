package lab10;
import java.util.*;

public class FilterGetallen {
	
	public static void main(String[] args){
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			l.add(i);
		for(int i=10;i>=0;i--)
			l.add(i);
		System.out.println(l);
		filter(l,5,8);
		System.out.println(l);
	}
	
	public static void filter(ArrayList<Integer> l, int min, int max) {
		int i = 0;
		
		while (i < l.size()) {
			int getal = l.get(i).intValue();
			
			if (getal > max || getal < min) {
				l.remove(i);
			} else {
				++i;
			}
		}
	}
}

