package lab3;

public class OmtrekVeelhoek {
	public static double r = 20.0;
	public static int n = 5;
	public static double omtrek = 0.0;

	public static void main(String[] args) {
		omtrek = 2 * n * r * Math.sin(Math.PI / n);
		System.out.println("Omtrek = " + omtrek);
	}
}
