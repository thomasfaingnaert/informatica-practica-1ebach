package lab8;

public class ScoreQuiz {

	public static void main(String[] args) {

		boolean[] in = { true, true, false, false, true };
		boolean[] opl = { true, false, true, false, true };

		System.out.println(score(in, opl));
	}

	public static double score(boolean[] ingediend, boolean[] oplossing) {
		int aantalVragen = ingediend.length;
		int aantalJuisteAntw = 0;

		for (int i = 0; i < aantalVragen; ++i) {
			if (ingediend[i] == oplossing[i])
				++aantalJuisteAntw;
		}

		return (double) aantalJuisteAntw / (double) aantalVragen;
	}
}
