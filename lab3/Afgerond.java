package lab3;

public class Afgerond {
	public static double x = 1.25; // af te ronden getal
	public static int n = 1; // aantal beduidende cijfers na de komma
	public static double afgerond = 0.0;

	public static void main(String[] args) {
		double factor = Math.pow(10.0, n);
		afgerond = Math.round(x * factor) / factor;
	}
}
