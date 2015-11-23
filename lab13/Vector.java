package lab13;

public class Vector {
	private String naam;
	private double x, y, z;

	public Vector(String naam, double x, double y, double z) {
		this.naam = naam;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double norm() {
		return Math.sqrt(x * x + y * y + z * z);
	}

	public double inProduct(Vector v) {
		return x * v.x + y * v.y + z * v.z;
	}

	public Vector uitProduct(Vector v) {
		final String naamRes = String.format("(%sx%s)", naam, v.naam);
		final double xRes = y * v.z - z * v.y;
		final double yRes = z * v.x - x * v.z;
		final double zRes = x * v.y - y * v.x;
		return new Vector(naamRes, xRes, yRes, zRes);
	}

	public void som(Vector v) {
		x += v.x;
		y += v.y;
		z += v.z;
	}

	public String toString() {
		return String.format("{%f, %f, %f}", x, y, z);
	}

	public static void main(String[] args) {
		Vector a = new Vector("a", 1.0, 2.0, 3.0);
		Vector b = new Vector("b", 2.0, -2.0, 1.0);
		System.out.println(a);
		System.out.println(b);
		System.out.println("norm(a)=" + a.norm());
		System.out.println("norm(b)=" + b.norm());
		System.out.println("a.b=" + a.inProduct(b));
		System.out.println("axb=" + a.uitProduct(b));
		System.out.println("(axb).a=" + a.inProduct(a.uitProduct(b)));
		System.out.println("(axb).b=" + b.inProduct(a.uitProduct(b)));
		a.som(b);
		System.out.println("a wordt " + a);
	}
}