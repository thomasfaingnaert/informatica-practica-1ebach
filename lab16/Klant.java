package lab16;

import java.util.*;

public class Klant {
    protected String naam;
    protected ArrayList<Double> aankoopbedragen = new ArrayList<>();

    public Klant(String naam) {
        this.naam = naam;
    }

    public void koop(double aankoopsom) {
        aankoopbedragen.add(aankoopsom);
    }

    public double getTotaal() {
        double som = 0.0;

        for (double aankoop : aankoopbedragen)
            som += aankoop;

        return som;
    }

    public static void main(String[] args) {
        double[] aankopen = {100.0, 150.0, 30.0, 27.0};
        Klant jan = new Klant("Jan");
        for (double d : aankopen)
            jan.koop(d);
        System.out.println("Te betalen :" + jan.getTotaal());

    }
}