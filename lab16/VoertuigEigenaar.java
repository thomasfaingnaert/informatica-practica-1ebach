package lab16;

import java.util.*;

public class VoertuigEigenaar extends Persoon {
    private ArrayList<Voertuig> voertuigen = new ArrayList<>();

    public VoertuigEigenaar(String voornaam, String familienaam, char geslacht, int geboortejaar) {
        super(voornaam, familienaam, geslacht, geboortejaar);
    }

    public void koop(Voertuig voertuig) {
        voertuigen.add(voertuig);
    }

    private int zoekVoertuig(Voertuig voertuig) {
        for (int i = 0; i < voertuigen.size(); ++i) {
            Voertuig v = voertuigen.get(i);
            if (v.toString().equals(voertuig.toString()))
                return i;
        }

        return -1;
    }

    public boolean verkoop(Voertuig voertuig) {
        int index = zoekVoertuig(voertuig);

        if (index == -1) {
            return false;
        }
        else {
            voertuigen.remove(index);
            return true;
        }
    }

    public String toString() {
        return String.format("%s:%s", super.toString(), voertuigen.toString());
    }

    public static void main(String[] args) {
        VoertuigEigenaar jan = new VoertuigEigenaar("Jan", "Jansens", 'm', 1970);
        jan.koop(new Voertuig("Audi", "123456"));
        jan.koop(new Voertuig("BMW", "765432"));
        jan.koop(new Voertuig("Trabant", "0001"));
        System.out.println(jan);
        System.out.println(jan.verkoop(new Voertuig("BMW", "765432")));
        System.out.println(jan);
        System.out.println(jan.verkoop(new Voertuig("Audi", "023456")));
        System.out.println(jan);
    }
}
