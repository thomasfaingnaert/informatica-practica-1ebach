package lab3;

public class Rente {
	public static double startKapitaal = 20.0;
	public static double doelKapitaal = 10.0;
	public static double rente = 0.05;
	public static double termijn = 0.0;

	public static void main(String[] args) {
		for (double kapitaal = startKapitaal; kapitaal < doelKapitaal; ++termijn)
			kapitaal *= (1 + rente);
	}
}
