package lab13;

public class FysiekeGrootheid {
	private double waarde;
	private String dimensie;

	public FysiekeGrootheid(String dimensie, double waarde) {
		this.dimensie = dimensie;
		this.waarde = waarde;
	}

	public double getWaarde() {
		return waarde;
	}

	public String getDimensie() {
		return dimensie;
	}

	public void setWaarde(double waarde) {
		this.waarde = waarde;
	}

	public String toString() {
		return String.format("%s[%s]", waarde, dimensie);
	}

	public void telOp(FysiekeGrootheid a) {
		if (dimensie == a.dimensie)
			waarde += a.waarde;
	}

	public static void main(String[] args) {
		FysiekeGrootheid afstand = new FysiekeGrootheid("km", 3.0);
		FysiekeGrootheid tijd = new FysiekeGrootheid("s", 5.2);
		System.out.println("afstand = " + afstand);
		System.out.println("tijd = " + tijd);
		afstand.setWaarde(4.0);
		System.out.println("nieuwe afstand = " + afstand);
		FysiekeGrootheid afstand2 = new FysiekeGrootheid("km", 5.0);
		afstand.telOp(afstand2);
		tijd.telOp(afstand2);
		System.out.println("afstand = " + afstand);
		System.out.println("tijd = " + tijd);
	}
}
