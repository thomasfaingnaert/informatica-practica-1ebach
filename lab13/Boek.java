package lab13;

import java.util.*;

public class Boek {
	private String titel;
	private int catalogusnummer;
	private String auteur;
	private boolean uitgeleend;
	private static int aantalUitgeleend;
	
	public Boek(String titel, int catalogusnummer, String auteur) {
		this.titel = titel;
		this.catalogusnummer = catalogusnummer;
		this.auteur = auteur;
		this.uitgeleend = false;
	}
	
	public boolean ontleen() {
		if (uitgeleend) {
			return false;
		}
		else {
			uitgeleend = true;
			++aantalUitgeleend;
			return true;
		}
	}
	
	public boolean brengTerug() {
		if (!uitgeleend) {
			return false;
		}
		else {
			uitgeleend = false;
			--aantalUitgeleend;
			return true;
		}
	}
	
	public boolean isUitgeleend() {
		return uitgeleend;
	}
	
	public static int geefAantalUitgeleend() {
		return aantalUitgeleend;
	}
	
	public String toString() {
		return String.format("[titel='%s', catalogusnr='%d', auteur='%s', uitgeleend='%b']", titel, catalogusnummer, auteur, uitgeleend);
	}
	
	public static void main(String[] args) {
		ArrayList<Boek> l = new ArrayList<Boek>();
		l.add(new Boek("A", 1, "auteur1"));
		l.add(new Boek("B", 2, "auteur2"));
		l.add(new Boek("C", 3, "auteur3"));
		l.add(new Boek("D", 4, "auteur4"));
		l.add(new Boek("E", 5, "auteur5"));
		System.out.println(l);
		l.get(0).ontleen();
		l.get(2).ontleen();
		l.get(0).ontleen();
		System.out.println(l);
		System.out.println("Aantal ontleend: " + Boek.geefAantalUitgeleend());
		l.get(2).brengTerug();
		l.get(3).brengTerug();
		System.out.println(l);
		System.out.println("Aantal ontleend: " + Boek.geefAantalUitgeleend());
	}
}
