package lab16;

import java.util.ArrayList;

public class Kassa {
    private ArrayList<Klant> klanten = new ArrayList<>();

    public void registreerKlant(Klant klant) {
        klanten.add(klant);
    }

    public double getKassaInhoud() {
        double som = 0.0;

        for (Klant klant : klanten)
            som += klant.getTotaal();

        return som;
    }

    public static void main(String[] args){
        //double[] aankopen = {100.0, 2000.0, 30.0};
        //Klant k = new Klant("Michiel");

       // for (double aankoop : aankopen) {
         //   k.koop(aankoop);
        //}

        Kassa kassa = new Kassa();
        //kassa.registreerKlant(k);

        System.out.println(kassa.getKassaInhoud());

        /*
        double[] aankopen={100.0,150.0,30.0,27.0};
        Klant jan=new Klant("Jan");
        Groothandelaar paul=new Groothandelaar("Paul");
        DetailKlant annemie=new DetailKlant("Annemie");
        for(double d:aankopen) {
            jan.koop(d);
            paul.koop(d);
            annemie.koop(d);
        }
        Kassa kassa=new Kassa();
        kassa.registreerKlant(jan);
        kassa.registreerKlant(paul);
        kassa.registreerKlant(annemie);

        System.out.println("In kassa :"+kassa.getKassaInhoud());
*/
    }
}