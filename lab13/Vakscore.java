package lab13;

import java.util.*;

public class Vakscore {
	private String naam;
	private int max;
	private ArrayList<Integer> scores;

	public Vakscore(String naam, int max) {
		this.naam = naam;
		this.max = max;
		this.scores = new ArrayList<Integer>();
	}

	public Vakscore(String naam) {
		this(naam, 20);
	}

	public boolean voegToe(int score) {
		if (score < 0 || score > max)
			return false;

		scores.add(new Integer(score));
		return true;
	}

	public double gemiddelde() {
		double som = 0.0;
		for (int s : scores)
			som += s;
		return som / scores.size();
	}

	public int[] aantalABC() {
		final double aGrens = .6 * max;
		final double cGrens = .5 * max;
		int[] retVal = new int[3];

		for (int score : scores) {
			if (score >= aGrens)
				++retVal[0]; // A
			else if (score < cGrens)
				++retVal[2]; // C
			else
				++retVal[1]; // B
		}

		return retVal;

	}

	public static void main(String[] args) {
		Vakscore vak = new Vakscore("Informatica");
		for (int i = 0; i < 20; i++)
			vak.voegToe((int) (20.0 * Math.random()));
		System.out.println("Gemiddelde score: " + vak.gemiddelde());
		int[] abc = vak.aantalABC();
		System.out.println("Aantal A-scores: " + abc[0]);
		System.out.println("Aantal B-scores: " + abc[1]);
		System.out.println("Aantal C-scores: " + abc[2]);
	}
}